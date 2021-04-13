package co.com.dev.certificacion.travelocity.questions;

import static co.com.dev.certificacion.travelocity.userinterfaces.Vuelos.LIST_VUELOS;

import net.serenitybdd.screenplay.Question;

public class ValidateListVuelos {
	
	
	private static boolean band = true;

	public static Question<Boolean> andSync() {
		return (actor) -> {

			boolean data = false;

			if (LIST_VUELOS.resolveFor(actor).isPresent()) {

				data = true;

			}

			return data;
		};


}
}
