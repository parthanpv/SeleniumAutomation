package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Action_product;
import pageobjects.Left_SIde_menu;
import pageobjects.Product_List_Search;
import test_base.base;
import utility.Excel_Utility;

public class TS_09_Product_Search extends base {
	
	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	@Test(enabled=true)
	@Parameters({"excel_start","excel_end"})
	public void Search_of_product(int excel_start,int excel_end) throws Exception 
	  { 
		Ls_obj.Click_Lead_in_SideMenu(driver);
		Product_List_Search pro_obj = new Product_List_Search(driver);
	  	for(int j=excel_start;j<=excel_end;j++)
	  	{
		pro_obj.Search(utility_cls_obj.Get_Exel_value(1,0,j));
		
		int Search_count = pro_obj.Get_srch_count();
		System.out.println("Verify serach with valid data");
		if(Search_count!=0)
		{
			
			System.out.println("Test Pass");
		}
		if(Search_count==0)
		{
			
			System.out.println("Test Failed");
		}
		
		
		
		pro_obj.Search("#RRWEWEEW");
		
		int Search_count2 = pro_obj.Get_srch_count();
		System.out.println("Verify serach with in-valid data");
		
		if(Search_count==0)
		{
			
			System.out.println("Test Pass");
		}
		if(Search_count!=0)
		{
			
			System.out.println("Test Failed");
		}
	  	}
	  }
}
