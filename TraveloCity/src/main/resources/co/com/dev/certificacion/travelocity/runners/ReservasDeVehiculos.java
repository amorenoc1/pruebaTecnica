package co.com.dev.certificacion.travelocity.runners;

import org.junit.runner.RunWith;
import cucumber.api.SnippetType;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/automatizados/reservaVehiculo.feature", 
glue = "co.com.dev.certificacion.travelocity.stepdefinitions", 
tags = "",
snippets = SnippetType.CAMELCASE)

public class ReservasDeVehiculos {

}
