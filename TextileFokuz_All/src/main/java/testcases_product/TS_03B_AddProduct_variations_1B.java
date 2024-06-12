package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Left_SIde_menu;
import pageobjects.Product_with_variation;
import test_base.base;
import utility.Excel_Utility;

public class TS_03B_AddProduct_variations_1B extends base {

	
	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	@Test(priority=1)
	@Parameters({"excel_start","excel_end","IsAddProductTrue"})
	public void add_product(int excel_start,int excel_end,int IsAddProductTrue) throws Exception 
	  { //here goto url and enter username and password then click submit button
  		
	
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Product_with_variation pro_obj = new Product_with_variation(driver);
		
	  	for(int j=excel_start;j<=excel_end;j++)
	  	{
		pro_obj.Goto_Add_product_page();		
		pro_obj.Add_productname(utility_cls_obj.Get_Exel_value(1,0,j));
		pro_obj.Add_product_cat(utility_cls_obj.Get_Exel_value(2,0,j));
		pro_obj.Add_product_sub_cat(utility_cls_obj.Get_Exel_value(3,0,j));
		pro_obj.Add_product_tax(utility_cls_obj.Get_Exel_value(4,0,j));
		pro_obj.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j));
		pro_obj.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Style(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Packing_Mode(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Cup_Size(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_variation();
		pro_obj.Add_stock(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_amount(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_image(utility_cls_obj.Get_Exel_value(10,0,j));
		pro_obj.Add_product_button();
		pro_obj.Verify_test(IsAddProductTrue,utility_cls_obj.Get_Exel_value(0,0,j));
		pro_obj.Get_product_page_title();
	  	}
	 }
	
}
