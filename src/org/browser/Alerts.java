package org.browser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Alerts {
		//Question No :-33,34,35
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		
//JavScript Alerts		
		//Alert Window with OK Button
		
	/*	driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();*/
		
		//Alert Windoe with Ok & Cancle  Button
		
	/*	driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();//Close alert using by Ok button
		driver.switchTo().alert().dismiss();//Close Alert using by Cancle button*/
		
		
	/*	driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Thread.sleep(3000);
		Alert alertwindo=driver.switchTo().alert();
		
		System.out.println("The Message displayed on alert :-"+alertwindo.getText());
		alertwindo.sendKeys("Welcome");
		
		alertwindo.accept();
		//alertwindo.dismiss();*/
		
		
//Authentication Pop-ups
		
	/*	//THis is the actual URL Of the page
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//you only put your user name and password after the "http//" then you logged in
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");*/
		
//Permission based pop-ups		
	/*	ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mathaiah\\eclipse-workspace\\SeleniumInterview\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.redbus.in/");
	*/	
		
		
	}
}
