package force.upload;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import ui.save.ObjectsSaveSelection;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ConnectionData;
import force.ITraceReciever;
import force.ObjectsUtils;
import force.fObject.RPCElementBuilder;
import force.fObject.fObject;
import force.load.DataLoadedSaver;
import force.upload.insufficient.InsufficientGeatherer;
import force.upload.order.UploadOrder;
import force.util.ClassUtils;
import force.util.ListUtils;
import force.xls.XLSReader;

public class UploadManager {

	public static final UploadManager INSTANCE = new UploadManager();

	// private SaveConfig saveConfig = null;

	private DataUploader uploader = null;

	private XLSReader reader = null;

	private final Hashtable<String, UploadingDataStorage> storedInfo = new Hashtable<String, UploadingDataStorage>();

	public UploadManager( DataUploader uploader ) {
		this.uploader = uploader;
	}
	
	public UploadManager() {
		/*
		 * try { //saveConfig = ParametersLoader.INSTANCE.getSaveConfig();
		 * //reader = new XLSReader(ParametersLoader.INSTANCE.getFile());
		 * //uploader = new
		 * DataUploader(ConnectionProvider.INSTANCE.getTarget()); } catch
		 * (Exception e) { e.printStackTrace(); }
		 */
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public void upload_old_proper(ConnectionData connectionData,
			String fileName, ObjectsSaveSelection objectsSelection,
			ITraceReciever trace) throws Throwable {
		final List<String> classes = objectsSelection.getSelected();
		if (ListUtils.isEmptySafe(classes)) {
			trace.println("to save is empty");
			return;
		}

		final FieldsForceValues forcedValues = new FieldsForceValues();

		final DependenciesManager depManager = new DependenciesManager(
				connectionData.getStub(), objectsSelection);
		this.uploader = new DataUploader(connectionData);

		this.reader = new XLSReader(fileName);
		final FieldsToSaveContainer container = new FieldsToSaveContainer(
				connectionData.getStub(), objectsSelection);

		final List<fObject> allData = new ArrayList<fObject>();
		for (String className : classes) {
			List<fObject> data = this.reader.readData(className)
					.generateObjects(container, forcedValues, trace);
			if (data != null) {
				allData.addAll(data);
				storedInfo.put(className, new UploadingDataStorage());
			}
		}

		final UploadOrder orderer = new UploadOrder(classes, allData,
				depManager.getDeps());
		if (orderer != null) {
			for (fObject o : orderer.get()) {
				trace.println(o.getName() + "(" + o.getId() + ")");
			}
			// return;
		}
		List<fObject> order = orderer.get();
		InsufficientGeatherer insufficient = orderer.getInsufficientGeatherer();
		insufficient.printSelf(trace);
		if (insufficient.isInsufficient()) {
			trace.println("Insufficient");
			// return;
		} else {
			trace.println("All sufficient");
		}

		// if ( true ) {
		// return;
		// }

		// ZOBO: other mass variant:
		List<fObject> localSubSet = new ArrayList<fObject>();
		Integer count = 0;
		Integer globalCount = 0;
		for (fObject obj : order) {
			count++;
			globalCount++;
			if (count < 201) {
				if (!updateReferences(obj, obj.getName(), storedInfo,
						objectsSelection, depManager)) {
					System.out.println("skipped sObject: " + obj.getId());
					count--;
				} else {
					localSubSet.add(obj);
				}
				if (globalCount < order.size()) {
					continue;
				}
			} else {
				count = 0;
			}
			List<String> oldIdsCloned = new ArrayList<String>();
			Hashtable<String, String> objNames = new Hashtable<String, String>();
			for (fObject f : localSubSet) {
				String locId = new String(f.getId());
				oldIdsCloned.add(locId);
				objNames.put(locId, f.getName());
			}
			List<String> newIds = uploader.saveGetIds(localSubSet, trace);
			for (Integer i = 0; i < localSubSet.size(); i++) {
				String oldId = oldIdsCloned.get(i);
				String newId = newIds.get(i);
				String name = objNames.get(oldId);
				storedInfo.get(name).put(oldId, newId);
			}
		}

		// ZOBO: one-by-one variant
		if (false) {
			for (fObject obj : order) {
				if (!updateReferences(obj, obj.getName(), storedInfo,
						objectsSelection, depManager)) {
					System.out.println("skipped sObject: " + obj.getId());
					continue;
				}
				String oldIdCloned = new String(obj.getId());
				String newId = uploader.saveGetId(obj, trace);
				if (newId != null) {
					storedInfo.get(obj.getName()).put(oldIdCloned, newId);
				}
			}
		}

		ErrorGeatherer.INSTANCE.println();

		/*
		 * for (String className : classes ) { List<fObject> data =
		 * this.reader.readData( className ).generateObjects( container, trace
		 * ); if ((data != null) && (!data.isEmpty())) { UploadingDataStorage
		 * storage = new UploadingDataStorage(); storedInfo.put(className,
		 * storage); for (fObject fObject : data) { if
		 * (!updateReferences(fObject, className, storedInfo, objectsSelection,
		 * depManager)){ System.out.println( "skipped sObject: " +
		 * fObject.getId() ); continue; } String oldIdCloned = new
		 * String(fObject.getId()); String newId = uploader.saveGetId(fObject,
		 * trace); if (newId != null) { storage.put(oldIdCloned, newId); } } } }
		 */
	}

	public void upload(ConnectionData connectionData, String fileName,
			ObjectsSaveSelection objectsSelection, ITraceReciever trace)
			throws Throwable {
		final List<String> classes = objectsSelection.getSelected();
		if (ListUtils.isEmptySafe(classes)) {
			trace.println("to save is empty");
			return;
		}

		final FieldsForceValues forcedValues = new FieldsForceValues();

		final DependenciesManager depManager = new DependenciesManager(
				connectionData.getStub(), objectsSelection);
		this.uploader = new DataUploader(connectionData);

		this.reader = new XLSReader(fileName);
		final FieldsToSaveContainer container = new FieldsToSaveContainer(
				connectionData.getStub(), objectsSelection);

		uploadOneClass("Pathfinder__Question_Category__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Answer_Type__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Question__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Plan_Type__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Plan_Subtype__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Plan_Questionnaire__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Plan_Questionnaire_Question_Record__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Account", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Contact", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Questionairre__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Account_data__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Pathfinder__Answer__c", objectsSelection, depManager,
				forcedValues, container, trace);
		
		/*uploadOneClass("Category__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Funds__c", objectsSelection, depManager,
				forcedValues, container, trace);

		uploadOneClass("PlanSponsors__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Search__c", objectsSelection, depManager,
				forcedValues, container, trace);
		
		uploadOneClass("Portfolio__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Portfolio_Junction__c", objectsSelection, depManager,
				forcedValues, container, trace);

		uploadOneClass("Product__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("My_Proposal_Requests__c", objectsSelection, depManager,
				forcedValues, container, trace);

		uploadOneClass("AdminCost__c", objectsSelection, depManager,
				forcedValues, container, trace);
		uploadOneClass("Generic_Comp__c", objectsSelection, depManager,
				forcedValues, container, trace);*/
		
		/*uploadOneClass("Case", objectsSelection, depManager,
				forcedValues, container, trace);*/

		
		ErrorGeatherer.INSTANCE.println();
	}
	
	private static int timeCounter = 0;

	private void uploadOneClass(String className,
			ObjectsSaveSelection objectsSelection,
			DependenciesManager depManager, FieldsForceValues forcedValues,
			FieldsToSaveContainer container, ITraceReciever trace)
			throws Throwable {
		List<fObject> data = this.reader.readData(className).generateObjects(
				container, forcedValues, trace);
		if ( className.equals("Pathfinder__Answer__c") ) {
			List<fObject> data2 = this.reader.readData("Pathfinder__Answer__c__n").generateObjects(
					container, forcedValues, trace);
			data.addAll( data2 );
		}
		if (data == null) {
			return;
		}
		
		// allData.addAll( data );
		storedInfo.put(className, new UploadingDataStorage());
		List<String> classesOne = new ArrayList<String>();
		classesOne.add(className);
		UploadOrder orderer = new UploadOrder(classesOne, data, depManager
				.getDeps());

		List<List<fObject>> orderTop = null;

		if ( className.equals("Pathfinder__Question__c") ) {
			orderTop = orderer.getByStages();
		} else {
			orderTop = new ArrayList<List<fObject>>();
			orderTop.add(orderer.get());
		}
		trace.println("Uploading class: " + className);
		InsufficientGeatherer insufficient = orderer.getInsufficientGeatherer();
		//insufficient.printSelf(trace);
		if (insufficient.isInsufficient()) {
			trace.println("Insufficient");
		} else {
			trace.println("All sufficient");
		}
		if ( false ) {
			return;
		}
		trace.println("All data: " + data.size());
		int c = 0;
		for (List<fObject> order : orderTop){
			trace.println("next: " + order.size());
			c += order.size();
		}
		trace.println("All taken: " + c);

		for (List<fObject> order : orderTop) {
			List<fObject> localSubSet = new ArrayList<fObject>();
			Integer count = 0;
			Integer globalCount = 0;
			for (fObject obj : order) {
				count++;
				globalCount++;
				if (updateReferences(obj, obj.getName(), storedInfo,
						objectsSelection, depManager)) {
					localSubSet.add(obj);
				} else {
					System.out.println("skipped sObject: " + obj.getId());
					count--;					
				}
				if ( (count < 200) && (globalCount < order.size()) ) {
					continue;
				} else {
					count = 0;
				}	
				List<String> oldIdsCloned = new ArrayList<String>();
				Hashtable<String, String> objNames = new Hashtable<String, String>();
				for (fObject f : localSubSet) {
					if ( f.getId() == null ) {
						System.out.println("f with null: " + f.toString());
					}
					String locId = new String(f.getId());
					oldIdsCloned.add(locId);
					objNames.put(locId, f.getName());
				}
				List<String> newIds = uploader.saveGetIds(localSubSet, trace);
				for (Integer i = 0; i < localSubSet.size(); i++) {
					String oldId = oldIdsCloned.get(i);
					String newId = newIds.get(i);
					String name = objNames.get(oldId);
					storedInfo.get(name).put(oldId, newId);
				}
				localSubSet = new ArrayList<fObject>();
				timeCounter++;
				trace.println("timeCounter: " + timeCounter);
			}
		}
	}
	
	public void uploadOneClassFromSavedData(String className,
			ObjectsSaveSelection objectsSelection,
			DependenciesManager depManager, FieldsForceValues forcedValues,
			FieldsToSaveContainer container, DataLoadedSaver saver, ITraceReciever trace)
			throws Throwable {
		List<fObject> data = new ArrayList<fObject>( saver.getObjects(className).values() );
		storedInfo.put(className, new UploadingDataStorage());
		List<String> classesOne = new ArrayList<String>();
		classesOne.add(className);
		UploadOrder orderer = new UploadOrder(classesOne, data, depManager
				.getDeps());

		List<List<fObject>> orderTop = null;

		//if ( className.equals("Pathfinder__Question__c") ) {
			orderTop = orderer.getByStages();
		//} else {
		//	orderTop = new ArrayList<List<fObject>>();
		//	orderTop.add(orderer.get());
		//}
		trace.println("Uploading class: " + className);
		InsufficientGeatherer insufficient = orderer.getInsufficientGeatherer();
		//insufficient.printSelf(trace);
		if (insufficient.isInsufficient()) {
			trace.println("Insufficient");
		} else {
			trace.println("All sufficient");
		}
		if ( false ) {
			return;
		}
		trace.println("All data: " + data.size());
		int c = 0;
		for (List<fObject> order : orderTop){
			trace.println("next: " + order.size());
			c += order.size();
		}
		trace.println("All taken: " + c);

		for (List<fObject> order : orderTop) {
			List<fObject> localSubSet = new ArrayList<fObject>();
			Integer count = 0;
			Integer globalCount = 0;
			for (fObject obj : order) {
				count++;
				globalCount++;
				if (updateReferences(obj, obj.getName(), storedInfo,
						objectsSelection, depManager)) {
					localSubSet.add(obj);
				} else {
					System.out.println("skipped sObject: " + obj.getId());
					count--;					
				}
				if ( (count < 200) && (globalCount < order.size()) ) {
					continue;
				} else {
					count = 0;
				}	
				List<String> oldIdsCloned = new ArrayList<String>();
				Hashtable<String, String> objNames = new Hashtable<String, String>();
				for (fObject f : localSubSet) {
					if ( f.getId() == null ) {
						System.out.println("f with null: " + f.toString());
					}
					String locId = new String(f.getId());
					oldIdsCloned.add(locId);
					objNames.put(locId, f.getName());
				}
				List<String> newIds = uploader.saveGetIds(localSubSet, trace);
				for (Integer i = 0; i < localSubSet.size(); i++) {
					String oldId = oldIdsCloned.get(i);
					String newId = newIds.get(i);
					String name = objNames.get(oldId);
					System.out.println("name: " + name);
					UploadingDataStorage uds = storedInfo.get(name); 
					uds.put(oldId, newId);
				}
				localSubSet = new ArrayList<fObject>();
				timeCounter++;
				trace.println("timeCounter: " + timeCounter);
			}
		}
	}

	private static boolean updateReferences(fObject object,
			String classBaseName,
			Hashtable<String, UploadingDataStorage> storedInfo,
			ObjectsSaveSelection objectsSelection,
			DependenciesManager depManager) throws ClassNotFoundException {
		final Dependency dep = depManager.getStraightDependency(classBaseName);
		if ((dep == null) || !dep.isValid()) {
			return true;
		}
		boolean result = true;
		// Class<? extends SObject> clazz =
		// ClassUtils.INSTANCE.get(classBaseName);
		final List<DependencyNode> masterRefs = dep.getNodes();
		if ((masterRefs != null) && (!masterRefs.isEmpty())) {
			for (DependencyNode node : masterRefs) {
				System.out.println("node : " + node);
				/*
				 * String forcedValue = ref.getValue(masterRef); if (forcedValue
				 * != null) { try { setForcedValue(object, clazz, masterRef,
				 * forcedValue); } catch (SecurityException e) {
				 * e.printStackTrace(); } catch (IllegalArgumentException e) {
				 * e.printStackTrace(); } catch (NoSuchMethodException e) {
				 * e.printStackTrace(); } catch (IllegalAccessException e) {
				 * e.printStackTrace(); } catch (InvocationTargetException e) {
				 * e.printStackTrace(); } } else {
				 */
				String className = node.getTargetClassName();
				// Class<? extends SObject> referencedClazz =
				// ClassUtils.INSTANCE.get(className);
				UploadingDataStorage storage = storedInfo.get(className);
				if (storage != null) {
					String field = node.getFieldName();
					String oldId = object.getValue(field);
					final String newId = storage.getNewId(oldId);
					if (newId != null) {
						object.set(field, newId);
					}
					/*
					 * try { if (!resetValue(object, clazz, storage, node)) {
					 * //result = false; } } catch (SecurityException e) {
					 * e.printStackTrace(); } catch (IllegalArgumentException e)
					 * { e.printStackTrace(); } catch (NoSuchMethodException e)
					 * { e.printStackTrace(); } catch (IllegalAccessException e)
					 * { e.printStackTrace(); } catch (InvocationTargetException
					 * e) { e.printStackTrace(); }
					 */
				} else {
					System.out.println("No storage for : " + className);
				}
				// }
			}
		}
		/*
		 * final List<String> nonMasterRefs = ref.getNonMasterReferences(); if
		 * ((nonMasterRefs != null) && (!nonMasterRefs.isEmpty())) { // TODO:
		 * Implement non master references setting }
		 */
		return result;
	}

	private static void setForcedValue(SObject object,
			Class<? extends SObject> clazz, String field, String value)
			throws SecurityException, NoSuchMethodException,
			IllegalArgumentException, IllegalAccessException,
			InvocationTargetException {
		final String setString = ObjectsUtils.buildSetMethod(field);
		final Method setM = clazz.getMethod(setString, String.class);
		setM.invoke(object, value);
	}

	private static boolean resetValue(SObject object,
			Class<? extends SObject> clazz, UploadingDataStorage storage,
			DependencyNode node) throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		final String getString = ObjectsUtils.buildGetMethod(node
				.getFieldName());
		final String setString = ObjectsUtils.buildSetMethod(node
				.getFieldName());
		final Method getM = clazz.getMethod(getString, null);
		final Method setM = clazz.getMethod(setString, String.class);
		final String oldId = (String) getM.invoke(object);
		if ((oldId == null) || ("null".equalsIgnoreCase(oldId))) {
			return false;
		}
		final String newId = storage.getNewId(oldId);
		if (newId != null) {
			System.out.println("oldId : " + oldId + ",  newId : " + newId);
			setM.invoke(object, newId);
			return true;
		} else {
			return false;
		}
	}
}
