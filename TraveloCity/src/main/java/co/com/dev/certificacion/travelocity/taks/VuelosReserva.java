package co.com.dev.certificacion.travelocity.taks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.util.Properties;
import co.com.dev.certificacion.travelocity.exceptions.VuelosReservaExcepcion;
import co.com.dev.certificacion.travelocity.interactions.Resultados;
import co.com.dev.certificacion.travelocity.models.DatosVuelos;
import co.com.dev.certificacion.travelocity.userinterfaces.Actividades;
import co.com.dev.certificacion.travelocity.userinterfaces.Busqueda;
import co.com.dev.certificacion.travelocity.userinterfaces.Vuelos;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class VuelosReserva extends PageObject implements Task {

	private DatosVuelos datosVuelos;

	public VuelosReserva(DatosVuelos datosVuelos) {
		this.datosVuelos = datosVuelos;
	}

	private static final String URI_FILE = "src\\test\\resources\\url\\url.properties";

	public <T extends Actor> void performAs(T actor) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(URI_FILE));
			actor.attemptsTo(Open.url(properties.getProperty("TC")));
			
             actor.attemptsTo(
					
					Click.on(Vuelos.BTN_VUELOS),
					Click.on(Vuelos.BTN_MULTIPLE_VUELOS),
					Click.on(Vuelos.INPUT_ORIGENES_VUELOUNO),
                    Enter.theValue(datosVuelos.getVuelo1()).into(Vuelos.INPUT_ORIGEN_VUELO_UNO),
                    Resultados.onList(Vuelos.INPUT_ORIGEN_VUELO_DOS),
                    
                    Click.on(Vuelos.INPUT_DESTINOS_VUELOUNO),
                    Enter.theValue(datosVuelos.getDestino1()).into(Vuelos.INPUT_DESTINO_VUELO_UNO),
                    Resultados.onList(Vuelos.INPUT_DESTINO_VUELO_DOS),
                    
                    Click.on(Actividades.FECHA_DE),
                    Click.on(Actividades.INPUT_DIA.of(datosVuelos.getFecha1())),
                    Click.on(Busqueda.BTN_DONE),
                    Click.on(Actividades.BTN_BUSCAR)
                    
                
					);

              waitFor(15).seconds();

		} catch (Exception cause) {
			throw new  VuelosReservaExcepcion(cause);
		}
}

	public static VuelosReserva enTravelocity(DatosVuelos datosVuelos) {
		return instrumented( VuelosReserva.class, datosVuelos);
	}

}
