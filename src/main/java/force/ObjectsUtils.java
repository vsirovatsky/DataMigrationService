package force;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ObjectsUtils {

	private static final org.apache.log4j.Logger logger = MyLogger.getLogger(ObjectsUtils.class);
	
	/*public String generateSelectAllForClass( Class<? extends SObject> clazz ){
		if ( (clazz==null) || !fields.containsKey(clazz) ) {
			System.out.println("Here");
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		sb.append("SELECT ");
		sb.append( getFieldsStringForClass(clazz) );
		sb.append(" FROM ");
		sb.append( getObjectNameForClass(clazz) );
		return sb.toString();
	}*/
	
	public static List<String> getFields( String str ){
		final List<String> res = new ArrayList<String>();
		if ( (str == null) || (str.trim().equals("")) ) {
			return res;
		}
		StringTokenizer st = new StringTokenizer( str, "," );
		while ( st.hasMoreTokens() ) {
			res.add( st.nextToken().trim() );
		}
		return res;
	}
	
	public static String buildGetMethod( String field ){
		if ( StringUtils.isBlank(field) ) {
			return field;
		}
		final String first = field.substring(0, 1);
		return "get" + first.toUpperCase() + field.substring(1);
	}

	public static String buildSetMethod( String field ){
		if ( StringUtils.isBlank(field) ) {
			return field;
		}
		final String first = field.substring(0, 1);
		return "set" + first.toUpperCase() + field.substring(1);
	}

	private static String buildNameOfMethod( String field ){
		final StringBuilder sb = new StringBuilder();
		for ( int i = 0; i < field.length(); i++ ) {
			char c = field.charAt(i);
			if (c == '_') {
				if ( (i == (field.length() - 3)) && ( field.charAt(i+1) == '_' ) && ( field.charAt(i+2) == 'c' )) {
					sb.append('C');
					break;
				}
			} else {
				sb.append(c);
			}
		}
		return sb.toString();		
	}	
}
