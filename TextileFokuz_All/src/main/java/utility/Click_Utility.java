package utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Click_Utility {
	
	public static void move_By_action(WebDriver driver, WebElement element)  throws Exception 
	{
		 try {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		 }
		 catch (Exception e) {
				System.out.println("Unable to move to element:"+e);
			}
	}

	public static void click_by_js(WebDriver driver, WebElement element) throws Exception 
	{
		try {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		}
		 catch (Exception e) {
				System.out.println(e);
			}

	}
	public static void scrool_to_view(WebDriver driver, WebElement ele) throws Exception 
	{
		try {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", ele);
		}
		 catch (Exception e) {
				System.out.println(e);
			}
		
	}
	public static void get_dropdownList(int position ,WebElement ele ) throws Exception 
	{
		try {
		List<WebElement> links = ele.findElements(By.tagName("li"));
	     
			//System.out.println("---test--->"+links);
		 links.get(position).click();
		 
		}
		 catch (Exception e) {
				System.out.println(e);
			}
	}

}
