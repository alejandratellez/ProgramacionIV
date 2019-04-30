package Turnero;

import java.sql.Date;

public class Turno {
	private Cliente datos;
	private String servicio;
	private boolean prioridad;
	private Date fecha;
	public Cliente getDatos() {
		return datos;
	}
	public void setDatos(Cliente datos) {
		this.datos = datos;
	}
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public boolean isPrioridad() {
		return prioridad;
	}
	public void setPrioridad(boolean prioridad) {
		this.prioridad = prioridad;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
