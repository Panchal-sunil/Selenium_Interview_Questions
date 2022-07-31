package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementVsFindElements {

	public static void main(String[] args) {
		
		//Question No-9
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		//findelements()-----> Return the single webElement
		
		//1
		driver.get("https://demo.nopcommerce.com/");
/*		 WebElement f = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		f.sendKeys("xyz");
		
		//2
		WebElement multi = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(multi.getText());
		
		//3
		WebElement btn= driver.findElement(By.xpath("//button[@type='btn']"));//this element is not present in the web page see the result
*/		
		
		//findElements()----> Returns multiple web Elements
		
		//1
/*		List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println("Number of elements :-"+links.size());
		
		//2
		List<WebElement> single = driver.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
		System.out.println(single.size());
*/		
		//3
		List<WebElement> text = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
		System.out.println(text.size());
		
		for( WebElement all:text) {
			System.out.println(all.getText());
		}
	
		
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='footer-upper']//b"));//this element is noit present in the web page see the result
		System.out.println(ele.size());//0
	
		
	
	}
}
