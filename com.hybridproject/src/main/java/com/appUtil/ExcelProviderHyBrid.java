package com.appUtil;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelProviderHyBrid 
{    
	public static File file;
	public static HSSFWorkbook wb;
	public ExcelProviderHyBrid() {
	
	try {
	
	 file=new File("./appFiles/Excelfiledata.xls");
	FileInputStream fis=new FileInputStream(file);
	wb=new HSSFWorkbook(fis);

	
	}
	catch(Exception ex) {
		System.out.println(ex.getMessage());
	}

}
	
	public static String excelcelldata(int sheetnumber, int rownum, int cellnum) {
		return wb.getSheetAt(sheetnumber).getRow(rownum).getCell(cellnum).getStringCellValue();
		
		
	}
}
