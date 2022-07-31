package org.browser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		//Quesiton No :-17
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.bing.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("sb_form_q")).sendKeys("selenium");
		
		List<WebElement> list = driver.findElements(By.xpath("//li[@class='sa_sg']//span"));
		System.out.println("List Of suggestions :-"+list.size());
		
		for(WebElement listItam:list)
		{
			if(listItam.getText().contains("download"))
			{
				listItam.click();
				break;
			}
			
		}
		
	}
}
