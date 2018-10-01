package force.xls;

import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import com.sforce.soap.enterprise.sobject.SObject;

import force.ITraceReciever;
import force.ObjectsUtils;
import force.fObject.fObject;
import force.fObject.fObjectsSet;
import force.upload.FieldsForceValues;
import force.upload.FieldsToSaveContainer;
import force.util.ClassUtils;

public class XLSReadData {
	
	public class XLSRow {
		
		private final List<String> values;
		
		public XLSRow( int initialSize ) {
			this.values = new ArrayList<String>( initialSize );
		}
		
		public void addValue( String value ){
			this.values.add( value );
		}
		
		public List<String> getValues(){
			return this.values;
		}
		
		public String getValue( int i ){
			return this.values.get(i);
		}

		@Override
		public String toString() {
			final StringBuilder sb = new StringBuilder();
			for ( String s : this.values) {
				if ( sb.length() != 0 ) {
					sb.append( ", " );
				}
				sb.append( s );
			}
			return sb.toString();
		}
	}
	
	private final String className;
	
	private final List<String> fieldNames = new ArrayList<String>();
	
	private final List<XLSRow> rows = new ArrayList<XLSRow>();

	public XLSReadData( String className ){
		this.className = className;
	}
	
	public void addField( String field ){
		this.fieldNames.add( field );
	}
	
	public XLSRow getNewRow(){
		final XLSRow row = new XLSRow( this.fieldNames.size() );
		this.rows.add( row );
		return row;
	}	
	
	public void printSelf(){
		System.out.println("Class: " + className);
		System.out.println("fields: " + this.fieldNames.size());
		System.out.println("rows: " + this.rows.size());
		
		for ( String s : fieldNames ){
			System.out.println(s);
		}
		for ( XLSRow row : this.rows ) {
			System.out.println( row );
		}
	}
	
	private boolean isNotSettable(String className, String field, FieldsToSaveContainer container) throws Exception{
		if ( (className == null) || (field == null) ) {
			return true;
		}
		if ( field.equalsIgnoreCase("id") ) {
			return false;
		}
		return !container.isInToSaveFields(className, field);
	}
	
	public List<fObject> generateObjects(FieldsToSaveContainer container, FieldsForceValues forcedValues, ITraceReciever trace) throws Throwable {
		trace.println( "Generating: " + this.className );
		
		final List<fObject> fobjs = new ArrayList<fObject>( this.rows.size() );
		for ( int k = 0; k < this.rows.size(); k++ ) {
			fobjs.add( new fObject( this.className ) );
		}
		
		int i = 0;
		for ( String field : this.fieldNames ) {
			if ( isNotSettable(this.className, field, container) ) {
				i++;
				continue;
			} else {
				System.out.println("setting field: " + field);
			}
			int j = 0;
			for ( XLSRow row : this.rows ) {
				String value = row.getValue(i);
				String forcedValue = forcedValues.getValue(field);
				if ( forcedValue != null ) {
					if ( FieldsForceValues.NULL_VALUE.equals(forcedValue) ) {
						value = null;
					} else {
						value = forcedValue;
					}
				}
				fobjs.get(j).set(field, value);
				j++;
			}
			i++;
		}		
		return fobjs;
	}
	
	public List<fObject> generateObjectsRaw(){
		final List<fObject> fobjs = new ArrayList<fObject>( this.rows.size() );
		for ( int k = 0; k < this.rows.size(); k++ ) {
			fobjs.add( new fObject( this.className ) );
		}
		int i = 0;
		for ( String field : this.fieldNames ) {
			int j = 0;
			for ( XLSRow row : this.rows ) {
				String value = row.getValue(i);
				fobjs.get(j).set(field, value);
				j++;
			}
			i++;
		}		
		return fobjs;		
	}

