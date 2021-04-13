package co.com.dev.certificacion.travelocity.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.Scenario;

import static co.com.dev.certificacion.travelocity.util.ManualTest.validate;

public class TransversalStepDefinitions {


    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void stepDefinitions(String step) {
        validate(step, scenario.getName());
    }
}
