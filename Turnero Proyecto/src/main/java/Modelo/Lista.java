package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	List<Servicio> listaServicios = new ArrayList<Servicio>();

	public Servicio insertarServicio(String nombreServicio) {
		Servicio servicio = new Servicio(nombreServicio);
		servicio.setCliente(null);
		listaServicios.add(servicio);
		return servicio;
	}

	public void mostrarElementos() {

		for (int i = 0; i < listaServicios.size(); i++) {
			System.out.println("El id es " + listaServicios.get(i) + "Id es " + i + "El servicio es "
					+ listaServicios.get(i).getServ());
		}
	}

	public List<Servicio> getListaServicios() {
		return listaServicios;
	}

	public void setListaServicios(List<Servicio> listaServicios) {
		this.listaServicios = listaServicios;
	}

}
