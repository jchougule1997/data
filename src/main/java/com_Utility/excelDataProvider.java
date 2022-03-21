package com_Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelDataProvider {
	
	public XSSFWorkbook wb;
	public excelDataProvider() throws IOException {
		
		
		String excelpath="C:\\Users\\jalindar.chougule\\eclipse-workspace\\Dummy_Data_Framework\\TestData\\datasheet.xlsx";
		File src =new File(excelpath);
		FileInputStream file=new FileInputStream(src);
		 wb=new XSSFWorkbook(file);
	}
	public String stringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public String numericvalue(String sheetname,int row,int cell) {
		double value= wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
	String value1=Double.toString(value);
String value2=	value1.replace(".0", "");
  return value2;		
		
	}

}
