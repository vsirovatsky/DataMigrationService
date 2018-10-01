package force.upload.order;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

import force.fObject.fObject;
import force.upload.Dependency;
import force.upload.DependencyNode;
import force.upload.insufficient.InsufficientGeatherer;

public class GraphNode {
	
	private final fObject obj;
	
	private boolean taken = false;
	
	private final List<GraphNode> pointers = new ArrayList<GraphNode>();
	 
	public GraphNode( fObject obj ){
		this.obj = obj;
	}
	
	public String getClassName(){
		return this.obj.getName();
	}
	
	public fObject getObj(){
		return this.obj;
	}
	
	public Collection<GraphNode> getPointers(){
		return this.pointers;
	}
	
	public void obtainPointers( Dependency dep, Hashtable<String,GraphNode> rawNodes, InsufficientGeatherer getherer ) {
		final List<DependencyNode> nodes = dep.getNodes();
		if ( nodes != null ) {
			for ( DependencyNode depNode : nodes ) {
				String field = depNode.getFieldName();
				String value = this.obj.getValue(field);
				if ( value != null ) {
					GraphNode targetNode = rawNodes.get( value );
					if ( targetNode != null ) {
						this.pointers.add( targetNode );
					} else {
						getherer.add( depNode, value );
					}
				}
			}
		}
	}
	
	public int getNotTakenWeight(){
		int s = 0;
		for ( GraphNode node : this.pointers ) {
			if ( !node.isTaken() ) {
				s++;
			}
		}
		return s;
	}

	public void setTaken() {
		setTaken( true );
	}
	
	public void setTaken(boolean taken) {
		this.taken = taken;
	}

	public boolean isTaken() {
		return taken;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append( " GRAPHNODE: " );
		sb.append( this.obj.getName() );
		sb.append( " : " );
		sb.append( this.pointers.size() );
		return sb.toString();
	}
}
