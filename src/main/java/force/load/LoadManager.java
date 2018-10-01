package force.load;

import java.util.List;

import org.apache.axis.AxisFault;

import ui.load.ObjectsLoadSelection;
import force.ConnectionData;
import force.ITraceReciever;
import force.fObject.fObjectsSet;
import force.util.ListUtils;
import force.xls.XLSWriter;

public class LoadManager {
	
	public static final LoadManager INSTANCE = new LoadManager(); 

	private LoadManager(){
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	
	public void load( ConnectionData connectionData, ObjectsLoadSelection objectsSelection, String fileName, ITraceReciever trace ) throws Exception {
        final DataLoader loader = new DataLoader( connectionData );
        System.out.println( "fileName : " + fileName );
        final XLSWriter writer = new XLSWriter( fileName );
        //final FieldsObtainer fieldsObtainer = new FieldsObtainer( connectionData.getStub() );
        final DataLoadedSaver saver = new DataLoadedSaver( trace );
        final DependenciesManager depManager = new DependenciesManager( connectionData.getStub(), objectsSelection ); 
        int sheetPos = 0;
        for ( String className : objectsSelection.getSelected() ) {
          	List<String> fields = objectsSelection.getIncludedFieldsNames(className);
          	if ( ListUtils.isEmptySafe( fields )) {
          		trace.println("No included fields for class : " + className);
          		continue;
          	}
           	//String query = QueryCalculator.calculate(className, objectsSelection.getIncludedFields(className), depManager, saver);
          	String query = QueryCalculator.calculate(className, objectsSelection.getIncludedFields(className), depManager, saver);
          	try {
          		fObjectsSet objectsSet = loader.loadObjects(query, trace);
          		if ( !objectsSet.isValid() ) {
          			continue;
          		}
          		saver.saveLoaded(className, objectsSet);
          		writer.writeData(className, fields, objectsSet, sheetPos);
          		sheetPos++;
			} catch (AxisFault af) {
				System.out.println(af.getFaultString());
				System.out.println(af);
				af.printStackTrace();
			} catch (Throwable e) {
				e.printStackTrace();
			}
        }
       	writer.save();
	}	
	
	public DataLoadedSaver loadToDataLoadedSaver( ConnectionData connectionData, ObjectsLoadSelection objectsSelection, String fileName, ITraceReciever trace ) throws Exception {
        final DataLoader loader = new DataLoader( connectionData );
        System.out.println( "fileName : " + fileName );
        final DataLoadedSaver saver = new DataLoadedSaver( trace );
        final DependenciesManager depManager = new DependenciesManager( connectionData.getStub(), objectsSelection ); 
        for ( String className : objectsSelection.getSelected() ) {
          	List<String> fields = objectsSelection.getIncludedFieldsNames(className);
          	if ( ListUtils.isEmptySafe( fields )) {
          		trace.println("No included fields for class : " + className);
          		continue;
          	}
          	String query = QueryCalculator.calculate(className, objectsSelection.getIncludedFields(className), depManager, saver);
          	try {
          		fObjectsSet objectsSet = loader.loadObjects(query, trace);
          		if ( !objectsSet.isValid() ) {
          			continue;
          		}
          		saver.saveLoaded(className, objectsSet);
			} catch (AxisFault af) {
				System.out.println(af.getFaultString());
				System.out.println(af);
				af.printStackTrace();
			} catch (Throwable e) {
				e.printStackTrace();
			}
        }
       	return saver;
	}
}
