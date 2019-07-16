package Modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Asesor")
public class Asesor {

	@Id
	private int id;

	@Column(name = "nombre_Persona")
	private String nombre;

	@Column(name = "Estado")
	private boolean estado;

	@ManyToMany
	private List<Servicio> servicio;

	public Asesor() {

	}

	public Asesor(String dato) {
		this.nombre = dato;
	}

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

	public Asesor(int id, String nombre, boolean estado, Servicio servicio) {

		this.id = id;
		this.nombre = nombre;
		this.servicio.add(servicio);
		this.estado = estado;
	}

	public List<Servicio> getServicio() {
		return servicio;
	}

	public void setServicio(List<Servicio> servicio) {
		this.servicio = servicio;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + ", servicio=" + servicio + ", prioridad=" + "]";
	}

}
