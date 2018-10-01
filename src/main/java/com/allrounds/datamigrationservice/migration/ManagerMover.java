package com.allrounds.datamigrationservice.migration;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.AxisFault;

import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

//import ui.MainTabFolder;
import ui.load.ObjectsLoadSelection;
import ui.save.ObjectsSaveSelection;
import force.ConnectionData;
import force.ConnectionProvider;
import force.ITraceReciever;
import force.LoginData;
import force.custom.IScenario;
import force.custom.ScenarioManager;
import force.describe.ClassesObtainer;
import force.describe.FieldsObtainer;
import force.describe.ClassesObtainer.AvailableToLoadClasses;
import force.fObject.fObject;
import force.fObject.fObjectsSet;
import force.load.DataLoadedSaver;
import force.load.DataLoader;
import force.load.DependenciesManager;
import force.load.LoadManager;
import force.load.QueryCalculator;
import force.upload.DataUploader;
import force.upload.FieldsForceValues;
import force.upload.FieldsToSaveContainer;
import force.upload.UploadManager;
import force.util.ListUtils;
import force.xls.XLSReader;
import force.xml.ParametersLoader;

public class ManagerMover {

	public static final ManagerMover INSTANCE = new ManagerMover();

	private ConnectionData connectionLoad = null;

	private ConnectionData connectionSave = null;
	
	private ConnectionData connectionCustom = null;

	private ManagerMover() {}

	public void disconnectLoad() {
		this.connectionLoad = null;
	}

	public void disconnectSave() {
		this.connectionSave = null;
	}
	
	public void disconnectCustom() {
		this.connectionCustom = null;
	}

	public void connectLoad(String login, String password) throws Throwable {
		LoginData loginData = new LoginData(login, password);
		//try {
			connectionLoad = ConnectionProvider.INSTANCE
					.initConnectionData(loginData);
			ConnectionProvider.INSTANCE.setSource(connectionLoad);
		//} catch (Throwable e) {
		//	e.printStackTrace();
		//}
	}

	public void connectSave(String login, String password) throws Throwable {
		LoginData loginData = new LoginData(login, password);
		//try {
			connectionSave = ConnectionProvider.INSTANCE
					.initConnectionData(loginData);
			ConnectionProvider.INSTANCE.setSource(connectionSave);
		//} catch (Throwable e) {
		//	e.printStackTrace();
		//}
	}

	public boolean isConnectedLoad() {
		return (this.connectionLoad != null);
	}

	public boolean isConnectedSave() {
		return (this.connectionSave != null);
	}

	/*public void delete(final ITraceReciever traceReciever,
			final ObjectsSaveSelection objectsSelection) {
		Thread t = new Thread() {

			@Override
			public void run() {
				try {
					final DataDeleter deleter = new DataDeleter(connectionSave,
							traceReciever);
					deleter.deleteAll(objectsSelection.getSelected());
				} catch (Throwable e) {
					traceReciever.println(e.getMessage());
					e.printStackTrace();
				}
			}
		};
		t.start();
	}*/
	
	public DataLoadedSaver loadData( final ITraceReciever trace, final String capId ) throws Exception {
        final DataLoader loader = new DataLoader( this.connectionLoad );
        final DataLoadedSaver saver = new DataLoadedSaver( trace );
        FieldsObtainer fieldsObtainer = new FieldsObtainer( this.connectionLoad.getStub() );
        String className = "CapMan__Capitalization__c";
        List<String> fields = fieldsObtainer.getFieldsToLoad(className);
       	if ( ListUtils.isEmptySafe( fields )) {
       		trace.println("No included fields for class : " + className);
        	return null;
        }
        String query = QueryCalculator.calculate(className, fields);
        query += " WHERE Id = '" + capId + "'";
        try {
        	fObjectsSet objectsSet = loader.loadObjects(query, trace);
        	if ( !objectsSet.isValid() ) {
        		trace.println("objectsSet is non valid");
        		return null;
        	}
        	saver.saveLoaded(className, objectsSet);
        	
        	String accId = objectsSet.getObjects().get(0).getValue("CapMan__Company__c");
        	if ( accId != null ) {
        		className = "Account";
        		fields = fieldsObtainer.getFieldsToLoad(className);
        		query = QueryCalculator.calculate(className, fields);
        		query += " WHERE Id = '" + accId + "'";
        		objectsSet = loader.loadObjects(query, trace);
        		if ( objectsSet.isValid() ) {
        			saver.saveLoaded(className, objectsSet);
        		}
        	}
        	
        	className = "CapMan__Security__c";
        	fields = fieldsObtainer.getFieldsToLoad(className);
        	query = QueryCalculator.calculate(className, fields);
        	query += " WHERE CapMan__Issuer__c = '" + capId + "'";
        	objectsSet = loader.loadObjects(query, trace);
        	/*if ( !objectsSet.isValid() ) {
        		trace.println("objectsSet is null for: " + query);
        		return null;
        	}*/
        	saver.saveLoaded(className, objectsSet);
        	
        	className = "CapMan__Issuance__c";
        	fields = fieldsObtainer.getFieldsToLoad(className);
        	query = QueryCalculator.calculate(className, fields);
        	query += " WHERE CapMan__Capitalization__c = '" + capId + "'";
        	objectsSet = loader.loadObjects(query, trace);
        	/*if ( !objectsSet.isValid() ) {
        		trace.println("objectsSet is null for: " + query);
        		return null;
        	}*/
        	saver.saveLoaded(className, objectsSet);

        	className = "CapMan__SecurityTransaction__c";
        	fields = fieldsObtainer.getFieldsToLoad(className);
        	query = QueryCalculator.calculate(className, fields);
        	query += " WHERE CapMan__Capitalization__c = '" + capId + "'";
        	objectsSet = loader.loadObjects(query, trace);
        	if ( objectsSet.isValid() ) {
        		for ( fObject f : objectsSet.getObjects() ) {
        			f.removeValue("");
        		}
        	}
        	/*if ( !objectsSet.isValid() ) {
        		trace.println("objectsSet is null for: " + query);
        		return null;
        	}*/
        	saver.saveLoaded(className, objectsSet);

        } catch (AxisFault af) {
        	System.out.println(af.getFaultString());
        	trace.error( af.getMessage() );
        	trace.error( af.getFaultString() );
			System.out.println(af);
			af.printStackTrace();
		} catch (Throwable e) {
			trace.error( e.getMessage() );
			e.printStackTrace();
		}
		trace.println( saver.toString() );
       	return saver;
	}
	
