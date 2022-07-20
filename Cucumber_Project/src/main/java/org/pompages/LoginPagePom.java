package org.pompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePom extends BaseClass{
	public LoginPagePom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//li[@class='enterprise-account__item'])[1]")
	private WebElement btnLogin;
	
	@FindBy(xpath="(//input[@type='text'])[6]")
	private WebElement name;
	
	@FindBy(xpath="(//input[@type='password'])[11]")
	private WebElement password;
	
	@FindBy(xpath="(//input[@type='submit'])[11]")
	private WebElement submit;

	@FindBy(xpath="//a[@class='button']")
	private WebElement singup;

	
	
	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSingup() {
		return singup;
	}

}