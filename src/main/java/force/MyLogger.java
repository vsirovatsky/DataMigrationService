package force;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class MyLogger {

	private MyLogger() {
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	static {
		BasicConfigurator.configure();
	}

	public synchronized static Logger getLogger(Class<?> clientClass, String sufix) {
		return getLogger(clientClass.getName() + "." + sufix);
	}

	public synchronized static Logger getLogger(Class<?> clientClass) {
		return getLogger(clientClass.getName());
	}

	private synchronized static Logger getLogger(String name) {
		return Logger.getLogger(name);
	}
	
}
