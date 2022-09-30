package com.xpath;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PathDemo {
	
	public static void main(String[] args) throws Throwable  {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Naveen Krish Kalyan\\eclipse-workspace\\Xpath\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	Thread.sleep(4000);
	
	WebElement displayAnAlert = driver.findElement(By.xpath("//button[@onclick='alertbox()'] "));
	displayAnAlert.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	WebElement alertWithOk = driver.findElement(By.xpath("(//a[@class='analystic']) [2]"));
	alertWithOk.click();
	WebElement alertOk = driver.findElement(By.xpath("//button[@onclick='confirmbox()']"));
	alertOk.click();
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	WebElement alertwithtext = driver.findElement(By.xpath("(//a[@data-toggle='tab']) [3]"));
	alertwithtext.click();
	WebElement prom = driver.findElement(By.xpath("//button[@onclick='promptbox()']"));
	prom.click();
	Thread.sleep(2000);
	driver.switchTo().alert().sendKeys("Naveen Kumar");
	Thread.sleep(2000);
	driver.switchTo().alert().accept();
	
	
	
	
	
	
	
	
	
	
		
		
		
		
	}
	
		
	}


