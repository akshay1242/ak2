package com.DemoFramework.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataFectching {
	XSSFWorkbook wb;
	
	public ExcelDataFectching() throws IOException {
		String pathExcel=System.getProperty("user.dir")+"\\DemoFramework\\TestData\\Testdata.xlsx";
		File src=new File(pathExcel);
		FileInputStream file=new FileInputStream(src);
		wb=new XSSFWorkbook(file);
		
	}
	public String getStringData(String SheetName,int Row,int Column) {
		return wb.getSheet(SheetName).getRow(Row).getCell(Column).getStringCellValue();
	}
}
