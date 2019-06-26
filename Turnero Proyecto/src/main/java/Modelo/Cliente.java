package Modelo;

public class Cliente extends Persona {
	private boolean prioridad;
	private String Servicio;

	public Cliente(int id, String nombre, boolean prioridad, String servicio) {
		this.setId(id);
		this.setNombre(nombre);
		this.prioridad = prioridad;
		this.Servicio = servicio;
	}

	public boolean getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(boolean prioridad) {
		this.prioridad = prioridad;
	}

	public String getServicio() {
		return Servicio;
	}

	public void setServicio(String servicio) {
		Servicio = servicio;
	}

}
