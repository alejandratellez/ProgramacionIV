package Turnero;



public class NodoServicio {

	
	private ListaCliente dato;
	private NodoServicio enlace;

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
	
}
