package pageobjects;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import utility.Browser_Utillity;
import utility.Click_Utility;
import utility.Wait_Utility;

public class Product_with_variation_2 {

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
	@FindBy(name = "file")
	WebElement file_ele;
    
    @CacheLookup
    @FindBy(xpath="//div[@class='el-message el-message--success']/p[1]")  
    WebElement notification_message_success;
    
    @CacheLookup
    @FindBy(className="el-message__content")  
    WebElement notification_message_error;
    
    @CacheLookup
    @FindBy(xpath="//*[@id=\'app\']/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[1]/div/div/div/div[1]/input")  
    WebElement size;
    
    @CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[2]/div/div/div/div[1]/input")  
    WebElement color;
    
    @CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[3]/div/div/div/div[1]/input")  
    WebElement style;
    
    @CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[4]/div/div/div/div[1]/input")  
    WebElement packing_mode;
   
    @CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[5]/div/div/div/div[1]/input")  
    WebElement cup_size;
    
    @CacheLookup
    @FindBy(xpath="//*[text()='Add']/ancestor::div[1]/button[1]") 
    WebElement Add_Variation; 
    
    @CacheLookup
    @FindBy(xpath="//form['el-form col-xs-12']/div[3]/div[3]/table/tbody/tr/td[8]/div/div/span/div/input")  
    WebElement Stock_in_list;
    
    @CacheLookup
    @FindBy(xpath="//form['el-form col-xs-12']/div[3]/div[3]/table/tbody/tr/td[9]/div/div/span/div/input")  
    WebElement Amount_in_list;

    @CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div/div[3]/span/button[2]/span")  
    WebElement Confirm_button;
    
	@CacheLookup
    @FindBy(xpath="//form['el-form col-xs-12']/div[3]/div[3]/table/tbody/tr/td[7]/div/div/div/div/input")
	WebElement Add_image;

	@CacheLookup
    @FindBy(xpath="//p[@class='total-count pull-left']/span[1]")
	WebElement Total_count;
	
	@CacheLookup
    @FindBy(xpath="//*[text()='Add Product']") 
	WebElement page_title;
	
	@CacheLookup
    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[3]/div[4]/div[2]/table/tbody/tr/td[7]/div/a")
	WebElement Delete_icon;
	
    @CacheLookup
    @FindBy(xpath="//*[text()='Confirm']/ancestor::div[1]/span[1]/button[1]") 
    WebElement Confirm_delete; 
	
	@CacheLookup
	@FindAll(@FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[3]/div[3]/table/tbody/tr"))
	List <WebElement> rows;

    @CacheLookup
    @FindBy(xpath="//div[@class='el-message el-message--warning']/p[1]")  
    WebElement notification_message_warning;
    
	
   // @CacheLookup
   // @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[1]/div/div/span") 
   // WebElement Find_text; 
	
   // @CacheLookup
   // @FindBy(xpath="/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[2]/div/div/span") 
  //  WebElement Find_text_color;   
    
    
//------------------------------------------------------------------------------------------------------------------------------ 
//*Object of Add product with out variants will define here.
//*Data read from Data_source -> datafile_2
//
//------------------------------------------------------------------------------------------------------------------------------ 
    
	public Product_with_variation_2(WebDriver driver) {
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
		Wait_Utility.Sleep_wait(3000);
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

//---------------------------------SIZE-------------------------------------------------

public void Add_product_Size(String size_val) throws Exception{
	//int Size_val;
	// Size_val=Integer.parseInt(size_val);  
	 if(size_val!=null) {

	String[] animalsArray = size_val.split(",");
	int len = animalsArray.length;
	try {
		
		
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, size,20);
				size.click();
				Browser_Utillity.Loop_dropdown_multiple(driver, size, len);
				
	

		
	}
	catch (StaleElementReferenceException e) {
WebElement element_Size = driver.findElement(By.xpath("//*[@id=\\'app\\']/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[1]/div/div/div/div[1]/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Size,20);
element_Size.click();
Browser_Utillity.Loop_dropdown_multiple(driver, element_Size, len);

	}
		catch (Exception e) {
			System.out.println("error in stock"+e);
		}
		}
}

//---------------------------------COLOR-------------------------------------------------

public void Add_product_Color(String color_val) throws Exception{
	
	 if(color_val!=null) {
			String[] colorArray = color_val.split(",");
			int len = colorArray.length; 
		 
	try {
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, color,20);
			color.click();
			Browser_Utillity.Loop_dropdown_multiple(driver, color, len);
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, page_title,20);
			page_title.click();
		
	}
	catch (StaleElementReferenceException e) {
WebElement element_Color = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[2]/div/div/div/div[1]/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Color,20);
element_Color.click();
Browser_Utillity.Loop_dropdown_multiple(driver, element_Color, len);	
WebElement pageTitle_2 = driver.findElement(By.xpath("//*[text()='Add Product']"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, pageTitle_2,20);
pageTitle_2.click();


	}
		catch (Exception e) {
			System.out.println("error in color "+e);
		}
	 }
}

//---------------------------------Style-------------------------------------------------

public void Add_product_Style(String style_val) throws Exception{
	
	 if(style_val!=null) {
			String[] animalsArray = style_val.split(",");
			int len = animalsArray.length;
			
	try {
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, style,20);
			style.click();
			Browser_Utillity.Loop_dropdown_multiple(driver, style, len);
		
	}
	catch (StaleElementReferenceException e) {
WebElement element_Style = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[3]/div/div/div/div[1]/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Style,20);
element_Style.click();
Browser_Utillity.Loop_dropdown_multiple(driver, element_Style, len);	
	}
		catch (Exception e) {
			System.out.println("error in color "+e);
		}
	 }
}

