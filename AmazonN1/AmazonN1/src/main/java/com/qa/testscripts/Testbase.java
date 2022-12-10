package com.qa.testscripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
WebDriver driver;
	
	@Parameters({"Browser","Url"})
	@BeforeClass
	public void open_browswe(String browser,String url) throws IOException {
             
	
		
		if(browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
    	 driver=new ChromeDriver();
       
	}
		else {
			if(browser.equalsIgnoreCase("edge")) {
				System.setProperty("webdriver.edge.driver", "C:\\Users\\USER\\Downloads\\edgedriver_win64\\msedgedriver.exe");
				 driver=new EdgeDriver();
			
			}
			else {
				if(browser.equalsIgnoreCase("firefox")) {
					WebDriverManager.firefoxdriver().setup();
				 driver=new FirefoxDriver();
					
				}
			}
		}
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

