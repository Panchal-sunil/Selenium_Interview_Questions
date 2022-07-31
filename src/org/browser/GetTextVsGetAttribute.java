package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTextVsGetAttribute {

	public static void main(String[] args) {
		
		//Question No-10,11,12
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?");
		WebElement clear = driver.findElement(By.id("Email"));
		clear.clear();
		clear.sendKeys("xyz");
		
		//capturing text from inputBox
		System.out.println("GetAttribute Method() value:-"+clear.getAttribute("value"));
		
		//getText will define only inner text which is available
		System.out.println("GetText Method() :- "+clear.getText());
		
		
		WebElement button = driver.findElement(By.xpath("//button[@type='submit']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getDomAttribute("class"));
		
		System.out.println(button.getText());
		
		
	}
}
