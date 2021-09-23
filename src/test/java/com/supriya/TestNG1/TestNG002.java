package com.supriya.TestNG1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNG002 {
	
	WebDriver driver;
	
	public void Test1() throws InterruptedException 
	{
		
		driver.get("https://www.amazon.com/");
		String vTitle = driver.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
	}
	
	@BeforeTest
	public void OpenBrowser() {
		System.out.println("Before Test: Opening Browser for Amazon");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
		driver=new org.openqa.selenium.chrome.ChromeDriver();		
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
		System.out.println("After Test: Amazon Closed Browser");
	}

}
