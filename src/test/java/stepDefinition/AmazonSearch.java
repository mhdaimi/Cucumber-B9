package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonSearch {
	
	WebDriver browser;
	
	@Given("User is at amazon home page")
	public void user_is_at_amazon_home_page() {
		System.setProperty("webdriver.chrome.driver", "src//test//resources//Drivers//chromedriver.exe");
		browser = new ChromeDriver();
		browser.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		browser.manage().window().maximize();
		browser.get("https://www.amazon.in");
	}

	@When("User enters product {string}")
	public void user_enters_product(String string) {
	    browser.findElement(By.id("twotabsearchtextbox")).sendKeys(string);
	}

	@When("User click search button")
	public void user_click_search_button() {
	    browser.findElement(By.id("nav-search-submit-button")).click();
	}

	@Then("Verify product with page title {string}")
	public void verify_product_with_page_title(String string) {
	    Assert.assertEquals(string, browser.getTitle());
	    browser.close();
	}



}
