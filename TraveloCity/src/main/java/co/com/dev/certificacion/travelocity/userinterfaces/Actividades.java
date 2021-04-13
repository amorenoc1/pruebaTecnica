package co.com.dev.certificacion.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Actividades {
	
	private Actividades() {
		
	}
	
	public static final Target BTN_ACTIVIDADES = Target.the("BTN ACTIVIDADES")
			.locatedBy("(//a[@class=\"uitk-tab-anchor\"])[5]");
	
	public static final Target INPUT_ACTIVIDADES= Target.the("INPUT ACTIVIDADES")
			.locatedBy("(//button[@type=\"button\"])[4]");
	
	 public static final Target INPUT_ACTIVIDAD = Target.the("INPUT ACTIVIDAD")
			 .locatedBy("//input[@placeholder=\"Where are you going?\"]");
	 
	 public static final String  INPUT_ACTIVIDAD2  = "//li[@data-stid=\"location-field-location-result-item\"]";
	 
	 public static final Target FECHA_DE = Target.the(" FECHA DE")
			 .locatedBy("(//button[@data-stid=\"open-date-picker\"])[1]");
	 
	 public static final Target FECHA_AL = Target.the(" FECHA AL")
			 .locatedBy("(//button[@data-stid=\"open-date-picker\"])[2]");
     
     public static final Target INPUT_DIA = Target.the("INPUT DIA")
 			.locatedBy("(//button[@data-day='{0}'])[1]");
     
     public static final Target INPUT_DIA2 = Target.the("INPUT DIA 2")
  			.locatedBy("(//button[@data-day='{0}'])[2]");
	
     public static final Target BTN_BUSCAR = Target.the("BTN_BUSCAR")
   			.locatedBy("//button[contains(text(),'Search')]");
     
     public static final Target LIST_FUENTES = Target.the("LIST FUENTES")
    			.locatedBy("//a[@data-testid=\"card-link\"]");

}
