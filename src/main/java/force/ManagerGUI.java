package force;

import java.rmi.RemoteException;
import java.util.List;

import org.apache.axis.AxisFault;

import com.sforce.soap.enterprise.fault.UnexpectedErrorFault;

//import ui.MainTabFolder;
import ui.load.ObjectsLoadSelection;
import ui.save.ObjectsSaveSelection;
import force.custom.IScenario;
import force.custom.ScenarioManager;
import force.describe.ClassesObtainer;
import force.describe.FieldsObtainer;
import force.describe.ClassesObtainer.AvailableToLoadClasses;
import force.load.LoadManager;
import force.upload.UploadManager;
import force.xls.XLSReader;
import force.xml.ParametersLoader;

public class ManagerGUI {

	public static final ManagerGUI INSTANCE = new ManagerGUI();

	private ConnectionData connectionLoad = null;

	private ConnectionData connectionSave = null;
	
	private ConnectionData connectionCustom = null;

	private ManagerGUI() {
	}

	public void disconnectLoad() {
		this.connectionLoad = null;
	}

	public void disconnectSave() {
		this.connectionSave = null;
	}
	
	public void disconnectCustom() {
		this.connectionCustom = null;
	}

	public void connectLoad(String login, String password) {
		LoginData loginData = new LoginData(login, password);
		try {
			connectionLoad = ConnectionProvider.INSTANCE
					.initConnectionData(loginData);
			ConnectionProvider.INSTANCE.setSource(connectionLoad);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void connectSave(String login, String password) {
		LoginData loginData = new LoginData(login, password);
		try {
			connectionSave = ConnectionProvider.INSTANCE
					.initConnectionData(loginData);
			ConnectionProvider.INSTANCE.setSource(connectionSave);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public void connectCustom(String login, String password) {
		LoginData loginData = new LoginData(login, password);
		try {
			connectionCustom = ConnectionProvider.INSTANCE
					.initConnectionData(loginData);
			ConnectionProvider.INSTANCE.setSource(connectionCustom);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

	public boolean isConnectedLoad() {
		return (this.connectionLoad != null);
	}

	public boolean isConnectedSave() {
		return (this.connectionSave != null);
	}

	public boolean isConnectedCustom() {
		return (this.connectionCustom != null);
	}

	public LoginData getConnectionLoadFromFile() {
		return ParametersLoader.INSTANCE.getSource();
	}

	public LoginData getConnectionSaveFromFile() {
		return ParametersLoader.INSTANCE.getTarget();
	}

	public void delete(final ITraceReciever traceReciever,
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
	}

	public void upload(final String fileName, final ITraceReciever trace,
			final ObjectsSaveSelection objectsSelection) {
		if (!objectsSelection.isSelectedPresent()) {
			trace.println("nothing selected");
			return;
		} else {
			trace.println("New UPLOAD");
			trace.println(objectsSelection.getSelectedToPrint());
		}
		Thread t = new Thread() {

			@Override
			public void run() {
				try {
					UploadManager.INSTANCE.upload(
							ManagerGUI.this.connectionSave, fileName,
							objectsSelection, trace);
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
	
	public void customPerform(final String fileName, final ITraceReciever trace) {
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
}
