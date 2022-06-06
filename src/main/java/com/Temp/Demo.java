package com.Temp;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.RandomStringUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo {
	
	public static XSSFSheet ExcelWSheet;
	public static XSSFWorkbook ExcelWBook;
	public static XSSFCell Cell;
	public static XSSFRow Row;
	static DataFormatter formatter = new DataFormatter();
	
	public static void main(String arg[]) throws IOException
	{	

//		File driverpath = new File("Resource/chromedriver.exe");
//		String path1 = driverpath.getAbsolutePath();
//		System.setProperty("webdriver.chrome.driver",path1);
//		WebDriver driver= new ChromeDriver();
//		driver.get("http://the-internet.herokuapp.com/iframe");
//		driver.switchTo().frame(0);
//		
//		Demo.jsType(driver, driver.findElement(By.xpath("//p")), "Hello");

		
		// String s = "KIWIQAWphebkNG";
		// System.out.println(s.toUpperCase());
	

		String str = "Purchase Order 22-23/PO/CT2/000284 Cteated Successfully.";
  
        String[] arrOfStr = str.split(" ");
  
        // System.out.println(arrOfStr[2]);
		
		String[] arrOfStr1 = arrOfStr[2].split("/");
		
        System.out.println(arrOfStr1[3]);
  


	}
	
	public static void jsType(WebDriver driver, WebElement element,String value)
	{
		String je="return arguments[0].value='"+value+"';";
		((JavascriptExecutor) driver).executeScript(je, element);
	}
	
	public static String nameis() {
		
		String url = "https://mb-qa1.my.matchbookservices.com/";
		 String val = url.replaceFirst("https://", " ");
		 String valueis = val.replaceFirst(".my.matchbookservices.com/", " ");
		System.out.println(" Value is "+valueis);
		return url;
	}
	
	public static String generateRandomChars(int length) 
	{
		String random = RandomStringUtils.randomAlphabetic(length);
		return random;
	}
	
	public static int randomBetween(int minimum,int maximum) 
	{
		return new Random().nextInt(maximum - minimum + 1) + minimum;
	}
	
	
	public static String renameFile()
	{
		File folder = new File("DownloadData/");
		File[] listOfFiles = folder.listFiles();

		for (int i = 0; i < listOfFiles.length; i++) {
		  if (listOfFiles[i].isFile()) {
		    System.out.println("File " + listOfFiles[i].getName());
		    //System.out.println("First File " + listOfFiles[0].getName());
		  } else if (listOfFiles[i].isDirectory()) {
		    System.out.println("Directory " + listOfFiles[i].getName());
		  }
		  
		  System.out.println(" First File ===> " + listOfFiles[0].getName()); 
		}
		return listOfFiles[0].getName();
	}
	
	
	public static String getCellData(int RowNum, String Header) throws Exception {
		try {
			String value = formatter.formatCellValue(ExcelWSheet.getRow(RowNum).getCell(readHeader(Header)));
			return value;
		} catch (Exception e) {
			return "";
		}
	}
	
	public static int readHeader(String Header) {
		try {
			int colNum = ExcelWSheet.getRow(0).getLastCellNum();
			Row = ExcelWSheet.getRow(0);
			for (int j = 0; j < colNum; j++) {
				Cell = Row.getCell(j);
				String cellValue = formatter.formatCellValue(Cell);
				if (cellValue.equalsIgnoreCase(Header)) {
					return j;
				}

			}
		} catch (Exception e) {
		}
		return -1;
	}
	
	 public static ArrayList<String>  getColumnData(String Filepath,String sheetname, String header) throws IOException
	   	{
	   		int rownum=0;
	   		ArrayList<String> code = new  ArrayList<String>();
	   		formatter = new DataFormatter();
	   		FileInputStream	fin = new FileInputStream(Filepath);
	   			ExcelWBook = new XSSFWorkbook(fin);
	   			ExcelWSheet = ExcelWBook.getSheet(sheetname);
	   		try {

	   			int rowCount = ExcelWSheet.getLastRowNum();
	   			for (int i = 0; i < rowCount; i++) {

	   				rownum = i + 1;
	   				code.add(getCellData(rownum, header));
	   			}
	   			ExcelWBook.close();
	   			fin.close();
	   		}
	   		catch(Exception e)
	   		{
	   			
	   		}
	   		return code;
	   	}


}
