package Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {
	
	@Id
	private int id;
	@Column(name = "nombre_Persona")
	private String nombre;
	@Column(name = "prioridad")
	private boolean prioridad;
	@Column(name = "servicio")
	private String Servicio;
	

	public Cliente() {

	}

	public Cliente(int id, String nombre, boolean prioridad, String servicio) {
		this.id=id;
		this.nombre=nombre;
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
