package co.com.dev.certificacion.travelocity.exceptions;

@SuppressWarnings("serial")
public class ReservaHotelExcepcion  extends AssertionError  {
	
	public static final String FALLIDO_RESERVA_HOTEL = "Hay un problema con el metodo reserva  hotel";

	public  ReservaHotelExcepcion(Throwable cause) {
		super(FALLIDO_RESERVA_HOTEL, cause);
	}


}
