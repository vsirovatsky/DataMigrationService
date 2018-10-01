package force.xls;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Locale;

import jxl.CellView;
import jxl.Workbook;
import jxl.WorkbookSettings;
import jxl.format.UnderlineStyle;
import jxl.write.Label;
import jxl.write.WritableCellFormat;
import jxl.write.WritableFont;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import force.fObject.fObject;
import force.fObject.fObjectsSet;

public class XLSWriter {

	private WritableCellFormat timesBoldUnderline;
	private WritableCellFormat times;
	private String inputFile;
	private WritableWorkbook workbook;

	public XLSWriter( String inputFile ){
		this.inputFile = inputFile;
	}
	
	public void save() throws Exception {
		getWritableWorkbook().write();
		getWritableWorkbook().close();
	}
	
	public void writeData( String className, List<String> fields, fObjectsSet objectsSet, int sheetPos ) throws Exception {
		getWritableWorkbook().createSheet( className, sheetPos );
		final WritableSheet excelSheet = getWritableWorkbook().getSheet( sheetPos );
		initStyles(excelSheet);
		//final Hashtable<String, Method> methods = new Hashtable<String, Method>();
		//for ( String s : fields ) {
		//	String m = ObjectsUtils.buildGetMethod(s);			
		//	methods.put( s , ClassUtils.INSTANCE.get(className).getMethod(m) );
		//}
		
		int column = 0;
		int row = 0;
		for ( String field : fields ) {
			//Method m = methods.get(field);
			addCaption(excelSheet, column, 0, field);
			row = 1;
			for ( fObject cap : objectsSet.getObjects() ) {
				String value = cap.getValue(field);
				/*if ( o instanceof Calendar ) {
					String stringDateFormat = "EEE MMM dd HH:mm:ss z yyyy";
					SimpleDateFormat format = new SimpleDateFormat(stringDateFormat, Locale.US);
					value += format.format(((Calendar)o).getTime());
				} else {
					value += o;
				}*/
				addCaption(excelSheet, column, row, value);
				row++;
			}
			column++;
		}
	}

	private void init() throws IOException {
		File file = new File(inputFile);
		WorkbookSettings wbSettings = new WorkbookSettings();
		wbSettings.setLocale(new Locale("en", "EN"));
		this.workbook = Workbook.createWorkbook(file, wbSettings);		
	}
	
	private WritableWorkbook getWritableWorkbook() {
		if ( this.workbook == null ) {
			try {
				init();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return this.workbook;
	}
	
	private void initStyles( WritableSheet sheet ) throws WriteException{
		// Lets create a times font
		WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
		// Define the cell format
		times = new WritableCellFormat(times10pt);
		// Lets automatically wrap the cells
		times.setWrap(true);

		// Create create a bold font with unterlines
		WritableFont times10ptBoldUnderline = new WritableFont(
				WritableFont.TIMES, 10, WritableFont.NO_BOLD, false,
				UnderlineStyle.NO_UNDERLINE);
		timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
		// Lets automatically wrap the cells
		//timesBoldUnderline.setWrap(true);

		CellView cv = new CellView();
		cv.setFormat(times);
		//cv.setFormat(timesBoldUnderline);
		cv.setAutosize(true);
	}
	
	
	
	
	
	
	

/*	private void createLabel(WritableSheet sheet) throws WriteException {
		// Lets create a times font
		WritableFont times10pt = new WritableFont(WritableFont.TIMES, 10);
		// Define the cell format
		times = new WritableCellFormat(times10pt);
		// Lets automatically wrap the cells
		times.setWrap(true);

		// Create create a bold font with unterlines
		WritableFont times10ptBoldUnderline = new WritableFont(
				WritableFont.TIMES, 10, WritableFont.BOLD, false,
				UnderlineStyle.SINGLE);
		timesBoldUnderline = new WritableCellFormat(times10ptBoldUnderline);
		// Lets automatically wrap the cells
		timesBoldUnderline.setWrap(true);

		CellView cv = new CellView();
		cv.setFormat(times);
		cv.setFormat(timesBoldUnderline);
		cv.setAutosize(true);

		// Write a few headers
		addCaption(sheet, 0, 0, "Header 1");
		addCaption(sheet, 1, 0, "This is another header");

	}*/

/*	private void createContent(WritableSheet sheet) throws WriteException,
			RowsExceededException {
		// Write a few number
		for (int i = 1; i < 10; i++) {
			// First column
			addNumber(sheet, 0, i, i + 10);
			// Second column
			addNumber(sheet, 1, i, i * i);
		}
		// Lets calculate the sum of it
		StringBuffer buf = new StringBuffer();
		buf.append("SUM(A2:A10)");
		Formula f = new Formula(0, 10, buf.toString());
		sheet.addCell(f);
		buf = new StringBuffer();
		buf.append("SUM(B2:B10)");
		f = new Formula(1, 10, buf.toString());
		sheet.addCell(f);

		// Now a bit of text
		for (int i = 12; i < 20; i++) {
			// First column
			addLabel(sheet, 0, i, "Boring text " + i);
			// Second column
			addLabel(sheet, 1, i, "Another text");
		}
	}*/

	private void addCaption(WritableSheet sheet, int column, int row, String s)
			throws RowsExceededException, WriteException {
		Label label;
		label = new Label(column, row, s, timesBoldUnderline);
		sheet.addCell(label);
	}

	/*private void addNumber(WritableSheet sheet, int column, int row,
			Integer integer) throws WriteException, RowsExceededException {
		Number number;
		number = new Number(column, row, integer, times);
		sheet.addCell(number);
	}

	private void addLabel(WritableSheet sheet, int column, int row, String s)
			throws WriteException, RowsExceededException {
		Label label;
		label = new Label(column, row, s, times);
		sheet.addCell(label);
	}*/
	
	/*private void addTime(WritableSheet sheet, int column, int row, String s)
			throws RowsExceededException, WriteException {
		Label label;
		DateFormat
		label = new Label(column, row, s, timesBoldUnderline);
		sheet.addCell(label);
	}*/
	
}
