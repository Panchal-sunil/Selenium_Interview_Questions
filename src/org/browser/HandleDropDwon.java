package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDwon {

	public static void main(String[] args) {
		
		//Question No-13
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement dropdown = driver.findElement(By.id("input-country"));

		Select dropmenu=new Select(dropdown);
		
		//dropmenu.selectByVisibleText("Aruba");
		//dropmenu.selectByValue("7");//Anguilla
		//dropmenu.selectByIndex(15);//Azerbaijan
		
		
		//selecting option for dropdown without using methods
		
		List<WebElement> all = dropmenu.getOptions();
		
		for( WebElement getall:all) {
			if(getall.getText().equals("cuba")) {
				getall.click();
				break;
			}
			
		}
		
		
		
		
		
	}
}
