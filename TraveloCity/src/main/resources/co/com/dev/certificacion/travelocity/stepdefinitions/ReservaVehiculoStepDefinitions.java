package co.com.dev.certificacion.travelocity.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import java.util.List;
import org.openqa.selenium.WebDriver;
import co.com.dev.certificacion.travelocity.models.DatosVehiculo;
import co.com.dev.certificacion.travelocity.questions.ValidateListVehiculos;
import co.com.dev.certificacion.travelocity.taks.VehiculosReserva;
import cucumber.api.java.Before;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
//import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReservaVehiculoStepDefinitions {
	
	private Actor travelocity = Actor.named("TraveloCity");

	@Managed(driver = "chrome")
	public WebDriver hisBrowser;

	@Before
	public void configuracioInicial() {
		travelocity.can(BrowseTheWeb.with(hisBrowser));
	}

	@When("^el usuario desea realizar una reserva de vehiculo en travelocity$")
	public void el_usuario_desea_realizar_una_reserva_de_vehiculo_en_travelocity(List<DatosVehiculo> datosvehiculo) {

		travelocity.attemptsTo(VehiculosReserva.enTravelocity(datosvehiculo.get(0)));

	}

	@Then("^visualiza la lista de vehiculos vinculados$")
	public void visualiza_la_lista_de_vehiculos_vinculados() {

		// theActorInTheSpotlight().should(seeThat(ListadoDeCarros.success()));
		
		travelocity.should(seeThat(ValidateListVehiculos.andSync()));

	}

}
