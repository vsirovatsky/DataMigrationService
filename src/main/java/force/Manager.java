package force;

import org.apache.axis.AxisFault;

import force.xml.ParametersLoader;


public class Manager {

	public static void main(String[] args) {
		System.out.println("Start");
		Manager manager = new Manager();
		manager.perform();
	}

	private Manager(){
		
	}
	
	private void perform(){
		try {
			String run = ParametersLoader.INSTANCE.getRun();
			if ( "load".equals(run) ) {
				System.out.println("performing load");
				load();
			} else if ( "save".equals(run) ) {
				System.out.println("performing save");
				upload();
			} else if ( "delete".equals(run) ) {
				System.out.println("performing delete");
				delete();
			} else {
				System.out.println("unknown target: " + run);
			}
		} catch (AxisFault af) {
			System.out.println( af.getFaultString() );
			System.out.println( af );
			af.printStackTrace();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	private void delete() throws Throwable{
		//final DataDeleter deleter = new DataDeleter( ConnectionProvider.INSTANCE.getTarget() );
		//deleter.deleteAll();
	}
	
	private void upload() throws Throwable{
		//UploadManager.INSTANCE.upload();
	}

	private void load() throws Throwable {
		//LoadManager.INSTANCE.load();
	}
}
