package Modelo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PuestosAtencion")
public class PuestosAtencion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "nombre_puesto")
	private String nombre;

	@Column(name = "Estado")
	private boolean estado;

	@ManyToMany
	private List<Asesor> asesor;

	public PuestosAtencion() {

	}

	public PuestosAtencion(String dato) {
		this.nombre = dato;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean getEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public List<Asesor> getAsesor() {
		return asesor;
	}

	public void setAsesor(List<Asesor> servicio) {
		this.asesor = servicio;
	}

	@Override
	public String toString() {
		return "PuestosAtencion [id=" + id + ", nombre=" + nombre + ", estado=" + estado + ", asesor=" + asesor + "]";
	}

}
