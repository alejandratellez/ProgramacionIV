
package Modelo;

public class ListaLlegada {

	private NodoLlegada cabeza;
	private NodoLlegada actual;
	private int Size;

	public void insertarElemento(int id, String nombre, boolean prioridad, String servicio) {
		FechaString fecha = new FechaString();
		Cliente datosCliente = new Cliente(id, nombre, prioridad, servicio);
		Turno dato = new Turno(datosCliente, fecha.getFecha());

		NodoLlegada nodo = new NodoLlegada(dato);

		if (cabeza == null) {

			nodo.setId(0);
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
	}

	public boolean buscarElemento(int cedula) {
		this.actual = this.cabeza;
		boolean encontrado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !encontrado) {
			if (this.actual.getDato().getDatos().getId() == cedula) {
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
			System.out.println(
					"Posicion " + Lista[cont] + " La persona es: " + this.actual.getDato().getDatos().getNombre());
			cont++;
			this.actual = this.actual.getEnlace();
		}

		return Lista;
	}
}