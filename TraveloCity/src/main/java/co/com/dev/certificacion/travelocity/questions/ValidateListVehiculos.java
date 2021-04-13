package co.com.dev.certificacion.travelocity.questions;

import static co.com.dev.certificacion.travelocity.userinterfaces.Vehiculo.LIST_VEHICULO;

import net.serenitybdd.screenplay.Question;

public class ValidateListVehiculos {
	
	private static boolean band = true;

	public static Question<Boolean> andSync() {
		return (actor) -> {

			boolean data = false;

			if (LIST_VEHICULO.resolveFor(actor).isPresent()) {

				data = true;

			}

			return data;
		};


}
}
