package org.cuc;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;

public class LoginPage extends org.main.BaseClass {
	
	@Given("To user should be in facebook loginpage")
	public void to_user_should_be_in_facebook_loginpage() {
	System.out.println("given"); 
	browserLaunch("chrome");
	urlLaunch("https://www.facebook.com/");
	Wait(5);
   
	
		
	}
	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String user, String pass) {
		System.out.println("when");  
		sendKeys(driver.findElement(By.name("email")),user);
		System.out.println(getAttribute(driver.findElement(By.name("email"))));
		sendKeys(driver.findElement(By.id("pass")), pass);
	}

	@When("The user has to fillclick login button")
	public void the_user_has_to_fillclick_login_button() {
		System.out.println("when"); 
		click(driver.findElement(By.name("login")));
		
		
	}
	@Then("the user should navigate to the invalid sumbit page")
	public void the_user_should_navigate_to_the_invalid_sumbit_page() {
		System.out.println("then22");
		WebDriverWait w=new WebDriverWait(driver,20);
		w.until(ExpectedConditions.urlContains("privacy mutation token"));
		//assert.assertTrue(driver.getCurrentUrl().contains("facebook"));
		
		
		
		
	}
}






   