package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage {
	
	@Given("User is on login page")
	public void user_is_on_login_page() {
		
		System.out.println("user went to login page");
	   
	}

	@When("User provides valid {string} and {string}")
	public void user_provides_valid_and(String string, String string2) {
	   
		System.out.println(" valid credentials");
	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
	   
		System.out.println("clicked on login button");
	}

	
	@Then("User should navigate to home page")
	public void user_should_navigate_to_home_page() {
		
		System.out.println("navigated to home page");
	   
	}
	
	

}
