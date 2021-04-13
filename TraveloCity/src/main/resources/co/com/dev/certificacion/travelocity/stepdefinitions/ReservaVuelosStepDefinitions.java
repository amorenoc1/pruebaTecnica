package co.com.dev.certificacion.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.dev.certificacion.travelocity.models.DatosVuelos;
import co.com.dev.certificacion.travelocity.questions.ValidateListVuelos;
import co.com.dev.certificacion.travelocity.taks.VuelosReserva;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservaVuelosStepDefinitions {
	
	private Actor travelocity = Actor.named("TraveloCity");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	@Before
	public void configuracioInicial() {
		travelocity.can(BrowseTheWeb.with(hisBrowser));
	}

	@When("^el usuario desea realizar una reserva de vuelos en travelocity$")
	public void elUsuarioDeseaRealizarUnaReservaDeVuelosEnTravelocity(List<DatosVuelos> datosVuelos) {

		travelocity.attemptsTo(VuelosReserva.enTravelocity(datosVuelos.get(0)));

	}

	@Then("^visualiza la lista de vuelos$")
	public void visualizaLaListaDeVuelos() {
		
		travelocity.should(seeThat(ValidateListVuelos.andSync()));

	}

}
