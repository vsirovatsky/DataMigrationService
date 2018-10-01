package force.upload.order;

import java.util.List;

import force.fObject.fObject;
import force.upload.Dependency;
import force.upload.insufficient.InsufficientGeatherer;

public class UploadOrder {
	
	private final List<fObject> allData; 
	
	private final List<String> classes;
	
	private final List<Dependency> deps;
	
	private InsufficientGeatherer getherer;

	public UploadOrder( List<String> classes, List<fObject> allData, List<Dependency> deps ) {
		this.classes = classes;
		this.allData = allData;
		this.deps = deps;
	}
	
	public List<fObject> get(){
		this.getherer = new InsufficientGeatherer();
		final DependenciesGraph graph = new DependenciesGraph(this.classes, this.allData, this.deps, this.getherer);
		return graph.getOrder();
	}
	
	public List<List<fObject>> getByStages(){
		this.getherer = new InsufficientGeatherer();
		final DependenciesGraph graph = new DependenciesGraph(this.classes, this.allData, this.deps, this.getherer);
		return graph.getOrderByStages();		
	}
	
	public InsufficientGeatherer getInsufficientGeatherer(){
		return this.getherer;
	}
}
