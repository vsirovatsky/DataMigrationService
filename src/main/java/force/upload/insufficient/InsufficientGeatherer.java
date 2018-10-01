package force.upload.insufficient;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;

import force.ITraceReciever;
import force.upload.DependencyNode;

public class InsufficientGeatherer {

	private final Hashtable<String, List<InsufficientNode>> byTargetClass = new Hashtable<String, List<InsufficientNode>>();

	private final Hashtable<String, List<InsufficientNode>> byBaseClass = new Hashtable<String, List<InsufficientNode>>();

	public InsufficientGeatherer() {}

	public void add(DependencyNode depNode, String value) {
		final InsufficientNode node = new InsufficientNode(depNode.getBaseClassName(), 
				depNode.getTargetClassName(), depNode.getFieldName(), value);
		if ( node.isValid() ) {
			getByBaseClass(node.getBaseClass()).add(node);
			getByTargetClass(node.getTargetClass()).add(node);
		}
	}
	
	public List<InsufficientNode> getByTargetClass( String targetName ){
		if ( targetName == null ) {
			return null;
		}
		List<InsufficientNode> nodes = this.byTargetClass.get( targetName );
		if ( nodes == null ) {
			nodes = new ArrayList<InsufficientNode>();
			this.byTargetClass.put(targetName, nodes);
		}
		return nodes;
	}

	public List<InsufficientNode> getByBaseClass( String targetName ){
		if ( targetName == null ) {
			return null;
		}
		List<InsufficientNode> nodes = this.byBaseClass.get( targetName );
		if ( nodes == null ) {
			nodes = new ArrayList<InsufficientNode>();
			this.byBaseClass.put(targetName, nodes);
		}
		return nodes;
	}
	
	public boolean isInsufficient(){
		return !this.byTargetClass.isEmpty();
	}
	
	public Set<String> getBaseClasses(){
		return this.byBaseClass.keySet();
	}

	public Set<String> getTargetClasses(){
		return this.byTargetClass.keySet();
	}

	public void printSelf(ITraceReciever trace) {
		trace.println("Dependencies checking:");
		if ( !isInsufficient() ) {
			trace.println("All dependencies present");
			return;
		}
		trace.println("No following classes:");
		for ( String target : getTargetClasses() ) {
			trace.println("TARGET: " + target);
		}
		trace.println("Per selected class:");
		for ( String base : getBaseClasses() ) {
			trace.println("");
			trace.println("BASE: " + base);
			for ( InsufficientNode node : getByBaseClass(base) ) {
				trace.println( node.toString() );
			}
		}
	}
}
