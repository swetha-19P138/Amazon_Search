package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class Amazonpages {

	WebDriver Driver;
	
	@FindBy(name="q")
	 public static WebElement gsearchbox;
	
     @FindBy(xpath = "//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div[1]/a/h3")
     public static WebElement link;
	
     @FindBy(id = "searchDropdownBox")
     public static WebElement selectCatagory;
     
     @FindBy(id = "twotabsearchtextbox")
     public static WebElement amznSearchBox;
     
	 @FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]")
	public static WebElement menu;
	 
	 @FindBy(xpath="/html/body/div[3]/div[2]/div/ul[1]/li[30]/a")
	 public static WebElement signup;
	 
	 @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/span/span")
	 public static WebElement createaccount;
	 
	 @FindBy(id="ap_customer_name")
	 public static WebElement uname;
	 
	 @FindBy(id="ap_phone_number")
	 public static WebElement phno;
	 
	 @FindBy(id="ap_email")
	 public static WebElement email;
	 
	 @FindBy(id="ap_password")
	 public static WebElement pwd;
	 
	 @FindBy(id="continue")
	 public static WebElement regbtn;
	 
	 @FindBy(xpath="//input[@id='twotabsearchtextbox']")
	 public static WebElement searchbox;
	 
	 @FindBy(xpath = "//div[@class='autocomplete-results-container']")
	 public static WebElement amzndropdown;
	 
	 
	 @FindBy(xpath="//ul[@class='G43f7e']/*//span")
	 public static List<WebElement> lists;
}
