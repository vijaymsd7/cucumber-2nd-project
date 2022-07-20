package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.pompages.LoginPagePom;
import io.cucumber.java.en.*;

public class Loginstep extends BaseClass {
	LoginPagePom l;

	@Given("The user should be in the atmosphere loginpage")
	public void the_user_should_be_in_the_atmosphere_loginpage() {
		browserLaunch("chrome");
		urlLaunch("https://www.atmosphere.ca/");
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		Wait(20);
	}

	@When("The user should click the login")
	public void the_user_should_click_the_login() throws InterruptedException {
		l = new LoginPagePom();
		Threadsleep(2000);
		moveToElement(l.getBtnLogin());
		click(l.getBtnLogin());

		WebElement ffff = driver.findElement(By.id(""));
		boolean displayed = ffff.isDisplayed();
		System.out.println(displayed);
		
	}

	@When("The user should fill the {string} and {string}")
	public void the_user_should_fill_the_and(String user, String pass) {
		l = new LoginPagePom();
		sendKeys(l.getName(), user);
		sendKeys(l.getPassword(), pass);
	}

	@Then("The user to click the login button")
	public void the_user_to_click_the_login_button() {
		l = new LoginPagePom();
		click(l.getSubmit());
		click(l.getSingup());

	}

}
