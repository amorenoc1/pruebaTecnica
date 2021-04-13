package co.com.dev.certificacion.travelocity.stepdefinitions;

import org.openqa.selenium.WebDriver;
import java.util.List;
import co.com.dev.certificacion.travelocity.models.Consultas;
import co.com.dev.certificacion.travelocity.models.LlenadoDeDatos;
import co.com.dev.certificacion.travelocity.taks.DatosReserva;
import co.com.dev.certificacion.travelocity.taks.ReservaHoteles;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservaHotelesStepDefinitions {
	
	
	private Actor travelocity = Actor.named("TraveloCity");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	@Before
	public void configuracioInicial() {
		travelocity.can(BrowseTheWeb.with(hisBrowser));
	}

	@Given("^el usuario consulta un destino$")
	public void elUsuarioConsultaUnDestino(List<Consultas> consulta) {

		travelocity.attemptsTo(ReservaHoteles.enTravelocity(consulta.get(0)));

	}

	@When("^toma  la reserva para llenar los datos requeridos$")
	public void tomaLaReservaParaLlenarLosDatosRequeridos(List<LlenadoDeDatos> datos) {

		travelocity.attemptsTo(DatosReserva.enTravelocity(datos.get(0)));

	}

	@Then("^puede visualizarse el estado de la reserva$")
	public void puedeVisualizarseElEstadoDeLaReserva() {

	}

}
