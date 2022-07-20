package org.test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement txtUser;
	
	public WebElement getTxtUser() {
		return txtUser;
	}

	public void setTxtUser(WebElement txtUser) {
		this.txtUser = txtUser;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public void setTxtPass(WebElement txtPass) {
		this.txtPass = txtPass;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public void setBtnLogin(WebElement btnLogin) {
		this.btnLogin = btnLogin;
	}


	@FindBy(id="pass")
	private WebElement txtPass;
	
	@FindBy(name="login")
	private WebElement btnLogin;

	
	
}
