package co.com.dev.certificacion.travelocity.taks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.util.Properties;
import co.com.dev.certificacion.travelocity.exceptions.PaquetesReservaExcepcion;
import co.com.dev.certificacion.travelocity.interactions.Resultados;
import co.com.dev.certificacion.travelocity.models.DatosPaquetes;
import co.com.dev.certificacion.travelocity.userinterfaces.Actividades;
import co.com.dev.certificacion.travelocity.userinterfaces.Busqueda;
import co.com.dev.certificacion.travelocity.userinterfaces.Paquetes;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class PaquetesReserva extends PageObject implements Task {
	
	private DatosPaquetes datospaquetes;

	public PaquetesReserva(DatosPaquetes datospaquetes) {
		this.datospaquetes = datospaquetes;
	}


	private static final String URI_FILE = "src\\test\\resources\\url\\url.properties";

	public <T extends Actor> void performAs(T actor) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(URI_FILE));
			actor.attemptsTo(Open.url(properties.getProperty("TC")));

			actor.attemptsTo(
					
					Click.on(Paquetes.BTN_PAQUETES),
				    Click.on(Paquetes.INPUT_SALIDAS),
                    Enter.theValue(datospaquetes.getOrigen()).into(Paquetes.INPUT_SALIDA),
                    Resultados.onList(Paquetes.INPUT_SALIDA2),
					Click.on(Paquetes.INPUT_DESTINOS),
					Enter.theValue(datospaquetes.getDestino()).into(Paquetes.INPUT_DESTINO),
                    Resultados.onList(Paquetes.INPUT_DESTINO2),
                    Click.on(Actividades.FECHA_DE),
                    Click.on(Actividades.INPUT_DIA.of(datospaquetes.getSalida())),
                    Click.on(Busqueda.BTN_DONE),
                    Click.on(Actividades.FECHA_AL),
                    Click.on(Actividades.INPUT_DIA2.of(datospaquetes.getRegreso())),
                    Click.on(Busqueda.BTN_DONE),
                    Click.on(Actividades.BTN_BUSCAR)
         
					);
	
				    waitFor(15).seconds();
	
		} catch (Exception cause) {
			throw new  PaquetesReservaExcepcion(cause);
		}
	}
		public static PaquetesReserva enTravelocity(DatosPaquetes datospaquetes) {
			return instrumented( PaquetesReserva.class, datospaquetes);
		}
}
