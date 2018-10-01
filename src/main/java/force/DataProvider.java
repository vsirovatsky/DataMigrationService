package force;

public class DataProvider {
	
	public static final DataProvider INSTANCE = new DataProvider();
	
	private DataProvider(){
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public LoginData getSource(){
		return new LoginData( getSourceLogin(), getSourcePassword() );
	}
	
	public LoginData getTarget(){
		return new LoginData( getTargetLogin(), getTargetPassword() );
	}
	
	private String getSourceLogin(){
		return "vsirovatsky@all-rounds.com";
	}
	
	private String getSourcePassword(){
		return "vty7uif12rCWfe1tp0DTT0STRaHwBgWsDI";
	}
	
	private String getTargetLogin(){
		return "zoboman@ok.ru";
	}
	
	private String getTargetPassword(){
		return "qwerty89poKst54EtiLzki9OvsqehJKM";
	}
}
