package force.load.query;

import force.xml.LoadConfig.Dependency;

public class QueryAppendix {
	
	private final String field;

	public QueryAppendix( Dependency dep, String field ){
		this.field = field;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		return sb.toString();
	}

	protected String getField() {
		return field;
	}
}
