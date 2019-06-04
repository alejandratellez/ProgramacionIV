package Controlador;


import Modelo.ListaServicio;
import Vista.IntViewServicios;

import Vista.viewServicios;

public class ProgramaTurnero {
	public static void main(String[] args) {

		ListaServicio modelo = new ListaServicio();

		IntViewServicios vista = new viewServicios();

		ControlServicios control = new ControlServicios(vista, modelo);

		vista.setControlador(control);

		vista.arranca();
	}
}
