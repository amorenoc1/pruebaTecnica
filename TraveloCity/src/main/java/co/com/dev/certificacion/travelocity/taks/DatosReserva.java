package co.com.dev.certificacion.travelocity.taks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import co.com.dev.certificacion.travelocity.models.LlenadoDeDatos;
import co.com.dev.certificacion.travelocity.userinterfaces.PaginaLlenadoDatos;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class DatosReserva extends PageObject implements Task {

	private LlenadoDeDatos datos;

	public DatosReserva(LlenadoDeDatos datos) {
		this.datos = datos;
	}

	public <T extends Actor> void performAs(T actor) {

		actor.attemptsTo(
				WaitUntil.the(PaginaLlenadoDatos.INPUT_NOMBRE_CONTACTO, isCurrentlyVisible()).forNoMoreThan(15)
						.seconds(),
				Enter.theValue(datos.getNombrecontacto()).into(PaginaLlenadoDatos.INPUT_NOMBRE_CONTACTO),
				Enter.theValue(datos.getTelefono()).into(PaginaLlenadoDatos.INPUT_TELEFONO),
				Click.on(PaginaLlenadoDatos.BTN_RADIO),
				Enter.theValue(datos.getNombretarjeta()).into(PaginaLlenadoDatos.INPUT_NOMBRE_TARJETA),
				Enter.theValue(datos.getNumerotarjeta()).into(PaginaLlenadoDatos.INPUT_NUMERO_TARJETA),
				SelectFromOptions.byVisibleText(datos.getMesexp()).from(PaginaLlenadoDatos.SELECT_MES_EXP),
				SelectFromOptions.byVisibleText(datos.getYear()).from(PaginaLlenadoDatos.SELECT_YEAR),
				Enter.theValue(datos.getCodigos()).into(PaginaLlenadoDatos.INPUT_CODIGO_SEGURIDAD),
				Enter.theValue(datos.getZipcodigo()).into(PaginaLlenadoDatos.INPUT_ZIP_CODIGO),
				Enter.theValue(datos.getCorreo()).into(PaginaLlenadoDatos.INPUT_CORREO),
				Click.on(PaginaLlenadoDatos.BTN_COMPLETADO)

		);

	}

	public static DatosReserva enTravelocity(LlenadoDeDatos datos) {
		return instrumented(DatosReserva.class, datos);
	}

}
