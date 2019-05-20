package Turnero;

public class Cliente extends Persona {
	private boolean prioridad;
	private String Servicio;

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
