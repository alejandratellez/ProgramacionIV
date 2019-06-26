package Controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.ListaServicio;
import Modelo.NodoServicio;
import Vista.IntViewServicios;

public class ControlServicios implements ActionListener {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Turnero");

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public IntViewServicios vista;
	public ListaServicio modelo;

	public ControlServicios(IntViewServicios interfaz, ListaServicio modelo) {
		super();
		this.vista = interfaz;
		this.modelo = modelo;
	}

	public void actionPerformed(ActionEvent e) {
		EntityManager em = getEntityManager();

		// TODO Auto-generated method stub
		String servicio = vista.getServicio();
		NodoServicio nodoServicio = new NodoServicio(null);
		nodoServicio = modelo.insertarElemento(servicio);
		modelo.listarElemento();

		em.getTransaction().begin();
		nodoServicio = em.merge(nodoServicio);
		em.getTransaction().commit();
		em.close();

	}

}