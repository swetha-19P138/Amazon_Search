package com.qa.utility;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

public class E_TC_001 {

	
	
	WebDriver driver;
	static FileInputStream loc ;
	//new FileInputStream("C:\\Users\\elams\\eclipse-workspace\\Amaon_ExcelSheet\\src\\test\\java\\com\\qa\\testdata\\Excel.csv.xlsx");
	 static  List<String> category = new ArrayList<>();
	
	 static List<String> item =new ArrayList<>();
	 static Workbook wb;
	 static Sheet sheet;
	 static int colcount;
	 static int rowcount;
	
	 
	 
	static Row row;
	static Cell cell;

 
	
	public static List<String> getCategory() throws IOException {
		loc=new FileInputStream("C:\\Users\\elams\\eclipse-workspace\\Amaon_ExcelSheet\\src\\test\\java\\com\\qa\\testdata\\EXCEL.xlsx");
		  wb= new XSSFWorkbook(loc);
		 sheet = wb.getSheet("Sheet1");
		 rowcount=sheet.getLastRowNum(); //rowcount
		row = sheet.getRow(rowcount);
		
		Iterator<Row> rowI= sheet.iterator();  
		 while(rowI.hasNext()) {
			 Row rowV = rowI.next();
			 
			 Iterator<Cell> colI=rowV.iterator();
			 int i=2;
			 while(colI.hasNext()) {
				 if(i%2==0) {
				   category.add(colI.next().getStringCellValue() ) ;
				 }
				
				 else {
					 item.add(colI.next().getStringCellValue() ) ;
					 
				 }
				   i++;  
			 }
		 } 
	

		 System.out.println(category);
		 System.out.println(item);
		 return category;
	}
	public static List<String> getitem() throws IOException{
		loc=new FileInputStream("C:\\Users\\elams\\eclipse-workspace\\Amaon_ExcelSheet\\src\\test\\java\\com\\qa\\testdata\\EXCEL.xlsx");
		  wb= new XSSFWorkbook(loc);
		 sheet = wb.getSheet("Sheet1");
		 rowcount=sheet.getLastRowNum(); //rowcount
		row = sheet.getRow(rowcount);
		return item;
	}
	 
	
}
