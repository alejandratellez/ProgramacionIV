package Turnero;



public class NodoCliente {
	private Turno dato;
	private NodoCliente enlace;
    private int id;
	
	public NodoCliente(Turno dato) {
		this.dato=dato;
		this.enlace = null;		
	}

	public Turno getDato() {
		return dato;
	}

	public void setDato(Turno dato) {
		this.dato = dato;
	}

	public NodoCliente getEnlace() {
		return enlace;
	}

	public void setEnlace(NodoCliente enlace) {
		this.enlace = enlace;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

}
