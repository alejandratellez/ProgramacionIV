package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.ListaServicio;
import Vista.IntViewServicios;

public class ControlServicios  implements ActionListener{
	public IntViewServicios vista;
	public ListaServicio modelo;
	
	public ControlServicios(IntViewServicios interfaz, ListaServicio modelo) {
		super();
		this.vista = interfaz;
		this.modelo = modelo;
	}

	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String servicio= vista.getServicio();
		modelo.insertarElemento(servicio);
		modelo.listarElemento();
	}
	
	
}
