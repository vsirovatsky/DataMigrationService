package force.load.query;

import java.util.List;

import force.StringUtils;
import force.load.DataLoadedSaver;
import force.load.DependencyNode;
import force.util.ListUtils;

public class QueryObjectAppendix {
	
	private final DependencyNode node;
	
	private final DataLoadedSaver data;
	
	public QueryObjectAppendix(DependencyNode node, DataLoadedSaver data) {
		this.node = node;
		this.data = data;
	}
	
	public String getAppendix(){
		final List<String> values = getTargetValues();
		if ( ListUtils.isEmptySafe(values) ) {
			return null;
		}
		final StringBuilder sb = new StringBuilder();
		sb.append( node.getFieldName() );
		sb.append( " IN " );
		sb.append( "(" );
		sb.append( StringUtils.asPrettyAppostrophedString( getTargetValues() ) );
		sb.append( ")" );
		return sb.toString();		
	}

	private List<String> getTargetValues() {
		return data.getIds( node.getTargetClassName() );
	}
}
