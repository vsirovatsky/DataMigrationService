package force.load;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import ui.load.ObjectsLoadSelection;

import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.SoapBindingStub;

import force.util.ListUtils;

public class DependenciesCalculator {
	
	private final SoapBindingStub stub;
	
	public DependenciesCalculator( SoapBindingStub stub ){
		this.stub = stub;
	}
	
	public List<Dependency> calculate( ObjectsLoadSelection objectsLoadSelection ) throws AxisFault, RemoteException {
		final List<Dependency> deps = new ArrayList<Dependency>();
		if ( ListUtils.isEmptySafe(objectsLoadSelection.getSelected()) ){
			return deps;
		}
		for ( String className : objectsLoadSelection.getSelected() ) {
			List<DependencyNode> obtained = getReferences(className, objectsLoadSelection);
			if ( !ListUtils.isEmptySafe( obtained ) ) {
				deps.add( new Dependency( className, obtained ) );
			}
		}
		return deps;
	}
	
	public List<DependencyNode> getReferences( String className, ObjectsLoadSelection objectsLoadSelection ) throws AxisFault, RemoteException {
		final List<String> included = objectsLoadSelection.getIncludedFieldsNames(className);
		if ( ListUtils.isEmptySafe(included) ) {
			return null;
		}
		final DescribeSObjectResult descCap = stub.describeSObject( className );
		final Field[] fields = descCap.getFields();
		final List<DependencyNode> dependencyNodes = new ArrayList<DependencyNode>();
		for ( Field field : fields ) {
			String[] rt = field.getReferenceTo();
			if ( (rt != null) && (rt.length > 0) && (field.isCreateable()) && included.contains(field.getName())) {
				String targetClassName = rt[0];
				if ( objectsLoadSelection.getSelected().contains(targetClassName) ) {
					dependencyNodes.add( new DependencyNode( className, targetClassName, field.getName() ) );
				}
			}
		}
		return dependencyNodes;
	}
}
