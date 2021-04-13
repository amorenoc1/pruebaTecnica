package co.com.dev.certificacion.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Vuelos {
	
	private Vuelos() {
		
	}
	
	public static final Target BTN_VUELOS = Target.the("BTN VUELOS")
			.locatedBy("(//a[@class=\"uitk-tab-anchor\"])[2]");
	
	public static final Target BTN_MULTIPLE_VUELOS = Target.the("BTN MULTIPLE VUELOS")
			.locatedBy("//span[contains(text(),'One-way')]");
	
	public static final Target INPUT_ORIGENES_VUELOUNO= Target.the("INPUT ORIGENES")
			.locatedBy("(//button[@type=\"button\"])[11]");
	
	 public static final Target INPUT_ORIGEN_VUELO_UNO = Target.the("INPUT ORIGEN UNO")
			 .locatedBy("(//input[@placeholder=\"Where are you leaving from?\"])[1]");
	 
	 public static final String  INPUT_ORIGEN_VUELO_DOS = "//li[@data-stid=\"location-field-leg1-origin-result-item\"]";
	 
	 public static final Target INPUT_DESTINOS_VUELOUNO= Target.the("INPUT DESTINOS")
				.locatedBy("(//button[@aria-label=\"Going to\"])[1]");
	 
	 public static final Target INPUT_DESTINO_VUELO_UNO = Target.the("INPUT ORIGEN UNO")
			 .locatedBy("(//input[@placeholder=\"Where are you going to?\"])[1]");
	 
	 public static final String  INPUT_DESTINO_VUELO_DOS = "(//li[@data-stid=\"location-field-leg1-destination-result-item\"])[1]";
	 
	 public static final Target LIST_VUELOS = Target.the("LIST VUELOS")
			 .locatedBy("//div[@data-test-id=\"intersection-observer\"]");
	 
		

}