//---------------------------------Packing Mode-------------------------------------------------

public void Add_product_Packing_Mode(String packingMode_val) throws Exception{
	
	 
	 if(packingMode_val!=null) {
		 String[] pnArray = packingMode_val.split(",");
			int len = pnArray.length;
	try {
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, packing_mode,20);
			style.click();
			Browser_Utillity.Loop_dropdown_multiple(driver, packing_mode, len);
		
	}
	catch (StaleElementReferenceException e) {
WebElement element_PackMode = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[4]/div/div/div/div[1]/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_PackMode,20);
element_PackMode.click();
Browser_Utillity.Loop_dropdown_multiple(driver, element_PackMode, len);	
	}
		catch (Exception e) {
			System.out.println("error in color "+e);
		}
	 }
}

//---------------------------------Cup-Size-------------------------------------------------

public void Add_product_Cup_Size(String cupSize_val) throws Exception{
	
	 if(cupSize_val!=null) {
			String[] csArray = cupSize_val.split(",");
			int len = csArray.length;
	try {
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, cup_size,20);
			style.click();
			Browser_Utillity.Loop_dropdown_multiple(driver, cup_size, len);
		
	}
	catch (StaleElementReferenceException e) {
WebElement element_CupSize = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[5]/div/div/div/div[1]/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_CupSize,20);
element_CupSize.click();
Browser_Utillity.Loop_dropdown_multiple(driver, element_CupSize, len);	
	}
		catch (Exception e) {
			System.out.println("error in color "+e);
		}
	 }
}

//---------------------------------Add_variation-------------------------------------------------

public void Add_variation(){
	
	try {
		
		
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Add_Variation,20);
			Add_Variation.click();
			
	}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//*[text()='Add']/ancestor::div[1]/button[1]"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.click();
	}
		catch (Exception e) {
			System.out.println(e);
		}
}	

//---------------------------------Add_Stock in list-------------------------------------------------

