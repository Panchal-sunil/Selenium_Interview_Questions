package org.browser;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		//Question No-24,25,26,27,28
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		//getWindowHandle()
		
		//String windowId = driver.getWindowHandle();//It will return Id od the single browser window 
		//System.out.println(windowId);
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click(); //it will returns ID's of multiple browser  window 
		
		//getWindowHandles()
		
		Set<String> windowIDs= driver.getWindowHandles();
		
		//first method iterator()
		
		/*	Iterator<String> it = windowIDs.iterator();
			
			
			String parentWindowID=it.next();
			String childWindowID=it.next();
			
			System.out.println("Parent Window Id :-"+parentWindowID);
			System.out.println("Child Window ID :-"+childWindowID);*/
			
		//second method - using List/ArrayList
		
			List<String> windowIDsList=new ArrayList<String>(windowIDs);//converting set--->List
		
		/*	String parentWindowID=windowIDsList.get(0);
			String childWindowID=windowIDsList.get(1);
			
			System.out.println("Parent Window Id :-"+parentWindowID);
			System.out.println("Child Window ID :-"+childWindowID);
			
			
			//How To use ID's for switching
			driver.switchTo().window(parentWindowID);
			System.out.println("Parent Window Title :-"+driver.getTitle());
			
			driver.switchTo().window(childWindowID);
			System.out.println("Child Window Title :-"+driver.getTitle());
			*/
			
			//Using for each loop
		/*	
			for(String winID:windowIDsList)
			{
				
				//System.out.println(winID);
				
				String title=driver.switchTo().window(winID).getTitle();
				System.out.println(title);
			*/
			//driver.close();//close single browser window driver which pointing
			//driver.quit();// close all the browser window
			
			for(String winID:windowIDsList)
			{
				String title=driver.switchTo().window(winID).getTitle();
				if(title.equals("OrangeHRM"))
				{
					driver.close();
				}
			}
				
			
			
			
			}
			}
	

	
