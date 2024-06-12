package pageobjects;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Browser_Utillity;
import utility.Click_Utility;
import utility.Wait_Utility;

public class Product_without_variation {

	WebDriver driver;
	int s_cat_posi;
	int cat_posi;
	
	String dirpath = System.getProperty("user.dir") + File.separatorChar + "Data_source" + File.separatorChar + "images"+File.separatorChar; 

	
	@CacheLookup
    @FindBy(xpath="//div[@class='input-field colum col-xs-6 max599-w-100 max767-mt-15 text-right head-icons']/a[@class='el-tooltip el-icon-plus add-btn custom-btn ml-10 pull-right']")
	WebElement Add_Button;
	@CacheLookup
	@FindBy(xpath="//div[@class='colum variation-enable']/label[1]/span[1]")
	WebElement Variation_checkbox;
	
	@CacheLookup
	@FindBy(name = "product name")
	WebElement product_name;
	
	@CacheLookup
	@FindBy(name = "category")
	WebElement category_ele;
	
	@CacheLookup
	@FindBy(name = "sub category")
	WebElement Sub_category_ele;
	
    @CacheLookup
   // @FindBy(xpath="label[contains(text(),'Tax')]/ancestor::div[1]/div[1]/input") 
    @FindBy(xpath="/html/body/div/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[5]/div/span/div/input") 
    WebElement Tax; 
	
    @CacheLookup
 //   @FindBy(xpath="//label[contains(text(),'Amount')]/ancestor::div[1]/div[1]/input") 
    @FindBy(xpath="/html/body/div/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[6]/div/div/span/div/input") 
    WebElement Amount; 

    @CacheLookup
   // @FindBy(xpath="//*[text()='Stock']/ancestor::div[1]/div[1]/input") 
    @FindBy(xpath="/html/body/div/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[7]/div/div/span/div/input")  
    WebElement Stock; 

    @CacheLookup
    @FindBy(xpath="//*[text()='Add Product']/ancestor::div[1]/button[2]") 
    WebElement Add_Product; 
    
	@CacheLookup
	@FindBy(xpath="//div[@class='el-upload el-upload--text']/input[@name['file']")
	WebElement file_ele;
    
    @CacheLookup
    @FindBy(xpath="//div[@class='el-message el-message--success']/p[1]")  
    WebElement notification_message_success;
    
    @CacheLookup
    @FindBy(className="el-message__content")  
    WebElement notification_message_error;
    
    
    
//------------------------------------------------------------------------------------------------------------------------------ 
//*Object of Add product with out variants will define here.
//*Data read from Data_source -> datafile_2
//
//------------------------------------------------------------------------------------------------------------------------------ 
    
	public Product_without_variation(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}


//------------------------------Add_product_page----------------------------------------------------
	public void Goto_Add_product_page() {
		
		try {
		
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, Add_Button,20);
		Wait_Utility.Sleep_wait(10000);
		Add_Button.click();

		
		}
		catch (StaleElementReferenceException e) {
			
			try {
WebElement elementName1 = driver.findElement(By.xpath("//div[@class='input-field colum col-xs-6 max599-w-100 max767-mt-15 text-right head-icons']/a[@class='el-tooltip el-icon-plus add-btn custom-btn ml-10 pull-right']"));
elementName1.click();
			//System.out.println(e);
			}
			catch (NoSuchElementException el) {
				
				Reporter.log("Already in Add Product page",true);
			}
			
		}
		catch (NoSuchElementException el) {
			
			System.out.println(el);
		}
		catch (Exception e) {
			System.out.println(e);
		}
	}
//------------------------------------product_variation_chkBox----------------------------------------------
	public void Add_product_variation_chkBox(){
		
		try {	
		
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, Variation_checkbox,20);
		Wait_Utility.Sleep_wait(5000);
		
		String styleVal = Variation_checkbox.getAttribute("class");//get check box class value
		
		if(styleVal.contains("is-checked")) {//only click the check box , if already checked
		Variation_checkbox.click();
		}
		}
		catch (StaleElementReferenceException e) {
WebElement elementName2 = driver.findElement(By.xpath("//div[@class='colum variation-enable']/label[1]/span[1]"));
elementName2.click();
		}
		catch (Exception e) {
			System.out.println(e);
		}}
