package org.parametters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B {

	
	@Parameters({"USERNAME","PASSWORD","phonenumber"})
	@Test
	private void testa1(String user,String pass,String ph) {
		System.out.println("TEST B1");
		System.out.println(user);
		System.out.println(pass );
		System.out.println(ph);

	}	
	@Parameters()
	@Test
	private void testb2() {
	System.out.println("TEST B2");

	}	
	
	
	@Test
	private void testb3() {
	System.out.println("TEST B3");

	}	
	
	
}
