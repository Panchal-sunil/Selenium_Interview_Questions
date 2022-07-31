package org.browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/admin/index.php");
		
		//Login
		WebElement user = driver.findElement(By.id("input-username"));
		user.clear();
		user.sendKeys("demo");
		
		WebElement pass = driver.findElement(By.id("input-password"));
		pass.clear();
		pass.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.findElement(By.xpath(" //button[@class='btn-close']")).click();
		
		
		//Sales---->Order
		
		driver.findElement(By.xpath("(//a[@class='parent collapsed'])[5]")).click();
		driver.findElement(By.xpath("//a[text()='Orders']")).click();
		
		//Table
		//1 Find total Number of Pages in table
		
		String text = driver.findElement(By.xpath(" //div[@class='col-sm-6 text-end']")).getText();
		System.out.println(text);//Showing 1 to 10 of 12 (2 Pages)
		
		int valueOf = Integer.valueOf(text.substring(text.indexOf("(")+1,text.indexOf("pages")+1));
		System.out.println("Total Number Pages :-"+valueOf);
		 
		
		
		
		
		
		
		
	}
}
