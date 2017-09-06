/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.landcare.sampletests;

/**
 *
 * @author denz
 */
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:build/cucumber-html-report"},
		glue = {"info.seleniumcucumber.stepdefinitions", "tk.landcare.sampletests"}
)
public class TestRunner {}
