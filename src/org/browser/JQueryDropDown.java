package org.browser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQueryDropDown {

	public static void main(String[] args) {
		
		//Question No :- 15
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		selectChoiceValues(driver,"choice 1");
		//selectChoiceValues(driver,"choice 1","choice 2","choice 2 3","choice 2 4","choice 3","choice 6");
		//selectChoiceValues(driver,"all");
		
		
	}
	
	public static void selectChoiceValues(WebDriver driver, String... value) {
		List<WebElement> choicelist = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all")) 
		{
			for(WebElement Item:choicelist) {
				String text = Item.getText();
				
				for(String val:value) {
					
					if(text.equals(val)) {
						
						Item.click();
						break;
					}
				}
			}
		}
		else 
		{
			try 
			{
				for(WebElement Item:choicelist) {
					
					Item.click();
				}
			}
			catch(Exception e) {
				
			}
		}
	}
}
