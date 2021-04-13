package co.com.dev.certificacion.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Paquetes {
	
	private Paquetes() {
		
	}

	
	public static final Target BTN_PAQUETES = Target.the("BTN PAQUETES")
			.locatedBy("(//a[@class=\"uitk-tab-anchor\"])[4]");
	
	public static final Target INPUT_SALIDAS= Target.the("INPUT PAQUETES")
			.locatedBy("(//button[@type=\"button\"])[12]");
	
	 public static final Target INPUT_SALIDA = Target.the("INPUT PAUQETE")
			 .locatedBy("//input[@placeholder=\"Where are you leaving from?\"]");
	 
	 public static final String  INPUT_SALIDA2 = "//li[@data-stid=\"location-field-origin-result-item\"]";
	 
	 public static final Target INPUT_DESTINOS= Target.the("INPUT DESTINO")
				.locatedBy("(//button[@aria-label=\"Going to\"])");
		
     public static final Target INPUT_DESTINO = Target.the("INPUT DESTINO")
				 .locatedBy("//input[@placeholder=\"Where are you going to?\"]");
		 
	 public static final String  INPUT_DESTINO2 = "//li[@data-stid=\"location-field-destination-result-item\"]";
	 
	 public static final Target BTN_FECHA1 = Target.the("BTN FECHA1")
			 .locatedBy("(//button[@data-stid=\"open-date-picker\"])[1]");
	 
	 public static final Target LIST_PAQUETES = Target.the("LIST PAQUETES")
 			.locatedBy("//a[@data-stid=\"open-hotel-information\"]");
	 
	 
		 
		
}
