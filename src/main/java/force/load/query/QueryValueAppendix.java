package force.load.query;

import force.xml.LoadConfig.Dependency;

public class QueryValueAppendix extends QueryAppendix {
	
	private final String value;

	public QueryValueAppendix(Dependency dep, String field) {
		super(dep, field);
		this.value = dep.getValue(field);
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( getField() );
		sb.append( "=" );
		sb.append( "'" );
		sb.append( this.value );
		sb.append( "'" );
		return sb.toString();
	}

}
