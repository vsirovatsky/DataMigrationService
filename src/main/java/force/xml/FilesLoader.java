package force.xml;

import java.io.File;

import force.MyLogger;

public class FilesLoader {
	
	private static final String LOGIN_XML_FILE_NAME = "credentials.xml";
	
	private static final String CONFIG_XML_FILE_NAME = "config.xml";

	private static final org.apache.log4j.Logger logger = MyLogger.getLogger(FilesLoader.class);

	private static final String fsep = System.getProperty("file.separator");

	private static final String bdir = System.getProperty("user.dir");
	
	public static final FilesLoader INSTANCE = new FilesLoader();

	private FilesLoader(){}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public File getLoginXML() {
		return new File(bdir + fsep + LOGIN_XML_FILE_NAME);
	}
	
	public File getConfigXML() {
		return new File(bdir + fsep + CONFIG_XML_FILE_NAME);
	}
}
