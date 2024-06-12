package pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Wait_Utility;
import utility.Click_Utility;
public class Left_SIde_menu {
	
		
		WebDriver driver;
		
		
	    @CacheLookup
	    @FindBy(id="sidebar left-nav") 
	    WebElement MoveToSideMenu;
	    //@CacheLookup
	   // @FindBy(linkText ="Lead") 
	   // WebElement CLick_lead_menu;
	    
	    @FindBy(xpath ="//a[contains(text(),'Product')]") 
	    WebElement CLick_product;
	    
	    @FindBy(xpath ="//a[contains(text(),'Lead Pipeline')]") 
	    WebElement CLick_lead_pipeline;
	    
	    @FindBy(xpath ="//span[class='icon icon-product nav-icon']") 
	    WebElement product;
	    
	    public Left_SIde_menu(WebDriver driver)
	    {
	        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);

	    }
	
	
	
	
	  public void Click_Lead_in_SideMenu(WebDriver driver) throws Exception 
	  {
		  //using Action class move to side menu and click lead 
		  try {
			  
			 Wait_Utility.Wait_for_Elmnt_Clickable(driver, product, 20);
			 	
				Wait_Utility.Sleep_wait(3000);
		//	Click_Utility.move_By_action(driver, product);
				 driver.get("http://textiles.salesfokuz.in/#/product");
				

		  }
		  catch (Exception e) {
			//System.out.println(e);
			 
			  driver.get("http://textiles.salesfokuz.in/#/product");
			  Reporter.log("Unable to click sidemenu, Navigating", true);
		}
	  }
	  


}
