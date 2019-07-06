package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Modelo.Lista;
import Modelo.Prioridad;
import Modelo.Servicio;
import Vista.viewPrioridad;

public class ControlPrioridad implements ActionListener {
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Turnero");

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public viewPrioridad vista;
	public Lista modelo;

	public ControlPrioridad(viewPrioridad interfaz) {
		super();
		this.vista = interfaz;

	}

	public ControlPrioridad() {

	}

	public List<Prioridad> listarPrioridad() {
		EntityManager em = getEntityManager();

		Query query = em.createQuery("SELECT p FROM Prioridad p");
		List<Prioridad> resp = (List<Prioridad>) query.getResultList();

		em.close();
		return resp;
	}

	public Prioridad consultarPrioridad(String prioridad) {
		Prioridad priori;
		try {
			
			EntityManager em = getEntityManager();

			Query query = em.createQuery("SELECT p FROM Prioridad p WHERE p.prioridad = '" + prioridad + "'");
			List<Prioridad> resp ;
			
				resp=	(List<Prioridad>) query.getResultList();

			priori = resp.get(0);

			em.close();
			return (priori);
			

		} catch (NullPointerException e ) {
			priori=new Prioridad("no");
			return null;
		}catch (ArrayIndexOutOfBoundsException a) {
			priori=new Prioridad("no");
			return priori;
		}

	}

	public void actionPerformed(ActionEvent e) {
		EntityManager em = getEntityManager();

		// TODO Auto-generated method stub
		String priori = vista.getPrioridad();
		Prioridad nodoPrioridad = new Prioridad(priori);

		if (vista.getPrioridad().length() == 0) {
			vista.escribeCambio("Por favor ingrese una Prioridad");

		} else if (consultarPrioridad(priori).getPrioridad().equals(priori)) {
			String prioridad;
			prioridad = consultarPrioridad(priori).getPrioridad();
			System.out.println(prioridad + "El id es" + consultarPrioridad(priori).getId() + "La Prioridad es duplicado");
			vista.escribeCambio("La Prioridad esta duplicado");
		} else {
			em.getTransaction().begin();
			nodoPrioridad = em.merge(nodoPrioridad);
			em.getTransaction().commit();
			em.close();
			vista.escribeCambio("Se ingreso correctamente la Prioridad");
			// nodoPrioridad = modelo.insertarServicio(servicio);
			modelo.mostrarElementos();
		}

	}

}
