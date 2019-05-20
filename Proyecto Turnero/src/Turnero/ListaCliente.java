package Turnero;



public class ListaCliente {
	private NodoCliente cabeza;	
	private NodoCliente actual;
	private NodoCliente anterior;
	/*
	public void insertarElemento(String dato) {
		public void insertarElemento(String dato) {

			NodoSimple nodo = new NodoSimple(dato);

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

		public boolean buscarElemento(String dato) {
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

		public boolean eliminarElemento(String dato) {

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

		public boolean actualizarElemento(String dato, String datoActualizado) {
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

		public String[] listarElemento() {
			this.actual = this.cabeza;
			String Lista[] = new String[3];
			int cont = 0;

			while (this.actual != null) {

				Lista[cont] = this.actual.getDato();
				System.out.println(Lista[cont]);
				cont++;
				this.actual = this.actual.getEnlace();
			}

			return Lista;
		}
*/
	}