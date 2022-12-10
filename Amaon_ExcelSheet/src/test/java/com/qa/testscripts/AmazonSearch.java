package com.qa.testscripts;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.AmazonPages;
import com.qa.utility.ExcelUtility;

public class AmazonSearch extends TestBase{
	
	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		
		String xFile="C:\\Users\\elams\\eclipse-workspace\\Amaon_ExcelSheet\\src\\test\\java\\com\\qa\\testdata\\DataAMZN.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
	
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
}
	@Test(dataProvider = "getdata")
	public void getTest(String catagory, String items ) throws IOException, InterruptedException {
//	PageFactory.initElements(driver, AmazonPages.class);

	/*Amazonpages.gsearchbox.sendKeys("amazon.in"+Keys.ENTER);
	Amazonpages.link.click();*/
	//AmazonPages.selectCatagory.click();
	Select slct=new Select(TC_001_p.selectCatagory);
	
	 slct.selectByVisibleText(catagory);
	TC_001_p.SearchBox.sendKeys(items+Keys.ENTER);
	
	driver.navigate().to("https://www.amazon.in/");
}
}

