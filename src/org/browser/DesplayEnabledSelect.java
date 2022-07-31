package org.browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DesplayEnabledSelect{

	public static void main(String[] args) {
		
		//Question No-*
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
//isDisplayed()
	 /* driver.get("https://demo.nopcommerce.com/");
		WebElement isdisplayed = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean displayed = isdisplayed.isDisplayed();
		System.out.println("Display Status"+displayed); //true
		*/
		
		
//isEnabled()		
/*		driver.get("https://demo.nopcommerce.com/");
		WebElement Enable = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		boolean enabled = Enable.isEnabled();
		System.out.println("Display Enable :-"+enabled);//true
*/		
		
	
//isSelected()
		driver.get("https://demo.nopcommerce.com/");
		WebElement sel = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		boolean selected = sel.isSelected();
		System.out.println(selected);
		
		
		
		
	}
}
