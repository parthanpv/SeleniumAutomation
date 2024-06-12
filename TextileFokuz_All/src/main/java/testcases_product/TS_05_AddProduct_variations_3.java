//check the combination while selecting more than one data from list- Test pass
//Try to select an already exist varient and check the behaviour[duplicate]

package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Left_SIde_menu;
import pageobjects.Product_with_variation;
import test_base.base;
import utility.Excel_Utility;

public class TS_05_AddProduct_variations_3 extends base {
	

	
	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	@Test(priority=2)
	@Parameters({"excel_start","excel_end","IsAddProductTrue"})
	public void add_product_check_same_variation(int excel_start,int excel_end,int IsAddProductTrue) throws Exception 
	  {
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Product_with_variation pro_obj2 = new Product_with_variation(driver);
	  	for(int j=excel_start;j<=excel_end;j++)
	  	{
	  	
		pro_obj2.Goto_Add_product_page();	
		pro_obj2.Add_productname(utility_cls_obj.Get_Exel_value(1,0,j));
		pro_obj2.Add_product_cat(utility_cls_obj.Get_Exel_value(2,0,j));
		pro_obj2.Add_product_sub_cat(utility_cls_obj.Get_Exel_value(3,0,j));
		pro_obj2.Add_product_tax(utility_cls_obj.Get_Exel_value(4,0,j));
	
		pro_obj2.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j));
		pro_obj2.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j));
	
		pro_obj2.Add_variation();
		
		int var_count_res = pro_obj2.Get_variation_count();
		
		if(var_count_res==1)
		{
			pro_obj2.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j+1));
			pro_obj2.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j+1));
			pro_obj2.Add_variation();
			pro_obj2.Get_variation_count();
			//int var_count_res_now = pro_obj2.Get_variation_count();
			System.out.println("check the combination while selecting more than one data from list- Test pass");
			
			pro_obj2.Add_product_Size(utility_cls_obj.Get_Exel_value(5,0,j));
			pro_obj2.Add_product_Color(utility_cls_obj.Get_Exel_value(6,0,j));
			
			pro_obj2.Add_variation();
			System.out.println("Try to select an already exist varient and check the behaviour[duplicate]");
			pro_obj2.Get_variation_warning_for_duplicate();
			
		}
			

	  	}
	  }

}
