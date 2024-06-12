package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utility.Browser_Utillity;
import utility.Click_Utility;
import utility.Wait_Utility;

public class Action_product {

	WebDriver driver;
	
	@CacheLookup
    @FindBy(xpath="//i[@class='el-icon-more user-action el-icon--right']")
	WebElement menu_Icon;
	
	@CacheLookup
    @FindBy(xpath="//class[@class='el-table__row']/td[6]/div/div[1]/span/i")
	WebElement menu_Icon_2;
	
	@CacheLookup
    @FindBy(xpath="/html/body/ul/li[1]")
	WebElement menu_list;
	
	@CacheLookup
    @FindBy(xpath="/html/body/ul/li[2]")
	WebElement menu_list2;
	
	@CacheLookup
    @FindBy(xpath="/html/body/ul/li[3]")
	WebElement menu_list3;
	
    @CacheLookup
    @FindBy(xpath="//*[text()='Delete Product']/ancestor::div[2]/div[3]/span[1]/button[1]") 
    WebElement Click_confirm_Button;
	
	@CacheLookup
    @FindBy(xpath="/html/body/ul/li[4]")
	WebElement menu_list4;
	
	
	
	
	 	@CacheLookup
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div[1]/span/div[1]/form/div[2]/div/span[1]/div/div/div/div[1]/input")  
	    WebElement size;
	    
	    @CacheLookup
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div[1]/span/div[1]/form/div[2]/div/span[2]/div/div/div/div[1]/input")  
	    WebElement color;
	    
	    @CacheLookup
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div[1]/span/div[1]/form/div[2]/div/span[3]/div/div/div/div[1]/input")  
	    WebElement style;
	    
	    @CacheLookup
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div[1]/span/div[1]/form/div[2]/div/span[4]/div/div/div/div[1]/input")  
	    WebElement packing_mode;
	   
	    @CacheLookup
	    @FindBy(xpath="/html/body/div[1]/div/div[2]/div[6]/div[1]/span/div[1]/form/div[2]/div/span[5]/div/div/div/div[1]/input")  
	    WebElement cup_size;
	    
	    @CacheLookup
	    @FindBy(xpath="//*[text()='Add Variations']/ancestor::div[1]/h4[1]") 
	    WebElement Click_Add_Variations_Text; 
	    
	    @CacheLookup
	    @FindBy(xpath="//*[text()='Add']/ancestor::div[1]/button[1]") 
	    WebElement Click_Add_Button;
	    
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
	    @FindBy(xpath="/html/body/div/div/div[2]/div[5]/div[1]/div[2]/span/form/div/div/span/div/input")
		WebElement Edit_Tax;
		
		@CacheLookup
	    @FindBy(xpath="//a[@class='remove-exist-variation']/i[1]")
		WebElement Remove_ext_var;
	
	//------------------------------------------------------------------------------------------------------------------------------ 
	//*Object of Add product with out variants will define here.
	//*Data read from Data_source -> datafile_2
	//
	//------------------------------------------------------------------------------------------------------------------------------ 
	    
		public Action_product(WebDriver driver) {
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}
		
//-----------------------------------------------------------------------------------
		
