package force.upload;

import java.util.ArrayList;
import java.util.List;

public class Dependency {

	private List<DependencyNode> nodes = new ArrayList<DependencyNode>();
	
	private String className;
	
	public Dependency( String className, List<DependencyNode> nodes ){
		this.className = className;
		if ( nodes != null ) {
			this.nodes.addAll( nodes );
		}
	}
	
	public List<DependencyNode> getNodes(){
		return this.nodes;
	}
	
	public Dependency( String className ){
		this(className, null);
	}
	
	public void addNode( DependencyNode node ){
		this.nodes.add( node );
	}
	
	public String getClassName(){
		return this.className;
	}
	
	public boolean isValid(){
		return !nodes.isEmpty();
	}
	
	public List<DependencyNode> getDependenciesOnMe( String targetClassName ){
		if ( (targetClassName == null) || (!isValid()) ) {
			return null;
		}
		final List<DependencyNode> result = new ArrayList<DependencyNode>();
		for ( DependencyNode node : nodes ) {
			if ( targetClassName.equals( node.getTargetClassName() ) ) {
				result.add( node );
			}
		}
		return result;
	}
}