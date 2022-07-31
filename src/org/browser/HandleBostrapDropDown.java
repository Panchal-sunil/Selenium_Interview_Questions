package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBostrapDropDown {

	public static void main(String[] args) {
		
		//Question No :- 14
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
/*		
		driver.get("https://www.hdfcbank.com/");
		WebElement element = driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']"));
		element.click();
		
		
		//Product type
		List<WebElement> allitems = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		
		System.out.println("All Options :-"+allitems.size());
		
		for(WebElement total:allitems)
		{
			if(total.getText().equals("Deposits")) {
				total.click();
				break;
			}
		}
		
		//product
		WebElement drop2 = driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']"));
		drop2.click();
		
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("all options :-"+elements.size());
		
		for(WebElement ele:elements) {
			if(ele.getText().equals("Recurring Deposit")) {
				ele.click();
				break;
			}
		}
		
*/		
		//Generic method----> we can invoke the all methods in a one time without creating a multiple object
		
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> allitems = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("All Options :-"+allitems.size());
		selectOptionFromDropDown(allitems,"Accounts");
	
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("all options :-"+elements.size());
		selectOptionFromDropDown(elements,"Salary Accounts");
		
		
	}

	public static void selectOptionFromDropDown(List<WebElement> options, String value) 
	{
		for(WebElement option:options) 
		{
			if(option.getText().equals(value)) 
			{
				option.click();
				break;
			}
		}
		
	}
}
