package co.com.dev.certificacion.travelocity.taks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import co.com.dev.certificacion.travelocity.interactions.Resultados;
import co.com.dev.certificacion.travelocity.models.DatosActividades;
import co.com.dev.certificacion.travelocity.userinterfaces.Actividades;
import co.com.dev.certificacion.travelocity.userinterfaces.Busqueda;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class ActividadesReserva   extends PageObject implements Task{
	
	private DatosActividades datosactividades;

	public ActividadesReserva(DatosActividades datosactividades) {
		this.datosactividades = datosactividades;
	}


	private static final String URI_FILE = "src\\test\\resources\\url\\url.properties";

	public <T extends Actor> void performAs(T actor) {
		Properties properties = new Properties();
		try {
			properties.load(new FileReader(URI_FILE));
			actor.attemptsTo(Open.url(properties.getProperty("TC")));

			actor.attemptsTo(

					Click.on(Actividades.BTN_ACTIVIDADES),
					Click.on(Actividades.INPUT_ACTIVIDADES),
					Enter.theValue(datosactividades.getActividades()).into(Actividades.INPUT_ACTIVIDAD),
                    Resultados.onList(Actividades.INPUT_ACTIVIDAD2),
                    Click.on(Actividades.FECHA_DE),
                    Click.on(Actividades.INPUT_DIA.of(datosactividades.getDel())),
                    Click.on(Busqueda.BTN_DONE),
                    Click.on(Actividades.FECHA_AL),
                    Click.on(Actividades.INPUT_DIA2.of(datosactividades.getAl())),
                    Click.on(Busqueda.BTN_DONE),
                    Click.on(Actividades.BTN_BUSCAR)
                    
                    );
			
			        waitFor(15).seconds();
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
		
		public static ActividadesReserva enTravelocity(DatosActividades datosactividades) {
			return instrumented(ActividadesReserva.class, datosactividades);
		}
}
