package co.com.dev.certificacion.travelocity.questions;

import static co.com.dev.certificacion.travelocity.userinterfaces.Actividades.LIST_FUENTES;

import net.serenitybdd.screenplay.Question;

public class ValidateListActividades {

	private static boolean band = true;

	public static Question<Boolean> andSync() {
		return (actor) -> {

			boolean data = false;

			if (LIST_FUENTES.resolveFor(actor).isPresent()) {

				data = true;

			}

			return data;
		};

	}
}
