package co.com.dev.certificacion.travelocity.questions;

import static co.com.dev.certificacion.travelocity.userinterfaces.PaginaLlenadoDatos.LIST_HOTEL;

import net.serenitybdd.screenplay.Question;

public class ValidateListHoteles {
	
	private static boolean band = true;

	public static Question<Boolean> andSync() {
		return (actor) -> {

			boolean data = false;

			if (LIST_HOTEL.resolveFor(actor).isPresent()) {

				data = true;

			}

			return data;
		};
	}

}
