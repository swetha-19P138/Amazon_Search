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

import com.qa.pages.Amazonpages;
import com.qa.utility.ExcelUtility;

public class AmazonSearch extends Testbase{
	
	@DataProvider(name="getdata")
	public String[][] getData() throws IOException {
		
		String xFile="D:\\work\\AmazonN1\\src\\main\\java\\com\\qa\\testdata\\DataAMZN.xlsx";
		String xSheet="Sheet1";
		
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
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
	PageFactory.initElements(driver, Amazonpages.class);
	Thread.sleep(5000);
	/*Amazonpages.gsearchbox.sendKeys("amazon.in"+Keys.ENTER);
	Amazonpages.link.click();*/
	Amazonpages.selectCatagory.click();
	Select slct=new Select(Amazonpages.selectCatagory);
	Thread.sleep(3000);
	 slct.selectByVisibleText(catagory);
	Amazonpages.amznSearchBox.sendKeys(items+Keys.ENTER);
	Thread.sleep(3000);
	driver.navigate().to("https://www.amazon.in/");
}
}

