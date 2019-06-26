package Modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Servicio")
public class NodoServicio implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private NodoServicio enlace;

	@Id
	private int id;

	@Column(name = "nombre_servicio")
	private String serv;
	
	
	///private ListaCliente dato;

	public NodoServicio() {
	}

	public NodoServicio(String dato) {
		this.serv = dato;
	}
/*
	public ListaCliente getDato() {
		return this.dato;
	}

	public void setDato(ListaCliente dato) {
		this.dato = dato;
	}
*/
	public NodoServicio getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoServicio enlace) {
		this.enlace = enlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getServ() {
		return serv;
	}

	public void setServ(String serv) {
		this.serv = serv;
	}

}
