package org.pompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom extends BaseClass{
	public LoginPagePom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Sign In /']")
	private WebElement singclick;
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement loginclick;
	
	
	
	public WebElement getSingclick() {
		return singclick;
	}

	public WebElement getLoginclick() {
		return loginclick;
	}
	
	
}




