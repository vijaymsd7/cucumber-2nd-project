package org.parametters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class A {
	
	@Parameters({"USERNAME","PASSWORD","phonenumber"})
	@Test
	private void testa1(String user,String pass,String ph) {
	System.out.println("TEST A1");
	System.out.println(user);
	System.out.println(pass );
	System.out.println(ph);
	
	}
	@Parameters({"USERNAME","PASSWORD"})
	@Test
	private void testa2(String user,String pass) {
	System.out.println("TEST A2");
	System.out.println(user);
	System.out.println(pass );
	
	}
	
	
	@Test
	private void testa3() {
	System.out.println("TEST A3");

	}
	
	
	
	
}
