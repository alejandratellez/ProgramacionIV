package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Modelo.Cliente;
import Modelo.Servicio;
import Vista.viewCliente;

public class ControlCliente implements ActionListener {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Turnero");
	private viewCliente vista;

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public ControlCliente(viewCliente interfaz) {
		super();
		this.vista = interfaz;

	}

	public ControlCliente() {

	}

	public void actionPerformed(ActionEvent arg0) {
		EntityManager em = getEntityManager();
		// TODO Auto-generated method stub
		String servicio = vista.getServicio();
		String prioridad = vista.getPrioridad();
		String nombre = vista.getNombre();
		int Documento = Integer.parseInt(vista.getDocumento());

		Cliente nodoCliente = new Cliente();
		if (prioridad == "No tiene") {
			nodoCliente.setPrioridad(false);
		} else {
			nodoCliente.setPrioridad(true);
		}
		
		nodoCliente.setServicio(servicio);
		nodoCliente.setId(Documento);
		nodoCliente.setNombre(nombre);
		
		em.getTransaction().begin();
	
		nodoCliente = em.merge(nodoCliente);
		em.getTransaction().commit();
		em.close();
		vista.escribeCambio("su Turno es x");
	}

}
