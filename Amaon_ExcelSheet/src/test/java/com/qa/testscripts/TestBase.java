package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.qa.pages.AmazonPages;
import com.qa.pages.P_TC_001;
import com.qa.utility.E_TC_001;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
WebDriver driver;
	E_TC_001 utility;
	AmazonPages TC_001_p;
	P_TC_001 TC_001;
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void open_browswe(String browser,String url) throws IOException {
             
	
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
       
	}
		else {
			if(browser.equalsIgnoreCase("edge")) {
				WebDriverManager.edgedriver().setup();
				 driver=new EdgeDriver();
			
			}
			else {
				if(browser.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
					
				}
			}
		}
		TC_001_p=new AmazonPages(driver);
		driver.manage().window().maximize();
		driver.get(url);
//		
	}
	
	
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	
}

