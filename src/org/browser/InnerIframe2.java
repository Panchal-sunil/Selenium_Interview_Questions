package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerIframe2 {

	

	public static void main(String[] args) {
		
		// Question No-39
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");//switch to outer frame
		driver.switchTo().frame(0);//switch to inner frame
		
		System.out.println("text present inside the inner iframe :-"+driver.findElement(By.xpath("//h1")).getText());
		
		driver.switchTo().parentFrame(); // go to the outer frame/parent frame
		
		String text=driver.findElement(By.xpath("//p[contains(text(),'You can use the height and width attributes to spe')]")).getText();
		
		System.out.println("Text print in outer frame :- "+text);
			
	}
}
