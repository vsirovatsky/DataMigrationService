package force;

public class LoginData {

	final private String login;
	
	final private String password;

	public LoginData(String login, String password) {
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public String getPassword() {
		return password;
	}

	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("LoginData: ");
		sb.append("[login:");
		sb.append(this.login);
		sb.append("]");
		sb.append(" - ");
		sb.append("[password:");
		sb.append(this.password);
		sb.append("]");
		return sb.toString();
	}
}
