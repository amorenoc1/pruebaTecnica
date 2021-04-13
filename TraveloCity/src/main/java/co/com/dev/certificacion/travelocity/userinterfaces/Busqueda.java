package co.com.dev.certificacion.travelocity.userinterfaces;
import org.openqa.selenium.By;

import net.serenitybdd.screenplay.targets.Target;

public class Busqueda {

	
	private  Busqueda() {}
	
	public static final Target INPUT_SEARCH = Target.the("INPUT SEARCH")
			.locatedBy("//button[@aria-label='Going to']");
	
	public static final Target LABEL_SEARCH = Target.the("INPUT SEARCH")
			.located(By.id("location-field-destination"));
	
	
    public static final String LIST_RESULTADO = "//button[@data-stid='location-field-destination-result-item-button']";
	
	
	public static final Target INPUT_FECHAINICIO = Target.the("INPUT FECHA INICIO")
			.located(By.id("d1-btn"));
	
	public static final Target INPUT_DIA = Target.the("INPUT DIA")
			.locatedBy("(//button[@data-day='{0}'])[1]");
	
	public static final Target BTN_DONE = Target.the("BTN DONE")
			.locatedBy("//span[contains(text(),'Done')]");
	
	public static final Target INPUT_FECHAFIN = Target.the("INPUT FECHA FIN")
			.located(By.id("d2-btn"));
	
	public static final Target INPUT_DIAFIN = Target.the("INPUT DIA FIN")
			.locatedBy("(//button[@data-day='{0}'])[2]");
	
	
	public static final Target BTN_BUSCAR= Target.the("BTN SEARCH")
			.locatedBy("(//button[@type='submit'])[1]");
	
	public static final Target BTN_VIAJEROS= Target.the("BTN VIAJEROS")
			.locatedBy("//button[@data-testid='travelers-field-trigger']");
	
	
	public static final Target INPUT_ADULTOS= Target.the("INPUT ADULTOS")
			.located(By.id("adult-input-0"));
	
	public static final Target BTN_INCREMENTAR_ADUTLOS = Target.the("BOTON INCREMENTAR ADULTOS")
            .locatedBy("//*[contains(@aria-labelledby,'increase-adults')]/parent::button");
	
	public static final Target BTN_DONE_VIAJEROS = Target.the("BOTON DOE VIAJEROS")
            .locatedBy("//button[@data-testid='guests-done-button']");
	
	 public static final Target BTN_BUSQUEDA = Target.the("BOTON BUSQUEDA")
	            .locatedBy("//button[@data-testid='submit-button']");
	
	 public static final Target BTN_RESERVAR_REUNION = Target.the("BOTON BUSQUEDA")
	            .locatedBy("//button[@data-stid=\"sticky-button\"]");
	 
	 public static final Target BTN_CONFIRMAR_RESERVA = Target.the("BOTON BUSQUEDA")
	            .locatedBy("(//button[@data-stid=\"submit-hotel-reserve\"])[2]");
	 
	 public static final String INPUT_RESULTADO_HOTELES = "(//a[@data-stid='open-hotel-information'])[1]";
	

}
