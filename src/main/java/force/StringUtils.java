package force;

import java.util.List;

public class StringUtils {
	
	public static boolean isNotBlank( String str ){
		return !isBlank(str);
	}

	public static boolean isBlank( String str ){
		if ( str == null ) {
			return true;
		}
		if ( str.trim().length() == 0) {
			return true;
		}
		return false;
	}
	
	public static String asPrettyAppostrophedString( List<String> values ){
		return asPrettyString(values, '\'');
	}
	
	private static String asPrettyString( List<String> values, char c ){
		if ( (values == null) || (values.isEmpty()) ) {
			return "";
		}
		final StringBuilder sb = new StringBuilder();
		for ( String s : values ) {
			if (sb.length() > 0) {
				sb.append(',');
			}
			sb.append( c );
			sb.append( s );
			sb.append( c );
		}
		return sb.toString();
	}
}
