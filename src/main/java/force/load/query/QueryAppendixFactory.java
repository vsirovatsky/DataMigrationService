package force.load.query;

import java.util.ArrayList;
import java.util.List;

import ui.load.ObjectsLoadSelection.SelectedField;

import force.StringUtils;
import force.load.DataLoadedSaver;
import force.load.DependenciesManager;
import force.load.Dependency;
import force.load.DependencyNode;
import force.util.ListUtils;

public class QueryAppendixFactory {

	public static final QueryAppendixFactory INSTANCE = new QueryAppendixFactory();
	
	private QueryAppendixFactory(){}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public List<String> createWithValues( String className, List<SelectedField> fields ) throws Exception {
		final List<String> appendixes = new ArrayList<String>();
		if ( ListUtils.isEmptySafe(fields) ) {
			return appendixes;
		}
		for ( SelectedField sf : fields ) {
			if ( sf.isValue() ) {
				StringBuilder sb = new StringBuilder();
				sb.append( sf.getField() );
				sb.append( "=" );
				sb.append( "'" );
				sb.append( sf.getValue() );
				sb.append( "'" );
				appendixes.add( sb.toString() );	
			}
		}
		return appendixes;
	}
	
	public List<String> create(String className, DependenciesManager depManager, DataLoadedSaver data ) throws Exception {
		final List<String> appendixes = new ArrayList<String>();
		
		final Dependency straightDep = depManager.getStraightDependency(className);
		if ( straightDep != null ) {
			List<DependencyNode> nodes = straightDep.getNodes();
			if ( !ListUtils.isEmptySafe(nodes) ) {
				for ( DependencyNode node : nodes ) {
					System.out.println( "===============" );
					System.out.println( node.toString() );
					QueryObjectAppendix app = new QueryObjectAppendix( node, data );
					appendixes.add( app.getAppendix() );
				}
			}
		}
		
		List<DependencyNode> nodes = depManager.getReverseDependencyNodes(className);
		if ( !ListUtils.isEmptySafe(nodes) ) {
			for ( DependencyNode node : nodes ) {
				QueryReverseAppendix app = new QueryReverseAppendix( node, data );
				appendixes.add( app.getAppendix() );
			}
		}

		return appendixes;
	}
}
