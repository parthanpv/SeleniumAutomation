package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

public class Browser_Utillity {
//This method will create a folder in our project root , Folder name will be download as specified.------------------------>	
	public void  downloadpath()  throws Exception 
	{
		try {
	//creating a folder to download the excel file for importing.
	System.out.println("utility class begin");
	File downloadsDir = new File("");
	downloadsDir = new File(System.getProperty("user.dir") + File.separatorChar + "downloads");
	if (!downloadsDir.exists()) 
	{
    boolean ddCreated = downloadsDir.mkdir();
    if (!ddCreated)
    	{
        System.exit(1);
    	}
	}
		}
		  catch (Exception e) {
			System.out.println(e);
		}
	}
//This method is to set browser properties------------------------>
	public DesiredCapabilities desirecap()
	{
    	//Setting the properties of chrome browser and forcing to download in the specified folder
		String downloadFilepath = System.getProperty("user.dir") + File.separatorChar + "downloads";
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("profile.default_content_settings.popups", 0);
		chromePrefs.put("download.default_directory", downloadFilepath);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", chromePrefs);
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		cap.setCapability(ChromeOptions.CAPABILITY, options);
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + File.separatorChar + "Driver"+File.separatorChar +"chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput","true");
		
		return cap;
	}

//This method will save screenshot to screenshot folder------------------------>	
	 public static void takeSnapShot(WebDriver driver,String FileName)
	{
    //Take the screenshot
    File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
    
    //Copy the file to a location 
    try {
        FileUtils.copyFile(screenshot, new File(System.getProperty("user.dir") + File.separatorChar + "ScreenShots" +File.separatorChar +FileName+".png"));
    } catch (IOException e) {
        System.out.println(e.getMessage());
    }

	}
//This method will refresh current page------------------------>	
	 public static void Refresh_page(WebDriver driver)
	{
	 driver.navigate().refresh();
	}
	 
	 public static void Loop_dropdown(WebDriver driver,WebElement ele,int position) throws Exception
	{ 
 	if(position!=0)
 	{
 	for(int i=1;i<=position;i++)
 	{
 		ele.sendKeys(Keys.ARROW_DOWN);
 	}
	Wait_Utility.Sleep_wait(3000);
 	ele.sendKeys(Keys.ENTER);
 	
 	}
//-------------------------------------------------------
	}
	 public static void Loop_dropdown_multiple(WebDriver driver,WebElement ele,int position) throws Exception
	{ 
 	if(position!=0)
 	{
 	for(int i=1;i<=position;i++)
 	{
 		ele.sendKeys(Keys.ARROW_DOWN);
 		Wait_Utility.Sleep_wait(3000);
 	 	ele.sendKeys(Keys.ENTER);
 	}

 	
 	}
	}

}
