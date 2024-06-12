package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Left_SIde_menu;
import pageobjects.Login_object;
import pageobjects.Product_without_variation;
import test_base.base;
import utility.Excel_Utility;

public class TS_02_AddProduct_No_variations extends base {

	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	@Test
	@Parameters({"excel_start","excel_end","IsAddProductTrue"})
	
	public void add_product(int excel_start,int excel_end,int IsAddProductTrue) throws Exception 
	  { //here goto url and enter username and password then click submit button
  		
	
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Product_without_variation pro_obj = new Product_without_variation(driver);
		
	  	for(int j=excel_start;j<=excel_end;j++)
	  	{
		pro_obj.Goto_Add_product_page();
		
		pro_obj.Add_product_variation_chkBox();	
		pro_obj.Add_productname(utility_cls_obj.Get_Exel_value(1,0,j));
		pro_obj.Add_product_cat(utility_cls_obj.Get_Exel_value(2,0,j));
		pro_obj.Add_product_sub_cat(utility_cls_obj.Get_Exel_value(3,0,j));
		pro_obj.Add_product_tax(utility_cls_obj.Get_Exel_value(4,0,j));
		pro_obj.Add_product_amount(utility_cls_obj.Get_Exel_value(5,0,j));
		pro_obj.Add_product_stock(utility_cls_obj.Get_Exel_value(6,0,j));
		String imgenb = utility_cls_obj.Get_Exel_value(7,0,j);
	//	int Imgenb=Integer.parseInt(imgenb);  
		if(imgenb=="testimage.jpg") {pro_obj.Add_Product_image(imgenb);}
			
		pro_obj.Add_product_button();
		pro_obj.Verify_test(IsAddProductTrue,utility_cls_obj.Get_Exel_value(0,0,j));
		
	  	}
	 }
}
