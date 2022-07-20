package org.stepdefinition;

import java.io.IOException;
import org.baseclass.BaseClass;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.*;

public class Hooks extends BaseClass{
	
	@Before
	public void before() throws InterruptedException {
	}
	@After
	public void after(Scenario sc) throws IOException {
		takeScreenShot(sc.getName());
		//quit();

	}
}