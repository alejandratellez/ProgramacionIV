package Modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	

	
	@ManyToMany
	private List<Servicio> servicio;
	
	@ManyToMany
	private List<Prioridad> prioridad;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	

	public Cliente() {

	}

	public Cliente(int id, String nombre, Prioridad prioridad, Servicio servicio) {
		
		
		this.id = id;
		this.nombre = nombre;
		this.prioridad.add(prioridad);
		this.servicio.add(servicio);
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	public List<Prioridad> getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(List<Prioridad> prioridad) {
		this.prioridad = prioridad;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", servicio=" + servicio + ", prioridad=" + prioridad + "]";
	}

	



}
