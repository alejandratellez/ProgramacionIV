package Modelo;

public class NodoCliente {

	private Turno dato;
	private NodoCliente enlaceSiguiente;
	private NodoCliente enlaceAnterior;
	private int id;
	
	public NodoCliente(Turno dato) {
		this.dato = dato;
		this.enlaceSiguiente = null;
		this.enlaceAnterior = null;
	}

	public Turno getDato() {
		return dato;
	}

	public void setDato(Turno dato) {
		this.dato = dato;
	}

	public NodoCliente getEnlaceSiguiente() {
		return enlaceSiguiente;
	}

	public void setEnlaceSiguiente(NodoCliente enlaceSiguiente) {
		this.enlaceSiguiente = enlaceSiguiente;
	}

	public NodoCliente getEnlaceAnterior() {
		return enlaceAnterior;
	}

	public void setEnlaceAnterior(NodoCliente enlaceAnterior) {
		this.enlaceAnterior = enlaceAnterior;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
