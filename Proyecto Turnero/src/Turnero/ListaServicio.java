package Turnero;


public class ListaServicio {

	private NodoServicio cabeza;
	
	private NodoServicio actual;

	public void insertarElemento(ListaCliente dato) {

		NodoServicio nodo = new NodoServicio(dato);

		if (cabeza == null) {
			this.cabeza = nodo;

		} else {
			this.actual = this.cabeza;
			while (this.actual.getEnlace() != null) {
				this.actual = this.actual.getEnlace();

			}
			this.actual.setEnlace(nodo);
		}
	}

	public boolean buscarElemento(ListaCliente dato) {
		this.actual = this.cabeza;
		boolean encontrado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !encontrado) {
			if (this.actual.getDato().equals(dato)) {
				encontrado = true;
			}
			this.actual = this.actual.getEnlace();
		}

		return encontrado;
	}

	public boolean eliminarElemento(ListaCliente dato) {

		this.actual = this.cabeza;
		boolean eliminado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !eliminado) {
			if (this.actual.getDato().equals(dato)) {

				this.cabeza = null;
				eliminado = true;
			}
			this.actual = this.actual.getEnlace();

		}

		return eliminado;
	}

	public boolean actualizarElemento(ListaCliente dato, ListaCliente datoActualizado) {
		this.actual = this.cabeza;
		boolean actualizado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !actualizado) {
			if (this.actual.getDato().equals(dato)) {
				System.out.println(this.actual.getDato());
				this.actual.setDato(datoActualizado);
				System.out.println(this.actual.getDato());
				actualizado = true;
			}
			this.actual = this.actual.getEnlace();
		}

		return actualizado;
	}

	


}
