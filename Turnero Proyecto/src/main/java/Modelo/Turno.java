package Modelo;

import java.util.Date;

public class Turno {
	private Cliente datos;
	private String fechaIngreso;

	public Turno(Cliente datos, String fechaIngreso) {

		this.datos = datos;
		this.fechaIngreso = fechaIngreso;
	}

	public Cliente getDatos() {
		return datos;
	}

	public void setDatos(Cliente datos) {
		this.datos = datos;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String date) {
		this.fechaIngreso = date;
	}

}
