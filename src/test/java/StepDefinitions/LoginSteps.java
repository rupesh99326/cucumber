package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is login page")
	public void user_is_login_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("you are in login page ");
	}

	@When("user username and password")
	public void user_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("you have to give user name and password");
	}

	@And("click on login button")
	public void click_on_login_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("Click on login button ");
	}

	@Then("user is navigated to the  home page")
	public void user_is_navigated_to_the_home_page() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
		System.out.println("you navigated to the home page");
	}


}
