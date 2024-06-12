package utility;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Utility
{
	public static void Sleep_wait(int time_in_ms) throws Exception 
	{
	Thread.sleep(time_in_ms);
	}


	public static void waitForPageLoad(WebDriver driver) 
	{
		Wait<WebDriver> wait = new WebDriverWait(driver, 60);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				System.out.println("Current Window State       : "
						+ String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState")));
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
	}
	public static void Wait_for_Elmnt_Clickable(WebDriver driver, WebElement webelement,long timeOutForEachElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver,timeOutForEachElement);
            
            wait.until(ExpectedConditions.elementToBeClickable(webelement));
            
        }
        catch (Exception ex) {
            
        }
        
        }
	public static void Wait_for_Elmnt_Visible(WebDriver driver, WebElement webelement,long timeOutForEachElement) {
        try {
            WebDriverWait wait = new WebDriverWait(driver,timeOutForEachElement);
            
            wait.until(ExpectedConditions.visibilityOf(webelement));
            
        }
        catch (Exception ex) {
            
        }
        
        }





}