		public void View_product() throws Exception
		{
			
		try {	
			
			Wait_Utility.Wait_for_Elmnt_Visible(driver, menu_Icon,20);
			Wait_Utility.Sleep_wait(5000);
			menu_Icon.click();
			Wait_Utility.Sleep_wait(5000);
			
			menu_list.click();
			}
			catch (StaleElementReferenceException e) {
				
	WebElement elementName1 = driver.findElement(By.xpath("//i[@class='el-icon-more user-action el-icon--right']"));
	Wait_Utility.Sleep_wait(5000);
	
				elementName1.click();
				
			//	Browser_Utillity.Loop_dropdown(driver, elementName1, 1);
				//Click_Utility.get_dropdownList(1, elementName2);+
				Wait_Utility.Sleep_wait(5000);
				WebElement elementName2 = driver.findElement(By.xpath("/html/body/ul/li[1]"));
				elementName2.click();
				
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
		}

//---------------------------ADD VARIATION--------------------------------------------------------->>
		
		public void Add_Variation() throws Exception
		{
			
		try {	
			
			Wait_Utility.Wait_for_Elmnt_Visible(driver, menu_Icon,20);
			Wait_Utility.Sleep_wait(5000);
			menu_Icon.click();
			Wait_Utility.Sleep_wait(5000);
			
			menu_list.click();
			}
			catch (StaleElementReferenceException e) {
				
	WebElement elementName1 = driver.findElement(By.xpath("//i[@class='el-icon-more user-action el-icon--right']"));
	Wait_Utility.Sleep_wait(5000);
	
				elementName1.click();
				
			//	Browser_Utillity.Loop_dropdown(driver, elementName1, 1);
				//Click_Utility.get_dropdownList(1, elementName2);+
				Wait_Utility.Sleep_wait(5000);
				WebElement elementName2 = driver.findElement(By.xpath("/html/body/ul/li[2]"));
				elementName2.click();
				
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
		}
		
//---------------------------Delete VARIATION--------------------------------------------------------->>
		
public void Delete_Variation() throws Exception
{
					
				try {	
					
					Wait_Utility.Wait_for_Elmnt_Visible(driver, menu_Icon,20);
					Wait_Utility.Sleep_wait(5000);
					menu_Icon.click();
					Wait_Utility.Sleep_wait(5000);
					menu_list3.click();
					Wait_Utility.Sleep_wait(5000);
					Click_confirm_Button.click();
					}
					catch (StaleElementReferenceException e) {
						
			WebElement elementName1 = driver.findElement(By.xpath("//i[@class='el-icon-more user-action el-icon--right']"));
			Wait_Utility.Sleep_wait(5000);
			elementName1.click();
						

						Wait_Utility.Sleep_wait(5000);
						WebElement elementName2 = driver.findElement(By.xpath("/html/body/ul/li[3]"));
						elementName2.click();
						
						WebElement elementName3 = driver.findElement(By.xpath("//*[text()='Delete Product']/ancestor::div[2]/div[3]/span[1]/button[1]"));
						Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName3,20);
						try {
						elementName3.click();
						System.out.println("Product deleted successfully: Test Pass");
						}
						catch (Exception e2) {System.out.println(e2);}
						
						
					}
					catch (Exception e) {
						System.out.println(e);
						
					}
}
	

//---------------------------EDIT TAX--------------------------------------------------------->>

		public void Edit_tax() throws Exception
		{
			
		try {	
			
			Wait_Utility.Wait_for_Elmnt_Visible(driver, menu_Icon,20);
			Wait_Utility.Sleep_wait(5000);
			menu_Icon.click();
			Wait_Utility.Sleep_wait(5000);
			
			menu_list4.click();
			System.out.println("3233");
			}
			catch (StaleElementReferenceException e) {
				
	WebElement elementName1 = driver.findElement(By.xpath("//i[@class='el-icon-more user-action el-icon--right']"));
	Wait_Utility.Sleep_wait(5000);
	
				elementName1.click();
				
				Wait_Utility.Sleep_wait(5000);
				WebElement elementName2 = driver.findElement(By.xpath("/html/body/ul/li[4]"));
				elementName2.click();
				
				//WebElement elementName3 = driver.findElement(By.xpath("//form[@class='el-form']/following-sibling::div[@class='col-xs-12 mt-20 text-right drawer-footer']/button[2]")) ;
				//Wait_Utility.Wait_for_Elmnt_Visible(driver, elementName3,20);
				//elementName3.clear();
				//elementName3.sendKeys("18");		
//				
				WebElement elementName4 = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[5]/div[1]/div[2]/span/div/button[2]/span"));
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName4,20);
				elementName4.click();
				
				
			}
			catch (Exception e) {
				System.out.println(e);
				
			}
		}
	
//---------------------------Deactivate_Activate--------------------------------------------------------->>

				public void Deactivate_activate() throws Exception
				{
					
				try {	
					
					Wait_Utility.Wait_for_Elmnt_Visible(driver, menu_Icon,20);
					Wait_Utility.Sleep_wait(5000);
					menu_Icon.click();
					Wait_Utility.Sleep_wait(5000);
					
					menu_list4.click();
					System.out.println("3233");
					}
					catch (StaleElementReferenceException e) {
						
			WebElement elementName1 = driver.findElement(By.xpath("//i[@class='el-icon-more user-action el-icon--right']"));
			Wait_Utility.Sleep_wait(5000);
			
						elementName1.click();
						
						Wait_Utility.Sleep_wait(5000);
						WebElement elementName2 = driver.findElement(By.xpath("/html/body/ul/li[5]"));
						elementName2.click();
						Wait_Utility.Sleep_wait(5000);
						
						elementName1.click();
						Wait_Utility.Sleep_wait(5000);
						WebElement elementName3 = driver.findElement(By.xpath("/html/body/ul/li[2]"));
						elementName3.click();
						
						
					}
					catch (Exception e) {
						System.out.println(e);
						
					}
				}
		
//---------------------------------ADD VARIATION -> SIZE-------------------------------------------------

