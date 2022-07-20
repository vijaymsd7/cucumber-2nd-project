package org.test;

import java.util.Date;

import org.testng.annotations.*;


public class SteptestNg {
	
@BeforeClass
private void beforeClass() {
	
	System.out.println("before class");
	

}
@AfterClass
private void afterClass() {
	System.out.println("afterclass");

}
@BeforeMethod
private void beforeMethod() {
	Date d=new Date();
	System.out.println("start Time"+d);

}
@AfterMethod
private void afterMethod() {
	Date d=new Date();
	System.out.println("end Time"+d);

}

@Test(priority =-10)
private void test1() {
System.out.println("test1");

}
@Test(priority =0)
private void test2() {
System.out.println("test2");

}

@Test(priority =5)
private void test3() {
System.out.println("test3");
}

@Test(priority =-15)
private void test4() {
System.out.println("test4");
}










}
