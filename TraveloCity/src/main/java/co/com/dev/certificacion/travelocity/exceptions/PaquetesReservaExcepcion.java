package co.com.dev.certificacion.travelocity.exceptions;

@SuppressWarnings("serial")
public class PaquetesReservaExcepcion extends AssertionError {
	
	public static final String FALLIDO_PAQUETES_RESERVA = "Hay un problema con el metodo paquetes reserva";

	public  PaquetesReservaExcepcion(Throwable cause) {
		super(FALLIDO_PAQUETES_RESERVA , cause);
	}

}
