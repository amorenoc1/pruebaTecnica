package co.com.dev.certificacion.travelocity.questions;

import static co.com.dev.certificacion.travelocity.userinterfaces.Paquetes.LIST_PAQUETES;

import net.serenitybdd.screenplay.Question;

public class ValidateListPaquetes {
	
	private static boolean band = true;

	public static Question<Boolean> andSync() {
		return (actor) -> {

			boolean data = false;

			if (LIST_PAQUETES.resolveFor(actor).isPresent()) {

				data = true;

			}

			return data;
		};

}
}
