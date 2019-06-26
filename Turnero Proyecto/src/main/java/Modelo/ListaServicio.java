package Modelo;

public class ListaServicio {
	private NodoServicio cabeza;
	private NodoServicio actual;
	private int Size;

	public NodoServicio insertarElemento(String servicio) {
		////ListaCliente lista = new ListaCliente();
		NodoServicio nodo = new NodoServicio(servicio);
		///nodo.setDato(lista);
		nodo.setServ(servicio);
		if (cabeza == null) {

			nodo.setId(0);
			nodo.setEnlace(null);
			this.cabeza = nodo;
			this.Size = 1;

		} else {
			int cont = 1;
			this.actual = this.cabeza;
			while (this.actual.getEnlace() != null) {
				this.actual = this.actual.getEnlace();

				cont = cont + 1;
			}

			nodo.setId(cont);
			this.actual.setEnlace(nodo);
			this.Size = this.Size + 1;

		}

		return nodo;
	}

	public boolean buscarElemento(String serv) {
		this.actual = this.cabeza;
		boolean encontrado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !encontrado) {
			if (this.actual.getServ().equals(serv)) {
				encontrado = true;
			}
			this.actual = this.actual.getEnlace();
		}

		return encontrado;
	}

	public int getSize() {
		return this.Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	/*
	 * 
	 * public NodoCliente[] listarElemento() { NodoCliente Lista [] = new
	 * NodoCliente[this.Size]; //int Lista[] = new int[this.Size]; this.actual =
	 * this.cabeza; int cont = 0;
	 * 
	 * while (this.actual != null) {
	 * 
	 * Lista[cont] = this.actual; System.out.println("Posicion " + Lista[cont] +
	 * " La persona es: " + this.actual.getDato().getDatos().getNombre()); cont++;
	 * this.actual = this.actual.getEnlace(); }
	 * 
	 * return Lista; }
	 * 
	 */

	public int[] listarElemento() {

		int Lista[] = new int[this.Size];
		this.actual = this.cabeza;
		int cont = 0;

		while (this.actual != null) {

			Lista[cont] = this.actual.getId();
			System.out
					.println("Posicion " + Lista[cont] + " El servicio es: " + this.actual.getServ() + "La lista es: ");
			cont++;
			this.actual = this.actual.getEnlace();
		}

		return Lista;
	}

}
