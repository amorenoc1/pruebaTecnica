package co.com.dev.certificacion.travelocity.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.dev.certificacion.travelocity.models.DatosPaquetes;
import co.com.dev.certificacion.travelocity.taks.PaquetesReserva;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ReservaPaquetesStepDefinitions {
	
	private Actor travelocity = Actor.named("TraveloCity");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	@Before
	public void configuracioInicial() {
		travelocity.can(BrowseTheWeb.with(hisBrowser));
	}

	@When("^el usuario desea realizar una reserva de paquetes en travelocity$")
	public void elUsuarioDeseaRealizarUnaReservaDePaquetesEnTravelocity(List<DatosPaquetes> datospaquetes) {

		travelocity.attemptsTo(PaquetesReserva.enTravelocity(datospaquetes.get(0)));

	}

	@Then("^visualiza la lista de paquetes$")
	public void visualizaLaListaDePaquetes() {

	}

}
