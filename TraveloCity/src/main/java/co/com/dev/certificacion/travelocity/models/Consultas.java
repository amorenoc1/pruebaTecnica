package co.com.dev.certificacion.travelocity.models;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;

public class Consultas {
	
	private String destino;
	private String diainicio;
	private String diafin;
	private final String travelersAdults;
	
	

	public String getDestino() {
		return destino;
	}
	
	public String getDiainicio() {
		return diainicio;
	}
	
	public String getDiafin() {
		return diafin;
	}
	
	public String getTravelersAdults() {
		return travelersAdults;
	}

	public Consultas(DataTable filters) {
		List<Map<String, String>> filter = filters.asMaps(String.class, String.class);

		this.travelersAdults = filter.get(0).get("travelersAdults");

	}


}
