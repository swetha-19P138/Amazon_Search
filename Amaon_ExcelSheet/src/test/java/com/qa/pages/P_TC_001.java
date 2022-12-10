package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P_TC_001 {
WebDriver driver;
	@FindBy(id = "searchDropdownBox")
    public WebElement selectCatagory;
	 
	 
	 public WebElement DropDown() {
		 return  selectCatagory;
	 }

	 @FindBy(xpath ="//input[@id='twotabsearchtextbox']")
	 public WebElement SearchBox;
	 public WebElement searchBox() {
		 
		 return SearchBox;
	 }
	
	 @FindBy(xpath="//input[@id='nav-search-submit-button']")
	 WebElement Magnifier;
	 
	 public WebElement magnifier() {
		 return Magnifier;
	 }
 public P_TC_001(WebDriver driver) {
		 
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	}
	
}
