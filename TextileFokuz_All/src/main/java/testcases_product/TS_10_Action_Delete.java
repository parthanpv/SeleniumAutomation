package testcases_product;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.Action_product;
import pageobjects.Left_SIde_menu;
import test_base.base;
import utility.Excel_Utility;

public class TS_10_Action_Delete extends base {
	
	Left_SIde_menu Ls_obj = new Left_SIde_menu(driver); //Left side menu page's object
	Excel_Utility utility_cls_obj = new Excel_Utility(); //Excel utility object
	
	//------------------------------DELETE------------------------------------------
		@Test(enabled=true)
		@Parameters({"excel_start","excel_end"})
		public void action_delete(int excel_start,int excel_end) throws Exception 
		  { 
			Ls_obj.Click_Lead_in_SideMenu(driver);
			Action_product pro_obj = new Action_product(driver);
			pro_obj.Delete_Variation();

		  }
}
