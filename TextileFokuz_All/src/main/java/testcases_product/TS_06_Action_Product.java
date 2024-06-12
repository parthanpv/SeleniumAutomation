package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Left_SIde_menu;
import pageobjects.Action_product;
import test_base.base;
import utility.Excel_Utility;

public class TS_06_Action_Product extends base {
	
	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	@Test(enabled=false)
	@Parameters({"excel_start","excel_end"})
	public void action_of_product(int excel_start,int excel_end) throws Exception 
	  { 
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Action_product pro_obj = new Action_product(driver);
		
		
		pro_obj.View_product();
		
		
	  }
	
	@Test(enabled=true,priority=2)
	@Parameters({"excel_start","excel_end"})
	public void action_add_variation(int excel_start,int excel_end) throws Exception 
	  { 
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Action_product pro_obj = new Action_product(driver);
		
		for(int j=excel_start;j<=excel_end;j++)
	  	{
		pro_obj.Add_Variation();
		pro_obj.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j));
		pro_obj.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Style(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Packing_Mode(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Cup_Size(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_variation_Text();
		pro_obj.Add_Button_Click();
		pro_obj.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j));
		pro_obj.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Style(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Packing_Mode(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_product_Cup_Size(utility_cls_obj.Get_Exel_value(6,0,j));
		pro_obj.Add_variation_Text();
		pro_obj.Add_Button_Click();
		pro_obj.Remove_ext_var();
	  	}
	  }
	
	


	

}
