package force.upload;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import org.apache.axis.AxisFault;

import ui.save.ObjectsSaveSelection;

import com.sforce.soap.enterprise.DescribeSObjectResult;
import com.sforce.soap.enterprise.Field;
import com.sforce.soap.enterprise.SoapBindingStub;

import force.util.CommonUtils;
import force.util.ListUtils;

public class DependenciesCalculator {
	
	private final SoapBindingStub stub;
	
	public DependenciesCalculator( SoapBindingStub stub ){
		this.stub = stub;
	}
	
	public List<Dependency> calculate( ObjectsSaveSelection objectsSelection ) throws AxisFault, RemoteException {
		final List<Dependency> deps = new ArrayList<Dependency>();
		if ( ListUtils.isEmptySafe(objectsSelection.getSelected()) ){
			return deps;
		}
		for ( String className : objectsSelection.getSelected() ) {
			List<DependencyNode> obtained = getReferences(className, objectsSelection);
			if ( !ListUtils.isEmptySafe( obtained ) ) {
				deps.add( new Dependency( className, obtained ) );
			}
		}
		return deps;
	}
	
	public List<DependencyNode> getReferences( String className, ObjectsSaveSelection objectsSelection ) throws AxisFault, RemoteException {
		final List<String> included = objectsSelection.getIncludedFieldsNames(className);
		if ( ListUtils.isEmptySafe(included) ) {
			return null;
		}
		final DescribeSObjectResult descCap = stub.describeSObject( className );
		final Field[] fields = descCap.getFields();
		final List<DependencyNode> dependencyNodes = new ArrayList<DependencyNode>();
		for ( Field field : fields ) {
			//if ( "Options__c".equals(field.getName()) || "Issuer__c".equals(field.getName()) ) {
			//	CommonUtils.printField( field );
			//}
			String[] rt = field.getReferenceTo();
			if ( (rt != null) && (rt.length > 0) && (field.isCreateable()) && included.contains(field.getName())) {
				String targetClassName = rt[0];
				//CommonUtils.printField( field );
				//if ( objectsSelection.getSelected().contains(targetClassName) ) {
					dependencyNodes.add( new DependencyNode( className, targetClassName, field.getName() ) );
				//}
			}
		}
		return dependencyNodes;
	}
}
