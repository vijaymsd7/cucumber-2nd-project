package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Month;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tnpsc {
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

	@Test
	private void test1() throws InterruptedException, AWTException {
		// FROM LOCATION
		WebElement first = driver.findElement(By.id("matchStartPlace"));
		first.sendKeys("CHENNAI TAMBARAM");
		

		WebElement tr = driver.findElement(By.xpath("//a[text()='CHENNAI TAMBARAM']"));
		tr.click();

		// TO LOCATION
		WebElement droppoint = driver.findElement(By.id("matchEndPlace"));
		droppoint.sendKeys("MADURAI");

		WebElement md = driver.findElement(By.xpath("//a[text()='MADURAI']"));
		md.click();
		// DATE
		WebElement dd = driver.findElement(By.id("txtdeptDateRtrip"));
		dd.click();

		WebElement dp = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s = new Select(dp);
		// s.selectByVisibleText("Jun");
		dp.sendKeys("Jul");

		WebElement td = driver.findElement(By.xpath("//a[text()='4']"));
		td.click();

		String attribute = dd.getAttribute("value");
		System.out.println(attribute);

		WebElement time = driver.findElement(By.id("selectOnwardTimeSlab"));

		time.sendKeys("ANY");

		// WebElement child = driver.findElement(By.id("txtAdultMales"));
		// child.sendKeys("0");

		WebElement females = driver.findElement(By.id("txtAdultFemales"));
		females.sendKeys("1");

		WebElement allclasses = driver.findElement(By.id("selectClass"));
		allclasses.click();
		allclasses.sendKeys("SEMI DELUXE");
		allclasses.click();

		WebElement secrch = driver.findElement(By.xpath("(//td[@width='100%'])[3]"));
		secrch.click();

		WebElement btn = driver.findElement(By.xpath("(//span[@class='button2 blue'])[1]"));
		btn.click();

		WebElement seetno1 = driver.findElement(By.xpath("(//input[@type='checkbox'])[9]"));
		seetno1.click();

		WebElement seetno2 = driver.findElement(By.xpath("(//input[@type='checkbox'])[10]"));
		seetno2.click();

		WebElement name = driver.findElement(By.name("txtName"));

		name.sendKeys("vijay");

		WebElement name2 = driver.findElement(By.name("txtAddnName"));

		name2.sendKeys("priya");

		WebElement age = driver.findElement(By.name("txtAge"));

		age.sendKeys("26");

		WebElement age2 = driver.findElement(By.name("txtAddnAge"));

		age2.sendKeys("22");

		WebElement proof = driver.findElement(By.name("selectIdProof"));

		proof.click();

		WebElement proof1 = driver.findElement(By.name("selectIdProof"));

		proof1.click();
		proof1.sendKeys("Aadhaar Card");

		WebElement idnumber = driver.findElement(By.name("txtIdProofReference"));

		idnumber.sendKeys("368017454122");

		WebElement phone = driver.findElement(By.name("txtPhoneNo"));

		phone.sendKeys("9943910035");

		WebElement email = driver.findElement(By.name("txtEmailID"));

		email.sendKeys("dvkme7@gmail.com");

		WebElement sub = driver.findElement(By.xpath("(//a[@class='dboxheader'])[1]"));

		sub.click();
		
		Alert dvk=driver.switchTo().alert();
		dvk.accept();
		Thread.sleep(5000);
		
		WebElement makepaymet = driver.findElement(By.xpath("(//a[@class='dboxheader'])[1]"));

		makepaymet.click();
		
		WebElement cardno = driver.findElement(By.id("cnumber"));

		email.sendKeys("4018064398003820");
		
		
		
		//WebElement month = driver.findElement(By.id("expmon"));

	//	month.click();
	//	month.sendKeys("07(Jul)");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
