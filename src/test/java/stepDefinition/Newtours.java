package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Newtours {
	
	WebDriver browser;
	
	@Given("User is at login page")
	public void user_is_at_login_page() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//Drivers//chromedriver.exe");
		browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		browser.get("http://demo.guru99.com/test/newtours/index.php");
	}

	@When("User enters valid username")
	public void user_enters_valid_username() {
	    browser.findElement(By.name("userName")).sendKeys("batman");
	}

	@When("User enters valid password")
	public void user_enters_valid_password() {
	    browser.findElement(By.name("password")).sendKeys("batman");
	}

	@When("User click submit button")
	public void user_click_submit_button() {
	    browser.findElement(By.name("submit")).click();
	}

	@Then("Login should be successful")
	public void login_should_be_successful() {
	    Assert.assertEquals("Login: Mercury Tours", browser.getTitle());
	    browser.close();
	}
	
	@When("User enters invalid password")
	public void user_enters_invalid_password() {
		browser.findElement(By.name("password")).sendKeys("superman");
	}
	
	
	@Then("Login should not be successful")
	public void unsuccessful_login() {
		Assert.assertEquals("Welcome: Mercury Tours", browser.getTitle());
		browser.close();
	}

	@When("User enters invalid username {string}")
	public void invalid_username(String arg1) {
		browser.findElement(By.name("userName")).sendKeys(arg1);
	}
	
	@When("User enters valid password {string}")
	public void valid_password(String arg1) {
		browser.findElement(By.name("password")).sendKeys(arg1);
	}
	
	@When("User enters {string} and {string}")
	public void enter_username_password(String arg1, String arg2) {
		browser.findElement(By.name("userName")).sendKeys(arg1);
		browser.findElement(By.name("password")).sendKeys(arg2);
	}

	@Then("Login should not be successful with title {string}")
	public void verify_login_with_title(String arg1) {
		Assert.assertEquals(arg1, browser.getTitle());
		browser.close();
	}
	
	@When("User enters username {string}")
	public void enter_username(String arg1) {
		browser.findElement(By.name("userName")).sendKeys(arg1);
	}
	
	@When("User enters password {string}")
	public void enter_password(String arg1) {
		browser.findElement(By.name("password")).sendKeys(arg1);
	}
	
	@Then("Verify login with page title {string}")
	public void verify_login_with_page_title(String arg1) {
		Assert.assertEquals(arg1, browser.getTitle());
		browser.close();
	}
	
}
