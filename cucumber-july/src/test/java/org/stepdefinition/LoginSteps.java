package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	
	
		@Given("To user should be in facebook loginpage")
		public void to_user_should_be_in_facebook_loginpage() {
		   System.out.println("1st");
		   // throw new cucumber.api.PendingException();
		}

		@When("The user has to fill username and password")
		public void the_user_has_to_fill_username_and_password() {
			  System.out.println("2st");
		   // throw new cucumber.api.PendingException();
		}

		@When("The user has to fillclick login button")
		public void the_user_has_to_fillclick_login_button() {
			  System.out.println("3rd");
		   // throw new cucumber.api.PendingException();
		}

		@Then("the user should navigate to the invalid login page")
		public void the_user_should_navigate_to_the_invalid_login_page() {
			  System.out.println("4rd");
		  //  throw new cucumber.api.PendingException();
		}



}