//----------------------------------Add_product_name------------------------------------------------

	
	public void Add_productname(String prod_name){
		
		try {	
		
		Wait_Utility.Wait_for_Elmnt_Visible(driver, product_name,20);
		product_name.clear();
		product_name.sendKeys(prod_name);//Give product name input
		}
		catch (StaleElementReferenceException e) {
WebElement elementName3 = driver.findElement(By.name("product name"));
elementName3.clear();
elementName3.sendKeys(prod_name);
		}
		catch (Exception e) {
			System.out.println(e);
		}}

//-------------------------------Add_product_cat---------------------------------------------------
	
public void Add_product_cat(String category) throws Exception{
		int Category=0;
		try {	
			System.out.println("cat");
			 Category=Integer.parseInt(category);  
		if(Category==1)
		{
			cat_posi=Category;
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, category_ele,20);
			
			category_ele.click();
			Browser_Utillity.Loop_dropdown(driver, category_ele, cat_posi);
		}
		//else if(Category==0) {category_ele.clear(); }
		
		}
		catch (StaleElementReferenceException e) {
			WebElement elementName4 = driver.findElement(By.name("category"));
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName4,20);
			//if(Category==0) {elementName4.clear();}
			Wait_Utility.Sleep_wait(2000);
			elementName4.click();
Browser_Utillity.Loop_dropdown(driver, elementName4, cat_posi);
		}
		catch (Exception e) {
			System.out.println(e);
		}}

//-------------------------------Add_product_sub_cat---------------------------------------------------

public void Add_product_sub_cat(String sub_category) throws Exception
{
	int Sub_Category=0;
	try {
		System.out.println("s cat");
		 Sub_Category=Integer.parseInt(sub_category);  
		if(Sub_Category==1)
		{
			s_cat_posi=Sub_Category;
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Sub_category_ele,20);
			
			Sub_category_ele.click();
			Wait_Utility.Sleep_wait(5000);
			Browser_Utillity.Loop_dropdown(driver, Sub_category_ele, s_cat_posi);
		}
		
		
	}
	catch (StaleElementReferenceException e) {
		WebElement elementName5 = driver.findElement(By.name("sub category"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName5,20);
//		if(Sub_Category==0) {elementName5.clear();
//		Wait_Utility.Sleep_wait(2000);
//		}
		elementName5.click();
		Browser_Utillity.Loop_dropdown(driver, elementName5, s_cat_posi);
	}
	catch (Exception e) {
		System.out.println(e);
	}
	}
//--------------------------------TAX--------------------------------------------------

public void Add_product_tax(String tax){
	
	try {
		System.out.println("tax");
		
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, Tax,20);
		Tax.clear();
		Tax.sendKeys(tax);
		}
	catch (StaleElementReferenceException e) {
		
WebElement elementName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[5]/div/span/div/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.clear();
elementName.sendKeys(tax);

		
		
	}
		catch (Exception e) {
			System.out.println(e);
		}
}

//----------------------------AMOUNT------------------------------------------------------

public void Add_product_amount(String amt){
	
	try {
		
	
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Amount,20);
			Amount.clear();
			Amount.sendKeys(amt);	
		
	}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[6]/div/div/span/div/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.clear();
elementName.sendKeys(amt);
	}
		catch (Exception e) {
			System.out.println(e);
		}
}

//---------------------------------STOCK-------------------------------------------------

public void Add_product_stock(String stock){
	
	try {
		
		
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Stock,20);
			Stock.clear();
			Stock.sendKeys(stock);	
		
	}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[3]/div/span/form/div[1]/div[1]/div/div[7]/div/div/span/div/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.clear();
