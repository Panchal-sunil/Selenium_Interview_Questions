package org.browser;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrokenLinks {

	public static void main(String[] args) throws MalformedURLException {
		
		//Question No -32
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.deadlinkcity.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		int brokenLinks=0;
		
		for(WebElement element:links)
		{
			
			String url=element.getAttribute("href");
			if(url==null || url.isEmpty())
			{
				System.out.println("URL is Empty");
				continue;
			}
			URL link=new URL(url);
			try {
				HttpURLConnection httpconn=(HttpURLConnection) link.openConnection();
				httpconn.connect();
				if(httpconn.getResponseCode()>400) 
				{
					System.out.println(httpconn.getResponseCode()+url+"  is"+"  Broken link");
					brokenLinks++;
					
				}
				else 
				{
					System.out.println(httpconn.getResponseCode()+url+"  is"+"  Valid Link");
				}
			}catch(Exception e) {
				
			}
		}
		System.out.println("Number Of Broken Links"+brokenLinks);
		driver.quit();
		
		
	}
}