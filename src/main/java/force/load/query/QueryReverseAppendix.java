package force.load.query;

import java.util.List;

import force.StringUtils;
import force.load.DataLoadedSaver;
import force.load.DependencyNode;

public class QueryReverseAppendix {
	
	final private DependencyNode node;
	
	final private DataLoadedSaver data;

	public QueryReverseAppendix(DependencyNode node, DataLoadedSaver data) {
		this.node = node;
		this.data = data;
	}
	
	public String getAppendix() throws Exception {
		final String values = StringUtils.asPrettyAppostrophedString( getTargetValues() );
		if ( StringUtils.isBlank(values) ) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		sb.append( getField() );
		sb.append( " IN " );
		sb.append( "(" );
		sb.append( values );
		sb.append( ")" );
		return sb.toString();
	}

	private Object getField() {
		return "Id";
	}

	private List<String> getTargetValues() throws Exception {		
		final List<String> values = data.getValues(this.node.getBaseClassName(), this.node.getFieldName());		
		return values;
	}
}
