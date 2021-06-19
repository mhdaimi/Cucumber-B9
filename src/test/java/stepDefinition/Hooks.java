package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	@Before
	public void before() {
		System.out.println("I am executed before every scenario");
	}

	@After
	public void after() {
		System.out.println("I am executed after every scenario");
	}
}
