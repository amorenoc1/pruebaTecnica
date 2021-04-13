package co.com.dev.certificacion.travelocity.exceptions;

@SuppressWarnings("serial")
public class VehiculosReservaExcepcion extends AssertionError{
	
	public static final String FALLIDO_RESERVA_VEHICULOS = "Hay un problema con el metodo reserva  vehiculos";

	public  VehiculosReservaExcepcion(Throwable cause) {
		super(FALLIDO_RESERVA_VEHICULOS, cause);
	}


}
