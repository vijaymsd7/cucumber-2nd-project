package org.test;

public class FaceBook extends BaseClass {

	public static void main(String[] args) {
		launchBrowser("chrome");
		implicityWait(20);
		launchUrl("https://www.facebook.com/");
		
		LoginPage l=new LoginPage();
		sendKeys(l.getTxtUser(), "khkjg");
		sendKeys(l.getTxtPass(), "gjhf");
		l.getBtnLogin().click();

	}

}
