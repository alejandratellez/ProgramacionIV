package Modelo;

public class ListaCliente {
	/*
	private NodoCliente cabeza;
	private NodoCliente actual;
	private int Size;

	public void insertarAlInicio(int id, String nombre, boolean prioridad, String servicio) {
		FechaString fecha = new FechaString();
		Cliente datosCliente = new Cliente(id, nombre, prioridad, servicio);
		Turno dato = new Turno(datosCliente, fecha.getFecha());

		NodoCliente nodo = new NodoCliente(dato);

		if (cabeza == null) {
			nodo.setId(0);
			this.cabeza = nodo;
			this.Size = 1;
		} else {
			int cont = 0;
			nodo.setId(cont);
			nodo.setEnlaceSiguiente(this.cabeza);
			this.cabeza.setEnlaceAnterior(nodo);
			this.cabeza = nodo;
			this.Size = this.Size + 1;
			this.actual = this.cabeza;
			while (this.actual.getEnlaceSiguiente() != null) {
				// this.anterior.setEnlaceAnterior(actual);
				this.actual.setId(cont);
				this.actual = this.actual.getEnlaceSiguiente();
				cont = cont + 1;

			}
			this.actual.setId(cont);

		}
	}

	public void insertarAlFinal(int id, String nombre, boolean prioridad, String servicio) {
		FechaString fecha = new FechaString();
		Cliente datosCliente = new Cliente(id, nombre, prioridad, servicio);
		Turno dato = new Turno(datosCliente, fecha.getFecha());

		NodoCliente nodo = new NodoCliente(dato);

		if (cabeza == null) {
			nodo.setId(0);
			this.cabeza = nodo;
			this.Size = 1;
		} else {
			int cont = 1;
			this.actual = this.cabeza;
			while (this.actual.getEnlaceSiguiente() != null) {
				// this.anterior.setEnlaceAnterior(actual);
				this.actual = this.actual.getEnlaceSiguiente();
				cont = cont + 1;

			}
			nodo.setId(cont);
			this.actual.setEnlaceSiguiente(nodo);
			nodo.setEnlaceSiguiente(null);
			nodo.setEnlaceAnterior(actual);
			this.Size = this.Size + 1;
		}
	}

	public boolean buscarElemento(int cedula) {
		this.actual = this.cabeza;
		boolean encontrado = false;
		while (this.actual != null && this.actual.getEnlaceSiguiente() != null || !encontrado) {
			if (this.actual.getDato().getDatos().getId() == cedula) {
				encontrado = true;
			}
			this.actual = this.actual.getEnlaceSiguiente();
		}

		return encontrado;
	}

	public int getSize() {
		return this.Size;
	}

	public void setSize(int size) {
		Size = size;
	}

	public int[] listarElemento() {

		int Lista[] = new int[this.Size];
		this.actual = this.cabeza;
		int cont = 0;

		while (this.actual != null) {

			Lista[cont] = this.actual.getId();
			System.out.println(
					"Posicion " + Lista[cont] + " La persona es: " + this.actual.getDato().getDatos().getNombre()
							+ " cedula es: " + this.actual.getDato().getDatos().getId());
			cont++;
			this.actual = this.actual.getEnlaceSiguiente();
		}

		return Lista;
	}*/
}