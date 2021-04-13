package co.com.dev.certificacion.travelocity.exceptions;

@SuppressWarnings("serial")
public class VuelosReservaExcepcion extends AssertionError {
	
	public static final String FALLIDO_VUELOS_RESERVA = "Hay un problema con el metodo vuelos reserva";

	public  VuelosReservaExcepcion(Throwable cause) {
		super(FALLIDO_VUELOS_RESERVA , cause);
	}

}
