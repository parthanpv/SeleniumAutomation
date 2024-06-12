package testcases_product;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

import pageobjects.Left_SIde_menu;
import pageobjects.Login_object;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import test_base.base;
import utility.Browser_Utillity;
import utility.Excel_Utility;

public class TS_01_login  extends base {

	Excel_Utility util_obj = new Excel_Utility();

	@Test
	@Parameters("scenario")//
	  public void login(int param) throws Exception 
	  { //here goto url and enter username and password then click submit button
  		
	
		Login_object Login_obj = new Login_object(driver);
		
		
		
		Login_obj.loginWithCredantials(util_obj.Get_Exel_value(0,1,param),util_obj.Get_Exel_value(1,1,param));
		
		
	 }
}
