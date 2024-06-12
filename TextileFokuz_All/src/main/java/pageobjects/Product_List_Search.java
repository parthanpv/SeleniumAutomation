package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility.Wait_Utility;

public class Product_List_Search {

	
	WebDriver driver;
 


	@CacheLookup
    @FindBy(xpath="//input[@placeholder=\'Search Product Name\']")
	WebElement search_box;
	
	@CacheLookup
    @FindBy(xpath="//div[@class='common-search']/button[1]")
	WebElement search_icon;

	@CacheLookup
	@FindAll(@FindBy(xpath="/html/body/div/div/div[2]/div[3]/div/div[4]/div/div[1]/div[3]/table/tbody/tr"))
	List <WebElement> rows;
	
//------------------------------------------------------------------------------------------------------------------------------ 
    
	public Product_List_Search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void Search(String kwd){
		
		try {
			
			
			
				Wait_Utility.Wait_for_Elmnt_Visible(driver, search_box,20);
				search_box.clear();
				search_box.sendKeys(kwd);
				Wait_Utility.Wait_for_Elmnt_Visible(driver, search_icon,20);
				search_icon.click();
		}
		catch (StaleElementReferenceException e) {
			
	WebElement elementName1 = driver.findElement(By.xpath("//input[@placeholder=\\'Search Product Name\\']"));
	Wait_Utility.Wait_for_Elmnt_Visible(driver, elementName1,20);
	search_box.clear();
	elementName1.sendKeys(kwd);
	
	WebElement elementName2 = driver.findElement(By.xpath("//button[@class='el-button search-input icon-search el-button--default']"));
	Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName2,20);
	
	
		}
			catch (Exception e) {
				System.out.println(e);
			}
	}
	
//---------------------------------Get_variation_count-------------------------------------------------

	public int Get_srch_count(){
		int s_count=0;
		try {
			
			
			Wait_Utility.Sleep_wait(5000);
			 s_count=rows.size();
				//System.out.println(rows.size());
			 Wait_Utility.Sleep_wait(5000);
		}
		catch (StaleElementReferenceException e) {
			System.out.println(e);
			

		}
			catch (Exception e) {
				System.out.println(e);
			}
		return s_count;
	}
	
}
