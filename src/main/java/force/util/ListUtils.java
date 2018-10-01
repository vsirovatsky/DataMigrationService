package force.util;

import java.util.List;

public class ListUtils {

	public static boolean isEmptySafe( List<? extends Object> list ){
		if ( list == null ) {
			return true;
		} else {
			return list.isEmpty();
		}
	}

	public static void println( Object[] list ){
		if ( list == null ) {
			System.out.println("list is null");
		} else {
			System.out.println("list size: " + list.length);
			for ( Object o : list ) {
				System.out.println( o.toString() );
			}
		}				
	}
	
	public static void println( List<? extends Object> list ){
		if ( list == null ) {
			System.out.println("list is null");
		} else {
			System.out.println("list size: " + list.size());
			for ( Object o : list ) {
				System.out.println( o.toString() );
			}
		}		
	}
}
