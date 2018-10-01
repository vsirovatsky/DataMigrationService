package force.xml;

import java.io.File;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import force.LoginData;
import force.MyLogger;

public class ParametersLoader {

	//public static final String FILE_NAME = "/home/zobo/1/1.xls";

	private static final String PASSWORD_ELEMENT = "password";

	private static final String LOGIN_ELEMENT = "login";

	private static final String SOURCE_ELEMENT = "source";

	private static final String TARGET_ELEMENT = "target";

	private static final org.apache.log4j.Logger logger = MyLogger
			.getLogger(ParametersLoader.class);

	private SaveConfig saveConfig = null;

	private LoadConfig loadConfig = null;
	
	private DeleteConfig deleteConfig = null;
	
	private String fileName = null;

	public static final ParametersLoader INSTANCE = new ParametersLoader();

	private ParametersLoader() {
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	public static void main(String[] args) throws Throwable {
		System.out.println(INSTANCE.getLoadConfig());
	}

	public LoginData getSource() {
		return getCredentials(SOURCE_ELEMENT);
	}

	public LoginData getTarget() {
		return getCredentials(TARGET_ELEMENT);
	}
	
	public String getRun(){
		final Document doc = getDoc(FilesLoader.INSTANCE.getConfigXML());
		final Element run = doc.getRootElement().element("run");
		return run.attributeValue("target");
	}
	
	public String getFile(){
		if ( this.fileName == null ) {
			final Document doc = getDoc(FilesLoader.INSTANCE.getConfigXML());
			final Element root = doc.getRootElement();
			final Element file = root.element("file");
			this.fileName = file.attributeValue("name");
		}
		return this.fileName;
	}

	private LoginData getCredentials(final String origin) {
		final Document doc = getDoc(FilesLoader.INSTANCE.getLoginXML());
		if ( doc != null ) {
			final Element root = doc.getRootElement();
			final String login = root.element(origin).element(LOGIN_ELEMENT)
				.getStringValue().trim();
			final String password = root.element(origin).element(PASSWORD_ELEMENT)
				.getStringValue().trim();
			return new LoginData(login, password);
		} else {
			return new LoginData("", "");
		}
	}

	private Document getDoc(File file) {
		SAXReader reader = new SAXReader();
		try {
			final Document doc = reader.read(file);
			return doc;
		} catch (Exception ex) {
			logger.error("Cant change run xml" + file, ex);
			return null;
		}
	}

	public LoadConfig getLoadConfig() {
		if (this.loadConfig == null) {
			try {
			final LoadConfig config = new LoadConfig();

			final Document doc = getDoc(FilesLoader.INSTANCE.getConfigXML());
			final Element load = doc.getRootElement().element("load");
			String prefix = load.attributeValue("prefix");
			config.setPrefix( prefix );
			final List<Element> objects = load.elements("object");
			if ((objects == null) || (objects.isEmpty())) {
				return config;
			}
			for (Element el : objects) {
				String name = el.attributeValue("name");
				final Element dependenciesElement = el.element("dependencies");
				config.putClass(name, 
						(dependenciesElement != null) ? dependenciesElement
								.elements("dependency") : null);
			}
			this.loadConfig = config;
			} catch ( ClassNotFoundException ex ) {
				ex.printStackTrace();
			}
		}
		return this.loadConfig;
	}

	public SaveConfig getSaveConfig() throws ClassNotFoundException {
		if (this.saveConfig == null) {
			final SaveConfig config = new SaveConfig();

			final Document doc = getDoc(FilesLoader.INSTANCE.getConfigXML());
			final Element save = doc.getRootElement().element("save");
			String prefix = save.attributeValue("prefix");
			config.setPrefix( prefix );
			final List<Element> objects = save.elements("object");
			if ((objects == null) || (objects.isEmpty())) {
				System.out.println("objects empty");
				return config;
			}
			for (Element el : objects) {
				String name = el.attributeValue("name");
				String fields = el.element("fields").getStringValue().trim();
				final Element referencesElement = el.element("references");
				config.putClass(name, fields,
						(referencesElement != null) ? referencesElement
								.elements("ref") : null);
			}
			this.saveConfig = config;
		}
		return this.saveConfig;
	}

	public DeleteConfig getDeleteConfig() {
		if ( deleteConfig == null ) {
			final DeleteConfig config = new DeleteConfig();

			final Document doc = getDoc(FilesLoader.INSTANCE.getConfigXML());
			final Element delete = doc.getRootElement().element("delete");
			final List<Element> objects = delete.elements("object");
			if ((objects == null) || (objects.isEmpty())) {
				System.out.println("objects empty");
				return config;
			}
			for (Element el : objects) {
				String name = el.attributeValue("name");
				config.addClass(name);
			}
			this.deleteConfig = config;
		}
		return deleteConfig;
	}
}
