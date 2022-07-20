package org.pompages;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearchPom extends BaseClass {
	public ProductSearchPom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//img[@class='img-responsive'])[113]")
	private WebElement tvclick;


	@FindBy(xpath="(//select[@class='form-control customeSelect'])[2]")
	private WebElement dropdownbt;

	@FindBy(xpath="(//a[@class='btn btn-block addToCart'])[1]")
	private WebElement addcard;

	@FindBy(xpath="@FindBy(xpath=\"(//a[@class='btn btn-block addToCart'])[1]\")\r\n" + 
			"	private WebElement addcard;\r\n" + 
			"")
	private WebElement checkout;

	public WebElement getTvclick() {
		return tvclick;
	}

	public void setTvclick(WebElement tvclick) {
		this.tvclick = tvclick;
	}

	public WebElement getDropdownbt() {
		return dropdownbt;
	}

	public void setDropdownbt(WebElement dropdownbt) {
		this.dropdownbt = dropdownbt;
	}

	public WebElement getAddcard() {
		return addcard;
	}

	public void setAddcard(WebElement addcard) {
		this.addcard = addcard;
	}

	public WebElement getCheckout() {
		return checkout;
	}

	public void setCheckout(WebElement checkout) {
		this.checkout = checkout;
	}

				
}

















