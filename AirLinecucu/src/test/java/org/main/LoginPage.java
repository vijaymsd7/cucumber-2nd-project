package org.main;

import org.baseclass.baseClass;


import io.cucumber.java.en.*;

public class LoginPage extends baseClass{
	@Given("To user should be in Air line page")
	public void to_user_should_be_in_Air_line_page() {
		browserLaunch("chrome");
		urlLaunch("https://www.jbhifi.com.au/");
		Wait(5);
	   
	}

	
	

	@When("the user shuld click the singup button")
	public void the_user_shuld_click_the_singup_button() {
	   
	}

	@When("The user has to fill {string} and {string}")
	public void the_user_has_to_fill_and(String string, String string2) {
	   
	}

	@Then("the user to enter the {string} and {string}")
	public void the_user_to_enter_the_and(String string, String string2) {
	   
	}

	@Then("The user has to fillclick login button")
	public void the_user_has_to_fillclick_login_button() {
	   
	}

	@Then("The user read note for password creation")
	public void the_user_read_note_for_password_creation() {
	 
	}


}
