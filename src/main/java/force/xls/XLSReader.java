package force.xls;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import force.xls.XLSReadData.XLSRow;

public class XLSReader {

	private final String inputFile;
	
	private Workbook workbook;
	
	public XLSReader( String inputFile ){
		this.inputFile = inputFile;
	}
	
	private Workbook getWorkbook(){
		if ( this.workbook == null ) {
			initWorkbook();
		}
		return this.workbook;
	}
	
	private void initWorkbook() {
		File inputWorkbook = new File(inputFile);
		try {
			this.workbook = Workbook.getWorkbook(inputWorkbook);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
	private Sheet getSheetFromBook( String className ){
		if ( className == null ) {
			return null;
		}
		Sheet sheet = getWorkbook().getSheet( className );
		if ( sheet == null ) {
			String[] sheetNames = getWorkbook().getSheetNames();
			if ( (sheetNames!=null) && (sheetNames.length > 0) ) {
				for ( String sheetName : sheetNames ) {
					if ( className.startsWith(sheetName) ) {
						return getWorkbook().getSheet( sheetName );
					}
				}
			}
		}
		return sheet;
	}
	
	public XLSReadData readData( String className ) throws ClassNotFoundException {
		//String prefix = ParametersLoader.INSTANCE.getSaveConfig().getPrefix();
		//String classNameLocal = className; 
		//if ( prefix != null ) {
		//	classNameLocal = prefix + className;
		//}
		//System.out.println( "classNameLocal : " + classNameLocal );
		String classToLoadInSheet = className;
		//if ( classToLoadInSheet.equals("Plan_Questionnaire_Question_Record__c")) {
		//	classToLoadInSheet = "Plan_Questionnaire_Question_Rec";
		//}
		Sheet sheet = getSheetFromBook( classToLoadInSheet );
		if ( className.equals("Pathfinder__Answer__c__n") ) {
			className = "Pathfinder__Answer__c";
		}
		
		if ( sheet == null ) {
			throw new NullPointerException("Sheet is null for : " + className);
		}
		System.out.println( "sheet : " + sheet.getName() );
		
		final XLSReadData data = new XLSReadData( className );		
		
		int colsNum = sheet.getColumns();
		for ( int i=0; i<colsNum; i++ ) {
			Cell cell = sheet.getCell(i, 0);
			String cellName = cell.getContents();
			if ( cellName!=null ) {
				data.addField( cellName );
			}
		}
		
		for (int j = 1; j < sheet.getRows(); j++) {
			XLSRow row = data.getNewRow();
			for ( int i=0; i<colsNum; i++ ) {
				Cell cell = sheet.getCell(i, j);
				row.addValue(cell.getContents());
			}
		}
		
		return data;
	}
	
	public List<String> getClassesNames(){
		List<String> result = new ArrayList<String>();
		final String[] sheetNames = getWorkbook().getSheetNames();
		if ( (sheetNames!=null) && (sheetNames.length>0) ) {
			for ( String sheetName : sheetNames ) {
				if ( sheetName.equals("Plan_Questionnaire_Question_Rec")) {
					result.add( "Plan_Questionnaire_Question_Record__c" );;
				} else if ( sheetName.equals("Pathfinder__Answer__c__n") ) {
					
				} else {
					result.add( sheetName );
				}
			}
		}
		return result;
	}

	public List<String> getFieldsForClass(String className) {
		final List<String> fields = new ArrayList<String>();
		final Sheet sheet = getSheetFromBook( className );
		if ( sheet != null ) {
			final int colsNum = sheet.getColumns();
			for ( int i=0; i<colsNum; i++ ) {
				Cell cell = sheet.getCell(i, 0);
				String cellName = cell.getContents();
				if ( cellName!=null ) {
					fields.add( cellName );
				}
			}
		}
		return fields;
	}
}