package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteGooglePlacesDropDown {

	

	public static void main(String[] args) throws InterruptedException {
		
		//Question No :- 18
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		
		WebElement element = driver.findElement(By.xpath("//a[text()='Live Posting']"));
		element.click();
		
		
		WebElement searchbox = driver.findElement(By.id("autocomplete"));
		
		searchbox.clear();
		Thread.sleep(3000);
		
		searchbox.sendKeys("Toronto");
		Thread.sleep(3000);
		
		String text;
		do
		{
			searchbox.sendKeys(Keys.ARROW_DOWN);
			Thread.sleep(3000);
			
			text=searchbox.getAttribute("value");
			
			if(text.equals("Toronto, OH, USA"))
			{
				searchbox.sendKeys(Keys.ENTER);
				break;
			}
			Thread.sleep(3000);
		}while(!text.isEmpty());
		
	}

		
	}

