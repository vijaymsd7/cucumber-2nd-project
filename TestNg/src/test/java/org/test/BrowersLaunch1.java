package org.test;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowersLaunch1 {
	public static WebDriver driver;

	@BeforeClass
	private void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.tnstc.in/home.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("before class");
	}

	@AfterClass
	private void afterClass() {
		// driver.quit();
		System.out.println("after class");
	}

	@BeforeMethod
	private void beforeMetod() {
		Date d = new Date();
		System.out.println("start time" + d);

	}

	@AfterMethod
	private void afterMetod() {
		Date d = new Date();
		System.out.println("end time" + d);

	}
	
	
	
	
	
	
	
	

}
