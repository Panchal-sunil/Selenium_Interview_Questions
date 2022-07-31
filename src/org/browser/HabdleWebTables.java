package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HabdleWebTables {
	//Question No - 42
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
		
		driver.manage().window().maximize();
		
		//How Many Rows in the table
		int rows=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr")).size();
		System.out.println("Total Number of rows in a table :-"+rows);//4
		
		//How many columns in a table
		
		int colm=driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th")).size();
		System.out.println("total Number of Columns :-"+colm);//7
		
		
		//Retrieve the specific row & column data
		
		String value=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr[3]/td[1]")).getText();
		System.out.println("The value is :-"+value);
		
		//Retrieve all the data from table
		
		System.out.println("Data frome the table....");
	/*	for(int r=1;r<rows;r++)
		{
			for(int c=1;c<colm;c++)
			{
				String data=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.println(data);
			}
		}System.out.println();
	*/	
		
		
		//Retrieve the perticular table data 
		
		for(int r=1;r<rows;r++)
		{
			String Structure=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/th[1]")).getText();
			
			if(Structure.equals("Taipei 101")) 
			{
				String country=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[1]")).getText();
				String city=driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody/tr["+r+"]/td[2]")).getText();
				System.out.println(Structure+"  "+country+"  "+city);
				
			}
		}
		
		driver.quit();
	}
}
