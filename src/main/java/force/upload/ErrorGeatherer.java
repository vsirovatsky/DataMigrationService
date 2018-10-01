package force.upload;

import java.util.ArrayList;
import java.util.List;

public class ErrorGeatherer {
	
	public class ErrorGeathererNode {
		
		private String name;
		
		private String id;
		
		private List<String> errStrings = new ArrayList<String>();
		
		public ErrorGeathererNode( String name, String id ){
			this.name = name;
			this.id = id;
		}
		
		public void add( String err ){
			if ( err == null ) {
				return;
			}
			this.errStrings.add( err );
		}

		@Override
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append( this.name );
			sb.append( '(' );
			sb.append( this.id );
			sb.append( ')' );
			if ( !this.errStrings.isEmpty() ) {
				sb.append(" : [");
				boolean addDelimeter = false;
				for ( String s : this.errStrings ) {
					if ( addDelimeter ) {
						sb.append( "] ; [" );
					} else {
						addDelimeter = true;
					}
					sb.append( s );
				}
				sb.append("]");
			}
			return sb.toString();
		}
	}
	
	private List<ErrorGeathererNode> errors = new ArrayList<ErrorGeathererNode>();

	public static final ErrorGeatherer INSTANCE = new ErrorGeatherer();
	
	private ErrorGeatherer(){}
	
	public void error( ErrorGeathererNode node){
		this.errors.add( node );
	}
	
	public ErrorGeathererNode createNode( String name, String id ){
		return new ErrorGeathererNode( name, id );
	}
	
	public void println(){
		System.out.println( "Errors: " + this.errors.size() );
		int i = 0;
		for ( ErrorGeathererNode node : this.errors ) {
			i++;
			System.out.println( "(" + i + ") " + node.toString() );
		}
	}
}
