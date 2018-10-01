package force.util;

import com.sforce.soap.enterprise.ChildRelationship;
import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.SoapBindingStub;

public class AllowedSaveFieldsGenerator {
	
	public static final AllowedSaveFieldsGenerator INSTANCE = new AllowedSaveFieldsGenerator(); 
	
	private AllowedSaveFieldsGenerator(){}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public void generate( SoapBindingStub binding, String objectName ) throws Exception {
		final DescribeSObjectResult descCap = binding.describeSObject( objectName );
		ChildRelationship[] rels = descCap.getChildRelationships();
		
		System.out.println( "prefix:" + descCap.getKeyPrefix() );
		Field[] fields = descCap.getFields();
		System.out.println("fields : " + fields.length);
		StringBuilder sb = new StringBuilder();
		for ( Field field : fields ) {
			if (field.isNameField()) {
				System.out.println( field.getName() );
			}
			/*if ( !field.isCreateable() ) {//(field.getCalculatedFormula() != null) || (field.getDefaultValueFormula() !=null)) {
				System.out.println( field.getName() );
			} else {
				sb.append( ", " );
				sb.append( field.getName() );
			}*/
		}
		System.out.println( sb.toString() );
		System.out.println( rels.length );
		/*for ( ChildRelationship rel : rels ) {
			System.out.println("-------------");
			//System.out.println( rel.getRelationshipName() );
			System.out.println( rel.getChildSObject() );
			//System.out.println( rel.getField() );
		}*/
		for ( Field field : fields ) {
			String[] rt = field.getReferenceTo();
			if ( (rt != null) && (rt.length > 0) && (field.isCreateable()) ) {
				System.out.println( "--------" );
				System.out.println( field.getName() + " : " );
				for ( String s : rt ) {
					System.out.println( s );
				}
			}
		}
	}
}
