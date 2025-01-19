package week6.day2;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// Excel file location
		File excelFile = new File("./data/CreateLead.xlsx");

		// Open excel workbook
		XSSFWorkbook workBook = new XSSFWorkbook(excelFile);

		// Locate the work sheet from the workbook
		//XSSFSheet sheetAt = workBook.getSheetAt(0);
		//OR
		XSSFSheet sheetAt = workBook.getSheet("Sheet1");
		
		
		//get row/ column size
		int rowCount = sheetAt.getLastRowNum();
		short columnCount = sheetAt.getRow(0).getLastCellNum();

		//Two diamention array format for getting dat from excel
		String[][] data = new String[rowCount][columnCount];
		
		
		// Get row info
		for (int i = 1; i <= rowCount; i++) {
			// get Column info
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cellInfo = sheetAt.getRow(i).getCell(j);

				// Get data from the cell
				String cellValue = cellInfo.getStringCellValue();
				System.out.println(cellValue);
				
				//wjy i-1 means to avoid the waste of memory (i=0) related line 31
				data[i-1][j] = cellValue;
			}
		}
		workBook.close();
	}

}
