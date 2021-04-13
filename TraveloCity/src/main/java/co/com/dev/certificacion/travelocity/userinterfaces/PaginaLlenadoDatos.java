package co.com.dev.certificacion.travelocity.userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaLlenadoDatos {
	
	private PaginaLlenadoDatos() {
		
	}
	
	  public static final Target INPUT_NOMBRE_CONTACTO = Target.the(" INPUT NOMBRE CONTACTO")
	            .located(By.id("hotel-contact-name0"));
	  
	  public static final Target BTN_CODIGO_PAIS = Target.the(" BTN CODIGO PAIS")
	            .located(By.id("oneLinePhoneNumberCountryCodeHiddenSelect"));
	  
	  public static final Target INPUT_NUMERO_CELULAR = Target.the("INPUT NUMERO CELULAR")
	            .locatedBy("//input[@data-cko-rfrr-id=\"HOT.CKO.PHONENUMBER\"]");
	  
	  public static final Target INPUT_NOMBRE_TARJETA = Target.the("INPUT NOMBRE TARJETA")
	            .locatedBy("//input[@data-tealeaf-name='cardHolderName_1']");
	  
	  
	  public static final Target INPUT_NUMERO_TARJETA = Target.the("INPUT_NUMERO_TARJETA")
	            .located(By.id("creditCardInput"));
	  
	  public static final Target SELECT_MES_EXP = Target.the("SELECT MES EXP")
	            .locatedBy("//select[@class=\"cko-field cc-expiry-month gb-whitelist\"]");
	  
	  public static final Target SELECT_YEAR = Target.the("SELECT YEAR")
	            .locatedBy("//select[@class=\"cko-field cc-expiry-year gb-whitelist\"]");
	  
	  
		 public static final Target INPUT_CODIGO_SEGURIDAD = Target.the(" INPUT CODIGO SEGURIDAD")
         .located(By.id("new_cc_security_code"));
		 
		 public static final Target INPUT_ZIP_CODIGO = Target.the(" INPUT CODIGO SEGURIDAD")
		         .locatedBy("(//input[@type=\"tel\"])[5]");
		 
		 public static final Target INPUT_CORREO = Target.the("INPUT_CORREO")
		            .locatedBy("//input[@data-tealeaf-name='email']");
		 
		 public static final Target INPUT_TELEFONO = Target.the("INPUT_TELEFONO")
		            .locatedBy("(//input[@type=\"tel\"])[1]");
		 
		 public static final Target BTN_COMPLETADO = Target.the(" BTN COMPLETADO")
		            .located(By.id("complete-booking"));
		 
		  public static final Target BTN_RADIO = Target.the("BTN_RADIO")
				  .locatedBy("(//input[@type=\"radio\"])[4]");
		  
		  public static final Target LIST_HOTEL = Target.the("LIST HOTEL")
				  .locatedBy("//div[@class=\"site-content cols-row cf\"]");
		  
		  
		  
	  

}
