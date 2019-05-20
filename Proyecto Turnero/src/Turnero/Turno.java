package Turnero;

import java.sql.Date;

public class Turno {
	private Cliente datos;
	private Date fechaIngreso;

	public Cliente getDatos() {
		return datos;
	}

	public void setDatos(Cliente datos) {
		this.datos = datos;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
