package force.load;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import ui.load.ObjectsLoadSelection;

import com.sforce.soap.enterprise.SoapBindingStub;

import force.util.ListUtils;

public class DependenciesManager {
	
	private final SoapBindingStub stub;
	
	private final ObjectsLoadSelection objectsSelection;
	
	private List<Dependency> deps;
	
	public DependenciesManager( SoapBindingStub stub, ObjectsLoadSelection objectsSelection ) throws AxisFault, RemoteException{
		this.stub = stub;
		this.objectsSelection = objectsSelection;
		init();
	}

	private void init() throws AxisFault, RemoteException {
		final DependenciesCalculator calc = new DependenciesCalculator( this.stub );
		this.deps = calc.calculate(this.objectsSelection);
		for ( Dependency dep : deps ) {
			System.out.println( "------------" );
			List<DependencyNode> nodes = dep.getNodes();
			if ( !ListUtils.isEmptySafe(nodes) ) {
				for ( DependencyNode node : nodes ) {
					System.out.println( node.toString() );
				}
			}
		}
	}

	public Dependency getStraightDependency( String className ) {
		if ( className == null ) {
			return null;
		}
		for ( Dependency dep : deps ) {
			if ( className.equals( dep.getClassName() ) ) {
				return dep;
			}
		}
		return null;
	}

	public List<DependencyNode> getReverseDependencyNodes( String className ) {
		if ( className == null ) {
			return null;
		}
		List<DependencyNode> result = new ArrayList<DependencyNode>();
		for ( Dependency dep : deps ) {
			List<DependencyNode> obtained = dep.getDependenciesOnMe( className );
			if ( !ListUtils.isEmptySafe(obtained) ) {
				result.addAll( obtained );
			}
		}
		return result;
	}
}