	public void saveData( final ITraceReciever trace, final DataLoadedSaver saver ) throws Throwable {
        //ClassesObtainer classesObtainer = new ClassesObtainer( this.connectionSave.getStub() );
        //ClassesObtainer.AvailableToLoadClasses classes = classesObtainer.getAvailableToLoadClasses();
        /*for (String s : classes.getStandard() ) {
        	trace.println("STANDARD CLASS : " + s);
        }
        for (String s : classes.getCustom() ) {
        	trace.println("CUSTOM CLASS : " + s);
        }*/
        ObjectsSaveSelection selection = new ObjectsSaveSelection();
        FieldsObtainer fieldsObtainer = new FieldsObtainer( this.connectionSave.getStub() );

        selection.addToSelected("Account");
        List<String> fieldsAccs = fieldsObtainer.getFieldsToSave("Account");
        selection.setFields("Account", fieldsAccs);
        saver.setAllowedFields("Account", fieldsAccs);

        selection.addToSelected("CapMan__Capitalization__c");
        List<String> fieldsCaps = fieldsObtainer.getFieldsToSave("CapMan__Capitalization__c");
        selection.setFields("CapMan__Capitalization__c", fieldsCaps);
        saver.setAllowedFields("CapMan__Capitalization__c", fieldsCaps);

        selection.addToSelected("CapMan__Security__c");
        List<String> fieldsSecurities = fieldsObtainer.getFieldsToSave("CapMan__Security__c");
        selection.setFields("CapMan__Security__c", fieldsSecurities);
        saver.setAllowedFields("CapMan__Security__c", fieldsSecurities);

        selection.addToSelected("CapMan__Issuance__c");
        List<String> fieldsIssuances = fieldsObtainer.getFieldsToSave("CapMan__Issuance__c");
        selection.setFields("CapMan__Issuance__c", fieldsIssuances);
        saver.setAllowedFields("CapMan__Issuance__c", fieldsIssuances);

        selection.addToSelected("CapMan__SecurityTransaction__c");
        List<String> fieldsSecurityTransactions = fieldsObtainer.getFieldsToSave("CapMan__SecurityTransaction__c");
        selection.setFields("CapMan__SecurityTransaction__c", fieldsSecurityTransactions);
        saver.setAllowedFields("CapMan__Issuance__c", fieldsSecurityTransactions);

		final FieldsForceValues forcedValues = new FieldsForceValues();

		final force.upload.DependenciesManager depManager = new force.upload.DependenciesManager(
				this.connectionSave.getStub(), selection);
		final DataUploader uploader = new DataUploader( this.connectionSave );
		final FieldsToSaveContainer container = new FieldsToSaveContainer(
				this.connectionSave.getStub(), selection);
		UploadManager uManager = new UploadManager( uploader );
		uManager.uploadOneClassFromSavedData("Account", selection, depManager, forcedValues, container, saver, trace);
		uManager.uploadOneClassFromSavedData("CapMan__Capitalization__c", selection, depManager, forcedValues, container, saver, trace);
		uManager.uploadOneClassFromSavedData("CapMan__Security__c", selection, depManager, forcedValues, container, saver, trace);
		uManager.uploadOneClassFromSavedData("CapMan__Issuance__c", selection, depManager, forcedValues, container, saver, trace);
		uManager.uploadOneClassFromSavedData("CapMan__SecurityTransaction__c", selection, depManager, forcedValues, container, saver, trace);
	}

