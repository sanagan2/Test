package com.qa.stepdefinations;

import com.qa.pages.LoginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class LoginPageStepDef extends TestBase {
	
	LoginPage loginpge = new LoginPage();
	
	
	@Given("^I launch the application$")
	public void i_launch_the_application() throws Throwable {
		intialization();
		driver.get(prop.getProperty("url"));
	}

	@When("^i enter valid username \"([^\"]*)\"$")
	public void i_enter_valid_username(String arg1) throws Throwable {
		
             loginpge.enterUsername(arg1);
	}

	@When("^i enter valid password \"([^\"]*)\"$")
	public void i_enter_valid_password(String arg1) throws Throwable {
	    loginpge.enterPassword(arg1);
	}

	@When("^i click on sign in button$")
	public void i_click_on_sign_in_button() throws Throwable {
	 loginpge.clickLogin();
	}

	
	@SuppressWarnings("deprecation")
	@Then("^i should see the alert error message \"([^\"]*)\"$")
	public void i_should_see_the_alert_error_message(String arg1) throws Throwable {
		try {
			Assert.assertEquals(loginpge.ValidatingWarningMessageforinvalidcred(),arg1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	@Then("^i should see inline error message for password \"([^\"]*)\"$")
	public void i_should_see_inline_error_message_for_password(String arg1) throws Throwable {
		try {
			Assert.assertEquals(loginpge.ValidatingWarningMessageforwithoutpassword(),arg1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

	@SuppressWarnings("deprecation")
	@Then("^i should see inline error message for username \"([^\"]*)\"$")
	public void i_should_see_inline_error_message_for_username(String arg1) throws Throwable {
		try {
			Assert.assertEquals(loginpge.ValidatingWarningMessageforwithoutusername(),arg1);
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}


}
