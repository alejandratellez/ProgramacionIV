package Modelo;

public class NodoLlegada {
	private Turno dato;
	private NodoLlegada enlace;
	private int id;

	public NodoLlegada(Turno dato) {
		this.dato = dato;
		this.enlace = null;
	}

	public Turno getDato() {
		return dato;
	}

	public void setDato(Turno dato) {
		this.dato = dato;
	}

	public NodoLlegada getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoLlegada enlace) {
		this.enlace = enlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