public void Add_stock(String stock_val){
	
	int Stock_val;
	Stock_val=Integer.parseInt(stock_val);  
	if(Stock_val>0)
	{
	try {
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Stock_in_list,20);
			Stock_in_list.sendKeys(stock_val);
			
		}
	catch (StaleElementReferenceException e) {
WebElement elementStockList = driver.findElement(By.xpath("//form['el-form col-xs-12']/div[3]/div[3]/table/tbody/tr/td[8]/div/div/span/div/input"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementStockList,20);
elementStockList.click();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}	

//---------------------------------Add_Amount in list-------------------------------------------------

public void Add_amount(String amount_val){
	
	int Amount_val;
	Amount_val=Integer.parseInt(amount_val);  
	if(Amount_val>0)
	{
	try {
		
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Amount_in_list,20);
			Amount_in_list.sendKeys(amount_val);
			
		}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//*[text()='Add']/ancestor::div[1]/button[1]"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.click();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}


//---------------------------------Add_Image in list-------------------------------------------------

public void Add_image(String Image_name){
	
 
	if(!Image_name.isEmpty())
	{
	try {
		
			
		Add_image.sendKeys(dirpath+Image_name);
			
		}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//i[@class='el-icon-plus avatar-uploader-icon']/input[@name['file']"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.sendKeys(dirpath+Image_name);
	}
		catch (Exception e) {
			System.out.println(e);
		}
	}
}

//-------------------------------SUBMIT---------------------------------------------------

public void Add_product_button() throws Exception{
	
	try {
		
		
		
		Click_Utility.scrool_to_view(driver, Add_Product);
			Add_Product.click();
			Wait_Utility.Wait_for_Elmnt_Clickable(driver, Confirm_button,20);
			Confirm_button.click();	
			
	}
	catch (StaleElementReferenceException e) {
WebElement elementName = driver.findElement(By.xpath("//*[text()='Add Product']/ancestor::div[1]/button[2]"));
Click_Utility.scrool_to_view(driver, elementName);
Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
elementName.click();

WebElement element_cnfm_btn = driver.findElement(By.xpath("//*[text()='Confirm']/ancestor::div[1]/button[2]	"));
Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_cnfm_btn,20);
element_cnfm_btn.click();

	}
		catch (Exception e) {
			System.out.println(e);
		}
}	
//-------------------------------------------VERIFY Message-------------------------------------------------


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
	}
	catch (Exception e) {
		System.out.println("last"+e);
	}
      
}
//----------------------------------Verify_variatrion_items-------------------------------------------------------------------

public int Verify_variatrion_items() throws Exception{
	
	 
	Wait_Utility.Sleep_wait(5000);
	int variatn_iem_count=0;
	try {
		
		System.out.println("ne");
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, size,20);
		size.click();
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, color,20);
		color.click();
			try {
				
				style.click();
			}
catch (NoSuchElementException el) {
				
				Reporter.log("Style can't be select now",true);
				
				variatn_iem_count++;
			}
			
			try {
				packing_mode.click();
				
			}
			
catch (NoSuchElementException el) {
				
				Reporter.log("packing mode can't be select now",true);
				variatn_iem_count++;
			}
			try {
				cup_size.click();
			}
			
catch (NoSuchElementException el) {
	
				try {
				
				Reporter.log("cup_size can't be select now",true);
				variatn_iem_count++;
				
				if(variatn_iem_count==3) {Reporter.log("Test pass",true);
				
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, page_title,20);
				page_title.click();
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, Delete_icon,20);
				Delete_icon.click();
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, Confirm_delete,20);
				Confirm_delete.click();
				
				
				}
				
				}	catch (StaleElementReferenceException e) {System.out.println(e);	}
			}
			
			
			
		}
	catch (StaleElementReferenceException e) {
		System.out.println(e);	
//WebElement elementName = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[1]/div/div/span"));
//Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
//elementName.click();
	}
		catch (Exception e) {
			System.out.println(e);
		}
	return variatn_iem_count;
	}

//---------------------------------Get_variation_count-------------------------------------------------

public int Get_variation_count(){
	int variatn_count=0;
	try {
		
		
		Wait_Utility.Sleep_wait(5000);
		 variatn_count=rows.size();
			//System.out.println(rows.size());
	}
	catch (StaleElementReferenceException e) {
		System.out.println(e);

	}
		catch (Exception e) {
			System.out.println(e);
		}
	return variatn_count;
}
//-----------------------------Get_variation_warning_for_duplicate--------------------------------------------------

public void Get_variation_warning_for_duplicate(){
	
	try {
		Wait_Utility.Wait_for_Elmnt_Visible(driver, notification_message_warning, 20);
		String nw = notification_message_warning.getText();
		if(nw.contains("Variation Already Exists"))
		{
			Reporter.log("Test pass ",true);
		}
		
	}
	catch (StaleElementReferenceException e) {
		System.out.println(e);

	}
		catch (Exception e) {
			System.out.println(e);
		}
	
}	


	
	
}