		public void Add_product_Size(String size_val) throws Exception{
			int Size_val;
			 Size_val=Integer.parseInt(size_val);  
			 if(Size_val>0) {
			try {
				
				
						Wait_Utility.Wait_for_Elmnt_Clickable(driver, size,20);
						size.click();
						Browser_Utillity.Loop_dropdown(driver, size, Size_val);
						
			

				
			}
			catch (StaleElementReferenceException e) {
		WebElement element_Size = driver.findElement(By.xpath("//*[@id=\\'app\\']/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[1]/div/div/div/div[1]/input"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Size,20);
		element_Size.click();
		Browser_Utillity.Loop_dropdown(driver, element_Size, Size_val);

			}
				catch (Exception e) {
					System.out.println("error in stock"+e);
				}
				}
		}

//---------------------------------ADD VARIATION -> COLOR-------------------------------------------------

		public void Add_product_Color(String color_val) throws Exception{
			int Color_val;
			Color_val=Integer.parseInt(color_val);  
			 if(Color_val>0) {
			try {
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, color,20);
					color.click();
					Browser_Utillity.Loop_dropdown(driver, color, Color_val);
				
			}
			catch (StaleElementReferenceException e) {
		WebElement element_Color = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[2]/div/div/div/div[1]/input"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Color,20);
		element_Color.click();
		Browser_Utillity.Loop_dropdown(driver, element_Color, Color_val);	
			}
				catch (Exception e) {
					System.out.println("error in color "+e);
				}
			 }
		}

//---------------------------------ADD VARIATION -> Style-------------------------------------------------

		public void Add_product_Style(String style_val) throws Exception{
			int Style_val;
			Style_val=Integer.parseInt(style_val);  
			 if(Style_val>0) {
			try {
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, style,20);
					style.click();
					Browser_Utillity.Loop_dropdown(driver, style, Style_val);
				
			}
			catch (StaleElementReferenceException e) {
		WebElement element_Style = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[3]/div/div/div/div[1]/input"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_Style,20);
		element_Style.click();
		Browser_Utillity.Loop_dropdown(driver, element_Style, Style_val);	
			}
				catch (Exception e) {
					System.out.println("error in color "+e);
				}
			 }
		}

//---------------------------------ADD VARIATION -> Packing Mode-------------------------------------------------

		public void Add_product_Packing_Mode(String packingMode_val) throws Exception{
			int PackingMode_val;
			PackingMode_val=Integer.parseInt(packingMode_val);  
			 if(PackingMode_val>0) {
			try {
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, packing_mode,20);
					style.click();
					Browser_Utillity.Loop_dropdown(driver, packing_mode, PackingMode_val);
				
			}
			catch (StaleElementReferenceException e) {
		WebElement element_PackMode = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[4]/div/div/div/div[1]/input"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_PackMode,20);
		element_PackMode.click();
		Browser_Utillity.Loop_dropdown(driver, element_PackMode, PackingMode_val);	
			}
				catch (Exception e) {
					System.out.println("error in color "+e);
				}
			 }
		}

//---------------------------------ADD VARIATION -> Cup-Size-------------------------------------------------

		public void Add_product_Cup_Size(String cupSize_val) throws Exception{
			int CupSize_val;
			CupSize_val=Integer.parseInt(cupSize_val);  
			 if(CupSize_val>0) {
			try {
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, cup_size,20);
					style.click();
					Browser_Utillity.Loop_dropdown(driver, cup_size, CupSize_val);
				
			}
			catch (StaleElementReferenceException e) {
		WebElement element_CupSize = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/span/form/div[1]/div[2]/div/div/div/div/span[5]/div/div/div/div[1]/input"));
		Wait_Utility.Wait_for_Elmnt_Clickable(driver, element_CupSize,20);
		element_CupSize.click();
		Browser_Utillity.Loop_dropdown(driver, element_CupSize, CupSize_val);	
			}
				catch (Exception e) {
					System.out.println("error in color "+e);
				}
			 }
		}
		
		

//---------------------------------ADD VARIATION -> Add_variation_Text-------------------------------------------------

public void Add_variation_Text(){
					
					try {
						
							Wait_Utility.Wait_for_Elmnt_Clickable(driver, Click_Add_Variations_Text,20);
							Click_Add_Variations_Text.click();
							
					}
					catch (StaleElementReferenceException e) {
				WebElement elementName = driver.findElement(By.xpath("//*[text()='Add Variations']/ancestor::div[1]/h4[1]"));
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
				elementName.click();
					}
						catch (Exception e) {
							System.out.println(e);
						}
				}		

//---------------------------------ADD VARIATION -> Add_ButtonClick-------------------------------------------------

		public void Add_Button_Click(){
			
			try {
				
				
				
					Wait_Utility.Wait_for_Elmnt_Clickable(driver, Click_Add_Button,20);
					Click_Add_Button.click();
					
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
		
//---------------------------------Remove ext var-------------------------------------------------

				public void Remove_ext_var(){
					
					try {
						
						
						
							Wait_Utility.Wait_for_Elmnt_Clickable(driver, Remove_ext_var,20);
							Remove_ext_var.click();
							
					}
					catch (StaleElementReferenceException e) {
				WebElement elementName = driver.findElement(By.xpath("//a[@class='remove-exist-variation']/i[1]"));
				Wait_Utility.Wait_for_Elmnt_Clickable(driver, elementName,20);
				elementName.click();
					}
						catch (Exception e) {
							System.out.println(e);
						}
				}
	

		
}
