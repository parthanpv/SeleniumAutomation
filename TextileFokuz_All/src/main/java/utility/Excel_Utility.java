package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Utility {

	
	//This method will return data in excel sheet-datafile_2----------------------->	
		public String Get_Exel_value(int cell_positn,int Sheet_positn,int row_positn) throws IOException
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separatorChar + "Data_source" +File.separatorChar +"datafile_2.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(Sheet_positn);
	              
			Row row = sheet.getRow(row_positn);
			DataFormatter df = new DataFormatter();
			
			String value = df.formatCellValue(row.getCell(cell_positn));
			
			return value;
		}
		//This method will return data in excel sheet-datafile_2----------------------->	
		public String Get_Exel_value_import(int cell_positn,int Sheet_positn,int row_positn) throws IOException
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separatorChar + "Data_source" +File.separatorChar +"datafile.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(Sheet_positn);
	              
			Row row = sheet.getRow(row_positn);
			DataFormatter df = new DataFormatter();
			
			String value = df.formatCellValue(row.getCell(cell_positn));
			
			return value;
		}
	//This method will return row count in excel sheet------------------------>	
		public int Get_Exel_Count(String sheetname,int sheet_position) throws IOException
		{
		int colNum;
		FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separatorChar + "Data_source" +File.separatorChar +sheetname+".xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheetAt(sheet_position);
		colNum = sheet.getLastRowNum();	
		
		return colNum;
			}
//This method will return Scenario sheet data ------------------------>	
		public static String Get_Exel_value(int excel_positn,int row_of_scenario) throws IOException
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separatorChar + "Scenario_Sheet" +File.separatorChar +"AutomationTestScenario.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(0);
	              
			Row row = sheet.getRow(row_of_scenario);
			DataFormatter df = new DataFormatter();
			
			String value = df.formatCellValue(row.getCell(excel_positn));
			
			return value;
		}
		//This method will return data in excel sheet-datafile_2----------------------->	
		public static ArrayList<String> Get_Exel_value(String sheetname,int Sheet_positn,int row_positn,int cell_positn_f,int cell_positn_to) throws IOException
		{
			FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + File.separatorChar + "Data_source" +File.separatorChar +sheetname+".xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet = workbook.getSheetAt(Sheet_positn);
			
			ArrayList<String> Actvity = new ArrayList<String>(); // Create an ArrayList 
    
			Row row = sheet.getRow(row_positn);//row_positn is excel start val specified in xml
			System.out.println(row_positn+"oo"+cell_positn_f+"ooo"+cell_positn_to);
			for(int i=cell_positn_f;i<=cell_positn_to;i++)
			{
			DataFormatter df = new DataFormatter();
			
			String value = df.formatCellValue(row.getCell(i));
			Actvity.add(value);//store all cell values of the particular row
			}
			System.out.println(Actvity);
			return Actvity;
		}
}
