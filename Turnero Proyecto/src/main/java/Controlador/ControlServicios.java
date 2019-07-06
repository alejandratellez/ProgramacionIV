package Controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Modelo.Cliente;
import Modelo.Lista;
import Modelo.ListaServicio;
import Modelo.Servicio;


import Vista.viewServicios;

public class ControlServicios implements ActionListener {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Turnero");

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public viewServicios vista;
	public Lista modelo;

	public ControlServicios(viewServicios interfaz, Lista modelo) {
		super();
		this.vista = interfaz;
		this.modelo = modelo;
	}

	public ControlServicios() {

	}

	public List<Servicio> listarServicios() {
		EntityManager em = getEntityManager();

		Query query = em.createQuery("SELECT s FROM Servicio s");
		List<Servicio> resp = (List<Servicio>) query.getResultList();

		em.close();
		return resp;
	}

	public Servicio consultarServicio(String servicio) {
		Servicio serv;
		EntityManager em = getEntityManager();

		Query query = em.createQuery("SELECT s FROM Servicio s WHERE s.serv = '" + servicio + "'" );
		List<Servicio> resp = (List<Servicio>) query.getResultList();
		if (resp.size()!=0) {
			 serv = resp.get(0);
		}
		else {
			
			serv=new Servicio("no");
		}
		

		em.close();
		return serv;
	}

	public void actionPerformed(ActionEvent e) {
		EntityManager em = getEntityManager();

		// TODO Auto-generated method stub
		String servicio = vista.getServicio();
		Servicio nodoServicio = new Servicio(servicio);

		if (vista.getServicio().length() == 0) {
			vista.escribeCambio("Por favor ingrese un nombre de servicio");

		} else if (consultarServicio(servicio).getServ().equals(servicio)) {
			String servprueba;
			servprueba=consultarServicio(servicio).getServ();
			System.out.println(servprueba + "El id es" +consultarServicio(servicio).getId() + "El Servicio es duplicado");
			vista.escribeCambio("El servicio esta duplicado");
		}
			else {
			em.getTransaction().begin();
			nodoServicio = em.merge(nodoServicio);
			em.getTransaction().commit();
			em.close();
			vista.escribeCambio("Se ingreso correctamente el servicio");
			nodoServicio = modelo.insertarServicio(servicio);
			modelo.mostrarElementos();
			}
		

	}

}