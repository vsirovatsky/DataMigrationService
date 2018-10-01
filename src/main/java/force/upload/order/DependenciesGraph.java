package force.upload.order;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import force.fObject.fObject;
import force.upload.Dependency;
import force.upload.insufficient.InsufficientGeatherer;

public class DependenciesGraph {

	private final List<fObject> allData;
	
	private final List<String> classes;
	
	private final InsufficientGeatherer getherer;
	
	private Hashtable<String, GraphNode> rawNodes = new Hashtable<String, GraphNode>();
	
	private Hashtable<String, Dependency> depsHash = new Hashtable<String, Dependency>();

	public DependenciesGraph( List<String> classes, List<fObject> allData, List<Dependency> deps, InsufficientGeatherer insufficientGeatherer ) {
		this.allData = allData;
		this.classes = classes;
		this.getherer = insufficientGeatherer;
		if ( deps!=null ) {
			for ( Dependency dep : deps ) {
				depsHash.put(dep.getClassName(), dep);
			}
		}
		buildGraph();
	}

	private void buildGraph() {
		for ( fObject obj : this.allData ) {
			GraphNode graphNode = new GraphNode( obj );
			rawNodes.put( obj.getId(), graphNode );
		}
		if ( depsHash.isEmpty() ) {
			return;
		}
		
		for ( GraphNode node : rawNodes.values() ) {
			Dependency dep = this.depsHash.get( node.getClassName() );
			if ( dep != null ) {
				node.obtainPointers(dep, this.rawNodes, this.getherer);
			}
		}
		for ( GraphNode node : this.rawNodes.values() ) {
			System.out.println( node.toString() );
		}
	}
	
	public List<fObject> getOrder(){
		final List<fObject> order = new ArrayList<fObject>();
		if ( this.rawNodes.isEmpty() ) {
			return order;
		}
		boolean go = true;
		int neededS = 0;
		while ( go ) {
			boolean isTakenAny = false;
			for ( GraphNode node : this.rawNodes.values() ) {
				if ( !node.isTaken() && (node.getNotTakenWeight() <= neededS) ) {
					order.add( node.getObj() );
					node.setTaken();
					isTakenAny = true;
					System.out.println("Taken: " + node.getClassName() + " whith: " + node.getNotTakenWeight());
				}
			}
			if ( !isTakenAny ) {
				neededS++;
			} else {
				neededS = 0;
			}
			if ( order.size() >= this.rawNodes.size()) {
				go = false;
			}
		}
		
		return order;
	}
	
	public List<List<fObject>> getOrderByStages(){
		List<List<fObject>> orderTop = new ArrayList<List<fObject>>();
		if ( this.rawNodes.isEmpty() ) {
			return orderTop;
		}
		boolean go = true;
		int neededS = 0;
		int takenCount = 0;
		while ( go ) {
			boolean isTakenAny = false;
			List<fObject> subOrder = new ArrayList<fObject>();
			List<GraphNode> takenCurrently = new ArrayList<GraphNode>();
			for ( GraphNode node : this.rawNodes.values() ) {
				if ( !node.isTaken() && (node.getNotTakenWeight() <= neededS) ) {
					subOrder.add( node.getObj() );
					takenCount++;
					takenCurrently.add( node );
					isTakenAny = true;
					System.out.println("Taken: " + node.getClassName() + " whith: " + node.getNotTakenWeight());
				}
			}
			for ( GraphNode node : takenCurrently ) {
				node.setTaken();
			}
			if ( !subOrder.isEmpty() ) {
				orderTop.add( subOrder );
			}
			if ( !isTakenAny ) {
				neededS++;
			} else {
				neededS = 0;
			}
			if ( takenCount >= this.rawNodes.size()) {
				go = false;
			}
		}
		
		return orderTop;
	}

	public InsufficientGeatherer getGetherer() {
		return getherer;
	}
}
