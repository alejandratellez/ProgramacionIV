package Controlador;


import Modelo.Lista;
import Modelo.ListaServicio;

import Vista.viewCliente;
import Vista.viewPrioridad;
import Vista.viewServicios;

public class ProgramaTurnero {
	public static void main(String[] args) {

		Lista modelo = new Lista();

		viewServicios vista = new viewServicios();
		viewPrioridad vistaPrioridad=new viewPrioridad();

		ControlServicios control = new ControlServicios(vista, modelo);
		ControlPrioridad controlPrioridad= new ControlPrioridad(vistaPrioridad);
		vista.setControlador(control);
		vistaPrioridad.setControlador(controlPrioridad);
		
		//vistaCliente.setControlador(control);
		vista.arranca();
		vistaPrioridad.arranca();
		
		
	}
}
