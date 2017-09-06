/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.landcare.sampletests;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.DriverUtil;
import info.seleniumcucumber.stepdefinitions.PredefinedStepDefinitions;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author denz
 */
public class TestScenarios {
	protected WebDriver driver;
	protected PredefinedStepDefinitions steps;
	@Before
	public void before() {
		DriverUtil.getDefaultDriver();
		steps = new PredefinedStepDefinitions();
	}
	@Given("^I know \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_know_and(String arg1, String arg2) throws Throwable {
		System.out.println("I know " + arg1 + " and " + arg2);
	}
	@When("^I make use of \"([^\"]*)\"$")
	public void i_make_use_of(String arg1) throws Throwable {
		System.out.println("I make use of " + arg1);
	}

	@Then("^I have learned \"([^\"]*)\"$")
	public void i_have_learned(String arg1) throws Throwable {
		System.out.println("I have learned " + arg1);
	}

	@Then("^the sky is blue$")
	public void the_sky_is_blue() throws Throwable {
		System.out.println("the sky is blue");
	}
	@After
	public void after() {
		//DriverUtil.closeDriver(); // currently does not work, guessing because it is closed by parent tests
	}
}
