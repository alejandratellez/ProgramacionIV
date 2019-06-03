package Modelo;

public class NodoServicio {

	private ListaCliente dato;
	private NodoServicio enlace;
	private String serv;
	private int id;

	public NodoServicio(ListaCliente dato) {
		this.dato = dato;
		this.enlace = null;
	}

	public ListaCliente getDato() {
		return dato;
	}

	public void setDato(ListaCliente dato) {
		this.dato = dato;
	}

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