elementName.sendKeys(stock);	
	}
		catch (Exception e) {
			System.out.println("error in stock"+e);
		}
}

//---------------------------------IMAGE UPLOAD-------------------------------------------------

public void Add_Product_image(String Image_name) throws Exception{
	
	 
	if(!Image_name.isEmpty())
	{
		
	try {
		
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, file_ele,20);
		file_ele.sendKeys(dirpath+Image_name);
		Wait_Utility.Sleep_wait(5000);
		}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//div[@class='el-upload el-upload--text']/input[@name['file']"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.sendKeys(dirpath+Image_name);
Wait_Utility.Sleep_wait(5000);
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}



//-------------------------------SUBMIT---------------------------------------------------

public void Add_product_button(){
	
	try {
		
		
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Add_Product,20);
			Add_Product.click();
			
	}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//*[text()='Add Product']/ancestor::div[1]/button[2]"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.click();
	}
		catch (Exception e) {
			System.out.println(e);
		}
}		
		
public void Verify_test(int IsAddProductTrue,String scenario)
{	
	try {
		System.out.println(scenario);	
		
		String Msg = "";
		if(IsAddProductTrue==1)//success message
		{
			try {
				
				try {
					Wait_Utility.Sleep_wait(5000);
    	Wait_Utility.Wait_for_Elmnt_Clickable(driver, notification_message_success, 20);
    	 Msg = notification_message_success.getText();
    	 
				}
				catch (StaleElementReferenceException e1) {
					
					WebElement elementName6 = driver.findElement(By.xpath("//div[@class='el-message el-message--success']/p[1]"));
					Wait_Utility.Wait_for_Elmnt_Visible(driver, elementName6, 20);
					Msg  = elementName6.getText();
					
				}
catch (NoSuchElementException e) {System.out.println("Unable to add Product - Test Failed");}
				
				catch ( Exception e) {	System.out.println(e);	}	
    	
    	
    //	System.out.println(Msg);
    	if(Msg.contains("successfully"))
    	{
    					  
	    	System.out.println("Product added   - Test Pass");
    	}
			}

			catch (NoSuchElementException e) {
				
				System.out.println("Unable to add Product - Test Failed");
			}
    	
		}
		else if(IsAddProductTrue==0)
		{
			
			try {
				
				try {
					
    	Wait_Utility.Wait_for_Elmnt_Clickable(driver, notification_message_error, 20);
    	 Msg = notification_message_error.getText();
    	 System.out.println("trrtrtrt"+Msg);
    	 if(Msg==null) {
    		 Wait_Utility.Wait_for_Elmnt_Clickable(driver, notification_message_error, 20);
        	 Msg = notification_message_error.getText();
    	 }
    	
				}
				catch (StaleElementReferenceException e1) {
					
					WebElement elementName6 = driver.findElement(By.className("el-message__content"));
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName6, 20);
					Msg  = elementName6.getText();
					
				}
catch (NoSuchElementException e) {	System.out.println("Unable to perform action - Test Failed");	}
				
				
				catch ( Exception e) {	System.out.println("last"+e);	}	
    	
    	
    //	System.out.println(Msg);
    	if(Msg.contains("exists"))
    	{
    					  
    		System.out.println("Product already exists.- Test Pass");
    	}
			}

			catch (NoSuchElementException e) {
				
				System.out.println("Unable to perform action - Test Failed");
			}
		}
		
		else if(IsAddProductTrue==2) {
			
			try {
			//String atrbt = Add_Product.getAttribute("disabled");
			
			//System.out.println(atrbt);
			
			//if(atrbt=="disabled" || atrbt=="true" )
			//{
			//	System.out.println("Add Product button is disabled - Test pass");
			//}
				if(Add_Product.isEnabled()==false) { System.out.println("Add Product button is disabled - Test pass");}
			}
			catch (Exception e) {
				
				System.out.println(e);
			}
			
		}
		
	}
	catch (Exception e) {
		System.out.println("last"+e);
	}
      
}

}


