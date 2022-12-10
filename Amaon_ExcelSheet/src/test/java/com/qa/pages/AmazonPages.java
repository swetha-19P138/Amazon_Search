package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonPages {

	WebDriver driver;
	@FindBy(id = "searchDropdownBox")
    public static WebElement selectCatagory;
	 
	 
	 public WebElement DropDown() {
		 return  selectCatagory;
	 }

	 @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	 public static WebElement SearchBox;
	 public WebElement searchBox() {
		 
		 return SearchBox;
	 }
	
	 @FindBy(xpath="//input[@id='nav-search-submit-button']")
	 WebElement Magnifier;
	 
	 public WebElement magnifier() {
		 return Magnifier;
	 }

public AmazonPages(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	 
	 
}
