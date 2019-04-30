package Turnero;



public class NodoCliente {
	private String dato;
	private NodoCliente enlace;
	private NodoCliente enlaceAnterior;

	public NodoCliente(String dato) {
		this.dato = dato;
		this.enlace = null;
		this.enlaceAnterior = null;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public NodoCliente getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoCliente enlace) {
		this.enlace = enlace;
	}

	public NodoCliente getAnterior() {
		return enlaceAnterior;
	}

	public void setAnterior(NodoCliente enlaceAnterior) {
		this.enlaceAnterior = enlaceAnterior;
	}

}