	public void moveData(final ITraceReciever trace,
			final String capId) {
		//Thread t = new Thread() {

		//	@Override
		//	public void run() {
				try {
					final DataLoadedSaver saver = loadData(trace, capId);
					trace.println( saver.toString() );
					saveData(trace, saver);
				} catch (AxisFault af) {
					System.out.println(af.getFaultString());
					System.out.println(af);
					trace.error( af.getMessage() );
					trace.error( af.getFaultString() );
					af.printStackTrace();
				} catch (Throwable e) {
					e.printStackTrace();
					trace.error( e.getMessage() );
				}
		//	}
		//};
		//t.start();
	}
	
	/*public void customPerform(final String fileName, final ITraceReciever trace) {
		trace.println("New CUSTOM");
		Thread t = new Thread() {

			@Override
			public void run() {
				try {
					IScenario scen = ScenarioManager.INSTANCE.get( ScenarioManager.INVESTOR_SCENARIO );
					scen.perform(ManagerGUI.this.connectionCustom, fileName, trace);
				} catch (AxisFault af) {
					System.out.println(af.getFaultString());
					System.out.println(af);
					af.printStackTrace();
				} catch (Throwable e) {
					e.printStackTrace();
				}
			}
		};
		t.start();
	}

	public void load(final String fileName, final ITraceReciever trace,
			final ObjectsLoadSelection objectsSelection) {
		if (!objectsSelection.isSelectedPresent()) {
			trace.println("nothing selected");
			return;
		} else {
			trace.println("New LOAD");
			trace.println(objectsSelection.getSelectedToPrint());
		}
		Thread t = new Thread() {

			@Override
			public void run() {
				try {
					LoadManager.INSTANCE.load(ManagerGUI.this.connectionLoad,
							objectsSelection, fileName, trace);
					trace.println("Loaded");
				} catch (AxisFault af) {
					trace.println(af.getFaultString());
					trace.println(af.getMessage());
					af.printStackTrace();
				} catch (Throwable e) {
					trace.println(e.getMessage());
					e.printStackTrace();
				}
			}

		};
		t.start();
	}
*/
	public AvailableToLoadClasses getAvailableToLoadClasses() throws AxisFault,
			RemoteException {
		if (isConnectedLoad()) {
			ClassesObtainer obt = new ClassesObtainer(this.connectionLoad
					.getStub());
			return obt.getAvailableToLoadClasses();
		} else {
			return null;
		}
	}

	public XLSReader getReader(String fileName)
			throws AxisFault, RemoteException {
		final XLSReader reader = new XLSReader( fileName );
		return reader;
	}
	
	public List<String> getFieldsToLoadForClass( String className ) {
		if ( className == null ) {
			return null;
		}
		final FieldsObtainer obtainer = new FieldsObtainer( this.connectionLoad.getStub() );
		try {
			return obtainer.getFieldsToLoad( className );
		} catch (UnexpectedErrorFault e) {
			//MainTabFolder.INSTANCE.getTrace().error(e.getMessage());
			//MainTabFolder.INSTANCE.getTrace().error(e.getFaultString());
			e.printStackTrace();
		} catch (AxisFault e) {
			//MainTabFolder.INSTANCE.getTrace().error(e.getMessage());
			//MainTabFolder.INSTANCE.getTrace().error(e.getFaultString());
			e.printStackTrace();
		} catch (RemoteException e) {
			//MainTabFolder.INSTANCE.getTrace().error(e.getMessage());
			e.printStackTrace();
		}
		return null;
	}

	public List<String> getFieldsToSaveForClass(String className) {
		return null;
	}
	
	public void test() throws AxisFault, RemoteException{
        //ClassesObtainer classesObtainer = new ClassesObtainer( this.connectionLoad.getStub() );
        //ClassesObtainer.AvailableToLoadClasses classes = classesObtainer.getAvailableToLoadClasses();
        //for (String s : classes.getStandard() ) {
        //	System.out.println("STANDARD CLASS : " + s);
        //}
        //for (String s : classes.getCustom() ) {
        //	System.out.println("CUSTOM CLASS : " + s);
        //}
		FieldsObtainer fieldsObtainer = new FieldsObtainer( this.connectionSave.getStub() );
		List<String> fieldsCaps = fieldsObtainer.getFieldsToSave("capman__capitalization__c");
		for ( String s : fieldsCaps ) {
			System.out.println( s );
		}
	}
	
	public static void main(String[] args) throws Throwable {
		ManagerMover.INSTANCE.connectLoad("vsirovatsky@gmail.com","password11VRKtxc6IEZTNhVsFVGvIIIvEV");
		//ManagerMover.INSTANCE.connectLoad("vitalyfun@all-rounds.com","mypassword12BEEqWyOezu2kXkiHT5mOQw2s");
		//ManagerMover.INSTANCE.connectLoad("vsirovatsky@gmail.com","password11VRKtxc6IEZTNhVsFVGvIIIvEV");
		//ManagerMover.INSTANCE.connectSave("vitalyfun@all-rounds.com","mypassword12BEEqWyOezu2kXkiHT5mOQw2s");
		//ManagerMover.INSTANCE.test();
		//ManagerMover.INSTANCE.moveData(new WebTraceReceiver(), "a02A0000001WA02");
	}
}