package Turnero;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class ListaLlegada {

	private NodoCliente cabeza;
	private NodoCliente actual;

	public void insertarElemento(int cedula, String nombre, boolean prioridad, String servicio) {
		Calendar calendario = new GregorianCalendar();
		Cliente datosCliente = null;
		datosCliente.setId(cedula);
		datosCliente.setNombre(nombre);
		datosCliente.setPrioridad(prioridad);
		datosCliente.setServicio(servicio);
		Turno dato = null;
		dato.setDatos(datosCliente);
		Date fecha = null;
		fecha.setHours(calendario.HOUR_OF_DAY);
		fecha.setMinutes(calendario.MINUTE);
		fecha.setDate(calendario.DATE);

		dato.setFechaIngreso(fecha);
		NodoCliente nodo = new NodoCliente(dato);

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

	public boolean eliminarElemento(int dato) {

		this.actual = this.cabeza;
		boolean eliminado = false;
		while (this.actual != null && this.actual.getEnlace() != null || !eliminado) {
			if (this.actual.getDato().getDatos().getId() == dato) {

				this.cabeza = null;
				eliminado = true;
			}
			this.actual = this.actual.getEnlace();

		}

		return eliminado;
	}

	/*
	 * public boolean actualizarElemento(String dato, String datoActualizado) {
	 * this.actual = this.cabeza; boolean actualizado = false; while (this.actual !=
	 * null && this.actual.getEnlace() != null || !actualizado) { if
	 * (this.actual.getDato().equals(dato)) {
	 * System.out.println(this.actual.getDato());
	 * this.actual.setDato(datoActualizado);
	 * System.out.println(this.actual.getDato()); actualizado = true; } this.actual
	 * = this.actual.getEnlace(); }
	 * 
	 * return actualizado; }
	 */
	public int[] listarElemento() {
		this.actual = this.cabeza;
		int Lista[] = new int[3];
		int cont = 0;

		while (this.actual != null) {

			Lista[cont] = this.actual.getDato().getDatos().getId();
			System.out.println(Lista[cont]);
			cont++;
			this.actual = this.actual.getEnlace();
		}

		return Lista;
	}

}
