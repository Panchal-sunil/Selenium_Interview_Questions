package org.browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
		//Question No  - 19,20,21,22,23
		System.setProperty("webelement.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		//19 Select Specific check box
	//	driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();//Monday
		
		//20 Select the All Check boxes  
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total Number Of Check boxes :-"+allcheckbox.size());
		
		//using "for" loop select the all check box
		
	/*	for(int i=0;i<allcheckbox.size();i++)
		{
			allcheckbox.get(i).click();
		}*/
		
		//using  for...each loop select the all check boxes
		
	/*	for(WebElement all:allcheckbox)
		{
			all.click();
		}*/
		
		
		//21 select Multiple Check box by my choice
		//i want to select 'monday and Sunday'
		
	/*	for(WebElement all:allcheckbox)
		{
			
			String choice=all.getAttribute("id");
			if(choice.equals("monday")|| choice.equals("sunday"))
			{
				all.click();
			}
		}*/
		
		//22 select the last 2 check boxes 
		//Total No. of checkboxes- no.checkboxes want to select =starting index
		//7-2=5  '5' is my starting index
		
	/*	int totalcheckboxs=allcheckbox.size();
		
		for(int i=totalcheckboxs-2;i<totalcheckboxs;i++)
		{
			allcheckbox.get(i).click();
		}*/
		
		//23 select the first 3 check boxes
		int totalcheckboxs=allcheckbox.size();
		
		for(int i=0;i<totalcheckboxs;i++)
		{
			if(i<3)
		
			{
				allcheckbox.get(i).click();
			}
		
	}
	}	
	
}
