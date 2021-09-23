package com.supriya.TestNG1;

import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\00004566\\OneDrive - Arisglobal software pvt Ltd\\Supriya\\Selenium\\chromedriver.exe");
		WebDriver driver=new org.openqa.selenium.chrome.ChromeDriver();
		driver.get("https://www.google.com/");
		String vTitle = driver.getTitle();
		System.out.println("The Title is "+vTitle);
		Thread.sleep(5000);
		driver.close();
	}

}
