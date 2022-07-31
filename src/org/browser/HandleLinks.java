package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	
	//Question No - 29,30,31
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//How to Capture all the links
		
		List<WebElement> Links = driver.findElements(By.tagName("a"));
		//System.out.println("Number Of Links Prensent :-"+Links.size());
		
		//Normal For Loop
		
	/*	for(int i=0;i<=Links.size();i++)
		{
			System.err.println(Links.get(i).getText());
			System.out.println(Links.get(i).getAttribute("href"));
		}*/
		
		for(WebElement link:Links) 
		{
			System.out.println(link.getText());
			System.out.println(link.getAttribute("href"));
		}
		
		
	}
}
