package Controlador;

import Modelo.Lista;
import Vista.viewAdministrador;
import Vista.viewCliente;
import Vista.viewPrioridad;
import Vista.viewServicios;

public class Prueba {
	public static void main(String[] args) {
		
		

		viewPrioridad vistaPrioridad = new viewPrioridad();
		viewAdministrador vistaAdministrador = new viewAdministrador();
		viewCliente vistaCliente = new viewCliente();
		Controller control = new Controller();

		vistaPrioridad.setControlador(control);
		control.setVistaPrioridad(vistaPrioridad);
		
		
		vistaAdministrador.setControlador(control);
		control.setVistaAdminsitrador(vistaAdministrador);
		
		vistaCliente.setControlador(control);
		control.setVistaCliente(vistaCliente);
		
		vistaAdministrador.arranca();
		vistaCliente.arranca();

		

	}

}
