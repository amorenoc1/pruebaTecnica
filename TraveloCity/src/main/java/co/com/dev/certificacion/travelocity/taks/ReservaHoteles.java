package co.com.dev.certificacion.travelocity.taks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.util.Properties;
import co.com.dev.certificacion.travelocity.exceptions.ReservaHotelExcepcion;
import co.com.dev.certificacion.travelocity.interactions.Resultados;
import co.com.dev.certificacion.travelocity.interactions.Switch;
import co.com.dev.certificacion.travelocity.models.Consultas;
import co.com.dev.certificacion.travelocity.userinterfaces.Busqueda;

public class ReservaHoteles extends PageObject implements Task {

	private Consultas consulta;

	public ReservaHoteles(Consultas consulta) {

		this.consulta = consulta;

	}

	private static final String URI_FILE = "src\\test\\resources\\url\\url.properties";

	public <T extends Actor> void performAs(T actor) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(URI_FILE));
			actor.attemptsTo(Open.url(properties.getProperty("TC")));

			actor.attemptsTo(Click.on(Busqueda.INPUT_SEARCH),

					Enter.theValue(consulta.getDestino()).into(Busqueda.LABEL_SEARCH),
					Resultados.onList(Busqueda.LIST_RESULTADO),
					Click.on(Busqueda.INPUT_FECHAINICIO),
					Click.on(Busqueda.INPUT_DIA.of(consulta.getDiainicio())), Click.on(Busqueda.BTN_DONE),
					Click.on(Busqueda.INPUT_FECHAFIN), Click.on(Busqueda.INPUT_DIAFIN.of(consulta.getDiafin())),
					Click.on(Busqueda.BTN_DONE), 
					Click.on(Busqueda.BTN_VIAJEROS));

			while (!Busqueda.INPUT_ADULTOS.resolveFor(actor).getValue().equals(consulta.getTravelersAdults())) {
				actor.attemptsTo(Click.on(Busqueda.BTN_INCREMENTAR_ADUTLOS));
			}

			actor.attemptsTo(Click.on(Busqueda.BTN_DONE_VIAJEROS),
					         Click.on(Busqueda.BTN_BUSQUEDA),
                             Click.on(Busqueda.INPUT_RESULTADO_HOTELES));
			actor.attemptsTo(Switch.toSecondWindow());

			actor.attemptsTo(Click.on(Busqueda.BTN_RESERVAR_REUNION),
			                 Click.on(Busqueda.BTN_CONFIRMAR_RESERVA));
			waitFor(5).seconds();

		} catch (Exception cause) {
			throw new  ReservaHotelExcepcion(cause);
		}

	}

	public static ReservaHoteles enTravelocity(Consultas consulta) {
		return instrumented(ReservaHoteles.class, consulta);
	}

}
