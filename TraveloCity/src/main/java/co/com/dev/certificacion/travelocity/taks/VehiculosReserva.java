package co.com.dev.certificacion.travelocity.taks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.util.Properties;
import co.com.dev.certificacion.travelocity.exceptions.VehiculosReservaExcepcion;
import co.com.dev.certificacion.travelocity.interactions.Resultados;
import co.com.dev.certificacion.travelocity.models.DatosVehiculo;
import co.com.dev.certificacion.travelocity.userinterfaces.Busqueda;
import co.com.dev.certificacion.travelocity.userinterfaces.Vehiculo;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class VehiculosReserva extends PageObject implements Task {

	private DatosVehiculo datosvehiculo;

	public VehiculosReserva(DatosVehiculo datosvehiculo) {
		this.datosvehiculo = datosvehiculo;
	}

	private static final String URI_FILE = "src\\test\\resources\\url\\url.properties";

	public <T extends Actor> void performAs(T actor) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(URI_FILE));
			actor.attemptsTo(Open.url(properties.getProperty("TC")));

			actor.attemptsTo(

					Click.on(Vehiculo.INPUT_VEHICULO), 
					Click.on(Vehiculo.INPUT_ENTREGA),
					Enter.theValue(datosvehiculo.getEntrega()).into(Vehiculo.INPUT_ENTREGA2),
                    Resultados.onList(Vehiculo.INPUT_ENTREGA3),
			        Click.on(Vehiculo.INPUT_DEVOLUCION),
			        Enter.theValue(datosvehiculo.getDevolucion()).into(Vehiculo.INPUT_DEVOLUCION2),
                    Resultados.onList(Vehiculo.INPUT_DEVOLUCION3),
			        Click.on(Vehiculo.FECHA_ENTREGA),
			        Click.on(Vehiculo.INPUT_DIA.of(datosvehiculo.getFechaentrega())),
			        Click.on(Busqueda.BTN_DONE),
			        Click.on(Vehiculo.FECHA_DEVOLU),
			        Click.on(Vehiculo.INPUT_DIA2.of(datosvehiculo.getFechadevolu())),
			        Click.on(Busqueda.BTN_DONE),
			        SelectFromOptions.byVisibleText(datosvehiculo.getHoraentrega()).from(Vehiculo.INPUT_HORA_ENTREGA),
			        SelectFromOptions.byVisibleText(datosvehiculo.getHoradevolucion()).from(Vehiculo.INPUT_HORA_TERMINACION),
			        Click.on(Vehiculo.BTN_BUSCAR_VEHICULO)
			        
			        );
			        waitFor(10).seconds();

		} catch (Exception cause) {
			throw new  VehiculosReservaExcepcion(cause);
		}
	}

	public static VehiculosReserva enTravelocity(DatosVehiculo datosvehiculo) {
		return instrumented(VehiculosReserva.class, datosvehiculo);
	}

}
