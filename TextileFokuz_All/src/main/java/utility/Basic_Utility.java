package utility;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Basic_Utility {
	
	public static void get_count(WebDriver driver, WebElement element)  throws Exception 
	{
		 try {
		Actions action = new Actions(driver);
		action.moveToElement(element).build().perform();
		 }
		 catch (Exception e) {
				System.out.println("Unable to move to element:"+e);
			}
	}
	
	public static String get_count_product(WebDriver driver, WebElement element)  throws Exception 
	{
		String name = "";
		 try {
			 name= element.getText();
		 }
		 catch (Exception e) {
				System.out.println("Unable to move to element:"+e);
			}
		 return name;
	}
	
	public static void delete_files(File file)  throws Exception 
	{
		 try {
		       // File file = new File(path);
		        File[] files = file.listFiles(); 
		        for (File f:files) 
		        {if (f.isFile() && f.exists()) 
		            { f.delete();
		            System.out.println("successfully deleted");
		            }else{
		            	System.out.println("cant delete a file due to open or error");
		}
		        }
		 }
		 catch (Exception e) {
				System.out.println("Unable to move to element:"+e);
			}
	}
	public static String Correct_Date_Format(String  date_val)  throws Exception 
	{
		int month_to_int = 0;
		String Date = null;
		 try {
		  
		  	 String[] args = date_val.split("/");
		  	String month = args[0];	String day = args[1];String year = args[2];
			 month_to_int=Integer.parseInt(month); 
			 
	    		if(month_to_int<=9)//if < 9 prefix 0, because month format is mm
	    		{
	    			 Date = day+"-0"+month+"-20"+year;
	    		  }	
	    		else
	    		   {
	    			
	    			 Date = day+"-"+month+"-20"+year;
	    		    
	    		   }  
			
		 }
		 catch (Exception e) {
				System.out.println("Unable to move to element:"+e);
			}
		
		
		return Date;
	}
	

}
