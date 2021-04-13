package co.com.dev.certificacion.travelocity.stepdefinitions;

import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.dev.certificacion.travelocity.models.DatosActividades;
import co.com.dev.certificacion.travelocity.questions.ValidateListActividades;
import co.com.dev.certificacion.travelocity.taks.ActividadesReserva;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReservaActividadStepDefinitions {

	private Actor travelocity = Actor.named("TraveloCity");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	@Before
	public void configuracioInicial() {
		travelocity.can(BrowseTheWeb.with(hisBrowser));
	}

	@When("^el usuario desea realizar una reserva de actividades en travelocity$")
	public void elUsuarioDeseaRealizarUnaReservaDeActividadesEnTravelocity(List<DatosActividades> datosactividades) {

		travelocity.attemptsTo(ActividadesReserva.enTravelocity(datosactividades.get(0)));

	}


	@Then("^visualiza la lista de actividades vinculados$")
	public void visualizaLaListaDeActividadesVinculados() {
		
		travelocity.should(seeThat(ValidateListActividades.andSync()));
	  
	}

}
