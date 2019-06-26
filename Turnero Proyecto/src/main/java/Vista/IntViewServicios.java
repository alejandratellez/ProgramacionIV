package Vista;

import Controlador.ControlServicios;

public interface IntViewServicios {
	void setControlador(ControlServicios controlServ);
	String getServicio();
	void arranca();
}
