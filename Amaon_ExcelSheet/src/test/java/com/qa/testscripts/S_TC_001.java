package com.qa.testscripts;

import java.io.IOException;
import java.util.ArrayList;
import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.utility.E_TC_001;

public class S_TC_001 extends TestBase {

	//E_TC_001 utility = new E_TC_001();
	 
	//int rowCount =  utility.getrowCount();
	// int colCount  = E_TC_001.getcellCount();
	//String[][] data= new  String[rowCount][colCount];

	
       Select select ;
     
	 @Test
	  public void getData() throws InterruptedException, IOException {
		  for(int i=1;i<E_TC_001.getCategory().size();i++) {
			  Thread.sleep(3000);

			  select =new Select(TC_001.selectCatagory);
			          select.selectByVisibleText(E_TC_001.getCategory().get(i));
			          Thread.sleep(3000);

			           TC_001.SearchBox.sendKeys(E_TC_001.getitem().get(i));
			           Thread.sleep(3000);

			         TC_001.magnifier().click();
			         
			         Thread.sleep(3000);

			         driver.navigate().to("https://www.amazon.in/");
		  }
		  
	  }
	 
	
	
	
	
}
