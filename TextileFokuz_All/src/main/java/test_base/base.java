package test_base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utility.Browser_Utillity;
import utility.Wait_Utility;
public class base {
	Browser_Utillity utilityobj = new Browser_Utillity();
	        
	public static WebDriver driver;
		
		@SuppressWarnings("deprecation")
		@BeforeTest
		
		public void Start()
		{
			
			Reporter.log("=====Browser Session Started=====", true);
			DesiredCapabilities cap =utilityobj.desirecap();
	        driver=new ChromeDriver(cap);
			
			driver.manage().window().maximize();
	      	driver.get("http://textiles.salesfokuz.in/");

			
			
			Reporter.log("=====Application Started=====", true);
		}
		
//		@AfterTest
//		public void Close() throws Exception
//		{
//			//Wait_Utility.Sleep_wait(15000);
//			//System.exit(0);
//		}
		
		

	
}
