package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.By;
import org.pompages.ProductSearchPom;

import io.cucumber.java.en.*;

public class ProductSearchStep extends BaseClass {
	ProductSearchPom p;

	
	@Given("The user should be in the jamboshop product page")
	public void the_user_should_be_in_the_jamboshop_product_page() throws InterruptedException {
		//Wait(20);
		p= new ProductSearchPom();
		Threadsleep(5000);
		//scrollDown(true);
		//moveToElement(p.getTvclick());
		//click(p.getTvclick());
		scrollDown(p.getTvclick());
		//click(driver.findElement(By.xpath("(//div[@class='category-product text-center'])[114]")));
		click(p.getTvclick());
		
	}
	

	@When("The user should click")
	public void the_user_should_click() throws InterruptedException {
		selectByIndex(p.getDropdownbt(), 2);
		
	   
	}

	@When("The user should choise the degin")
	public void the_user_should_choise_the_degin() {
	   
	}

	@Then("The user to click the add card")
	public void the_user_to_click_the_add_card() throws InterruptedException {
	
	click(p.getAddcard());   
		
		
		
		
	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}