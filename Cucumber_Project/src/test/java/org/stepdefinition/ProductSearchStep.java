package org.stepdefinition;

import org.baseclass.BaseClass;
import org.pompages.ProductSearchPom;

import io.cucumber.java.en.*;

public class ProductSearchStep extends BaseClass {
	ProductSearchPom p;

	@Given("The user should be in the atmosphere product page")
	public void the_user_should_be_in_the_atmosphere_product_page() {
	}

	@When("The user should click")
	public void the_user_should_click() {
		p = new ProductSearchPom();
		moveToElement(p.getMenclick());
		click(p.getMenclick());
		click(p.getTshirclick());
	}

	@When("The user should choise the degin")
	public void the_user_should_choise_the_degin() throws InterruptedException {

		click(p.getMaintshirtclick());
		scrollDown(p.getProductclick());
		Threadsleep(1000);
		moveToElement(p.getProductclick());
		click(p.getProductclick());
		Threadsleep(1000);
		moveToElement(p.getWhitecolor());
		click(p.getWhitecolor());
		Threadsleep(1000);
		moveToElement(p.getProductclick());
		click(p.getProductclick());
		click(p.getSizeclick());
	}

	@Then("The user to click the add card")
	public void the_user_to_click_the_add_card() {
	}

}
