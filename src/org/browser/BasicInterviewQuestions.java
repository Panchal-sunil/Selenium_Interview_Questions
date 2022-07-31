package org.browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicInterviewQuestions {

	public static void main(String[] args) {
		
		////Question No-1,2,3,4,5
		System.setProperty("webdriver.chrom.drievr", "C:\\\\Users\\\\mathaiah\\\\eclipse-workspace\\\\SeleniumInterview\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		
//Open URL		
		driver.get("https://demo.nopcommerce.com/");
		
//Current URL
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		
//Title
		String title = driver.getTitle();
		System.out.println(title);
		
//pagesource
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		
		
		
		
	}
}
