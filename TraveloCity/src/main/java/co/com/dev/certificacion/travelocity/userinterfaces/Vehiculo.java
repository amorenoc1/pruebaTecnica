package co.com.dev.certificacion.travelocity.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Vehiculo {

private  Vehiculo() {}
	
	public static final Target INPUT_VEHICULO = Target.the("INPUT VEHICULO")
			.locatedBy("(//a[@class=\"uitk-tab-anchor\"])[3]");
	
	 public static final Target INPUT_ENTREGA = Target.the("INPUT ENTREGA")
	            .locatedBy("(//button[@type=\"button\"])[4]");
	 
	 public static final Target INPUT_ENTREGA2 = Target.the("INPUT ENTREGA 2")
			 .locatedBy("//input[@placeholder=\"Where are you picking up your car?\"]");
	 
     public static final String  INPUT_ENTREGA3  = "//li[@data-stid='location-field-locn-result-item']";
     
     public static final Target INPUT_DEVOLUCION = Target.the("INPUT DESTINO")
	            .locatedBy("//button[@data-stid=\"location-field-loc2-menu-trigger\"]");
     
     public static final Target INPUT_DEVOLUCION2 = Target.the("INPUT DESTINO 2")
			 .locatedBy("//input[@placeholder=\"Where are you dropping off your car?\"]");
     
     public static final String  INPUT_DEVOLUCION3  = "//li[@data-stid=\"location-field-loc2-result-item\"]";
     
     public static final Target FECHA_ENTREGA = Target.the(" FECHA_ENTREGA")
			 .locatedBy("(//button[@data-stid=\"open-date-picker\"])[1]");
     
     public static final Target FECHA_DEVOLU = Target.the(" FECHA_DEVOLU")
			 .locatedBy("(//button[@data-stid=\"open-date-picker\"])[2]");
     
     public static final Target INPUT_DIA = Target.the("INPUT DIA")
 			.locatedBy("(//button[@data-day='{0}'])[1]");
     
     public static final Target INPUT_DIA2 = Target.the("INPUT DIA 2")
  			.locatedBy("(//button[@data-day='{0}'])[2]");
     
     
     public static final Target INPUT_HORA_ENTREGA = Target.the("INPUT HORA ENTREGA")
             .locatedBy("//select[@aria-label='Pick-up time']");
     
     public static final Target INPUT_HORA_TERMINACION = Target.the("INPUT HORA TERMINACION")
             .locatedBy("//select[@aria-label='Drop-off time']");
 
     public static final Target BTN_BUSCAR_VEHICULO = Target.the("BTN BUSCAR VEHICULO")
             .locatedBy("//button[@data-testid='submit-button']");
     
     public static final Target LIST_VEHICULO = Target.the("LIST VUELOS")
			 .locatedBy("//div[@class=\"uitk-flex\"]");
	 

	 
}
