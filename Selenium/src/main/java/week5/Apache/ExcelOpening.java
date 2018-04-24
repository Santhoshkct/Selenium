package week5.Apache;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOpening {

	public Object[][] data() throws IOException {


		XSSFWorkbook wBook = new XSSFWorkbook("./excelData/CreateLead.xlsx");
		XSSFSheet sheetName = wBook.getSheetAt(0);

		int rowCount = sheetName.getLastRowNum();
		System.out.println(rowCount);

		XSSFRow rowlist = sheetName.getRow(0);
		short colCount = rowlist.getLastCellNum();

		Object[][] edata = new Object[rowCount][colCount];
		for (int j = 1; j <= rowCount; j++) 
		{
			rowlist = sheetName.getRow(j);
			for (int i = 0; i < colCount; i++) {
				XSSFCell cell = rowlist.getCell(i);
				edata[j-1][i] = cell.getStringCellValue();
			} 
		}
	return edata;
	}

}