	public List<? extends SObject> generateObjects_Old(FieldsToSaveContainer container, ITraceReciever trace) throws Throwable {
		trace.println( "Generating: " + this.className );
		Class<? extends SObject> clazz = ClassUtils.INSTANCE.get( this.className );
		//Class factoryClazz = Class.forName( clazz.getCanonicalName() + "$Factory" );
		
		List objects = new ArrayList( this.rows.size() );
		for ( int k = 0; k < this.rows.size(); k++ ) {
			//objects.add( factoryClazz.getMethod( "newInstance" ).invoke(null) );
			objects.add( clazz.getConstructor( null ).newInstance( null ) );
		}
		
		int i = 0;
		for ( String field : this.fieldNames ) {
			if ( isNotSettable(this.className, field, container) ) {
				i++;
				continue;
			} else {
				System.out.println("setting field: " + field);
			}
			String name = ObjectsUtils.buildSetMethod(field);
			Method m = null;
			Class targetValueClass = null;
			for ( Class clazzInSet : classesInSet ) {
				try {
					m = clazz.getMethod(name , clazzInSet);
					targetValueClass = clazzInSet;
					break;
				} catch (SecurityException e) {} 
				catch (NoSuchMethodException e) {}
			}
			if ( m == null ) {
				trace.error( name +  " : null");
				i++;
				continue;
			}
			
			int j = 0;
			for ( XLSRow row : this.rows ) {
				String value = row.getValue(i);
				setValue(objects.get(j), m, targetValueClass, value, trace);
				j++;
			}
			i++;
		}		
		return objects;
	}

	public static Class[] classesInSet = { String.class, double.class, Double.class, Calendar.class, boolean.class, Boolean.class, java.util.Date.class }; 
		
	public static void setValue(Object o, Method m, Class targetValueClass, String value, ITraceReciever trace) throws Throwable {
		if ( isEmptyValue(value) ) {
			return;
		}
		System.out.println("value: " + value);
		if ( targetValueClass == String.class ) {
			m.invoke( o , value);
			return;
		} else if ( targetValueClass == double.class ) {
			Double d = Double.parseDouble(value);
			m.invoke( o , d.doubleValue());
			return;
		} else if ( targetValueClass == Double.class ) {
			Double d = Double.parseDouble(value);
			m.invoke( o , d );
			return;
		} else if ( targetValueClass == boolean.class ) {
			Boolean b = Boolean.parseBoolean(value);
			m.invoke( o , b.booleanValue());
			return;
		} else if ( targetValueClass == Boolean.class ) {
			Boolean b = Boolean.parseBoolean(value);
			m.invoke( o , b );
			return;
		} else if ( targetValueClass == Calendar.class ) {
			//String stringDateFormat = "EEE MMM dd HH:mm:ss z yyyy";
			String stringDateFormat = "yyyy-MM-dd'T'kk:hh:ss.SSS'Z'";
			//"2009-12-02T18:52:07.000Z";
			SimpleDateFormat format = new SimpleDateFormat(stringDateFormat, Locale.US);
			Date d = format.parse(value);
			Calendar c = Calendar.getInstance();
			c.setTime(d);
			m.invoke(o, c);
			return;
		} else if ( targetValueClass == java.util.Date.class ) {
			//String stringDateFormat = "EEE MMM dd HH:mm:ss z yyyy";
			String stringDateFormat = "yyyy-MM-dd'T'kk:hh:ss.SSS'Z'";
			SimpleDateFormat format = new SimpleDateFormat(stringDateFormat, Locale.US);
			Date d = null;
			try {
				d = format.parse(value);
			} catch (Exception ex){
				stringDateFormat = "yyyy-MM-dd";
				format = new SimpleDateFormat(stringDateFormat, Locale.US);
				d = format.parse(value);
			}
			m.invoke(o, d);
			return;
		}
		trace.error("No match for target class: " + targetValueClass.getCanonicalName());
	}
	
	public static boolean isEmptyValue( String value ){
		if ( value == null ) {
			return true;
		}
		final String trimmed = value.trim();
		if ( trimmed.equals("") || trimmed.equals("null") ) {
			return true;
		}
		return false;
	}
}
