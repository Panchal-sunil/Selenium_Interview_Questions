package org.browser;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckDropDownSorted {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) {
		
		
		//Question No :- 16
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.twoplugs.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click();//Live Posting
		
		WebElement dropelements = driver.findElement(By.name("category_id"));
		Select dropselect=new Select(dropelements);
		
		List<WebElement> options = dropselect.getOptions();
		
		ArrayList originallist=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options) 
		{
			originallist.add(option.getText());
			templist.add(option.getText());
		}
		System.out.println("Original List:-"+originallist);
		System.out.println("temp List :-"+templist);
		
		Collections.sort(templist);
		
		System.out.println("Original List :-"+originallist);
		System.out.println("temp List After Sorting :-"+templist);
		
		if(originallist.equals(templist)) 
		{
			System.out.println("DropDown Sorted..");
		}
		else 
		{
			System.out.println("DropDown Unsorted..");
			
		}
		

	}
}
