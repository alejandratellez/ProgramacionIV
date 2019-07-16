package Controlador;

import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Modelo.Cliente;
import Modelo.Lista;
import Modelo.Prioridad;
import Modelo.Servicio;
import Vista.viewAdministrador;
import Vista.viewCliente;
import Vista.viewPrioridad;

public class Controller {

	public Servicio servicio = new Servicio();
	public Prioridad prioridad = new Prioridad();
	public viewPrioridad vistaPrioridad;
	public viewAdministrador vistaAdministrador;
	public viewCliente vistaCliente;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("Turnero");

	public Controller() {

	}

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public List<Servicio> listarServicios() {
		EntityManager em = getEntityManager();

		Query query = em.createQuery("SELECT s FROM Servicio s");
		List<Servicio> resp = (List<Servicio>) query.getResultList();

		em.close();
		return resp;
	}

	public Servicio consultarServicioNombre(String servicio) {
		Servicio serv;
		EntityManager em = getEntityManager();

		Query query = em.createQuery("SELECT s FROM Servicio s WHERE s.serv = '" + servicio + "'");
		List<Servicio> resp = (List<Servicio>) query.getResultList();
		if (resp.size() != 0) {
			serv = resp.get(0);
		} else {

			serv = new Servicio("no");
		}

		em.close();
		return serv;
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
			List<Prioridad> resp;

			resp = (List<Prioridad>) query.getResultList();

			priori = resp.get(0);

			em.close();
			return (priori);

		} catch (NullPointerException e) {
			priori = new Prioridad("no");
			return null;
		} catch (ArrayIndexOutOfBoundsException a) {
			priori = new Prioridad("no");
			return priori;
		}

	}

	public Prioridad crearPrioridad(Prioridad prioridad) {
		EntityManager em = getEntityManager();

		em.getTransaction().begin();
		prioridad = em.merge(prioridad);

		em.getTransaction().commit();
		em.close();
		return prioridad;

	}
	
	public Servicio crearServicio(Servicio servicio) {
		EntityManager em = getEntityManager();

		em.getTransaction().begin();
		servicio = em.merge(servicio);

		em.getTransaction().commit();
		em.close();
		return servicio;

	}
	
	/*

	public String guardarPrioridad(String prioridad) {

		EntityManager em = getEntityManager();

		// TODO Auto-generated method stub
		String priori;
		String mensaje;
		this.prioridad.setPrioridad(prioridad);
		priori = this.prioridad.getPrioridad();
		System.out.println(priori);

		if (priori.length() == 0) {
			mensaje = "Por favor ingrese una Prioridad";
			return mensaje;

		} else if (consultarPrioridad(priori).getPrioridad().equals(priori)) {

			String prioridad2 = consultarPrioridad(priori).getPrioridad();
			System.out
					.println(prioridad + "El id es" + consultarPrioridad(priori).getId() + "La Prioridad es duplicado");
			mensaje = "La Prioridad esta duplicado";
			return mensaje;
		} else {
			em.getTransaction().begin();
			this.prioridad = em.merge(this.prioridad);
			em.getTransaction().commit();
			em.close();
			mensaje = "Se ingreso correctamente la Prioridad";

			// nodoPrioridad = modelo.insertarServicio(servicio);
			Lista modelo = new Lista();
			modelo.mostrarElementos();
			return mensaje;
		}

	}
	*/

	public String guardarServicio(String servicio) {
		String mensaje;
		EntityManager em = getEntityManager();

		// TODO Auto-generated method stub

		Servicio nodoServicio = new Servicio(servicio);

		if (nodoServicio.getServ().length() == 0) {
			mensaje = "Por favor ingrese un nombre de servicio";
			return mensaje;
		} else if (consultarServicioNombre(servicio).getServ().equals(servicio)) {
			String servprueba;
			servprueba = consultarServicioNombre(servicio).getServ();
			System.out.println(
					servprueba + "El id es" + consultarServicioNombre(servicio).getId() + "El Servicio es duplicado");
			mensaje = "El servicio esta duplicado";
			return mensaje;
		} else {
			em.getTransaction().begin();
			nodoServicio = em.merge(nodoServicio);
			em.getTransaction().commit();
			em.close();
			mensaje = "Se ingreso correctamente el servicio";

			return mensaje;
		}
	}

	public Cliente guardarUsuario(Cliente usuario) {
		EntityManager em = getEntityManager();

		em.getTransaction().begin();
		usuario = em.merge(usuario);

		em.getTransaction().commit();
		em.close();
		return usuario;
	}

	public String guardarCliente(String nombre, int documento, String prioridad, String servicio) {
		System.out.println("entra");
		String mensaje;

		// TODO Auto-generated method stub
		Servicio servicios = new Servicio(servicio);
		System.out.println("entra");
		Prioridad prioridades = new Prioridad(prioridad);
		System.out.println("entra");
		// String nombres = nombre;

		EntityManager em = getEntityManager();
		Cliente nodoCliente = new Cliente();
		nodoCliente.setId(documento);
		nodoCliente.setNombre(nombre);

		servicios = consultarServicioNombre(servicio);
		System.out.println("entra");
		int dato;
		dato = servicios.getId();

		nodoCliente.getServicio().add(consultarServicio(dato));
		nodoCliente.getServicio().add(consultarServicio(dato));
		System.out.println("entra ojo");
		prioridades = consultarPrioridad(prioridad);

		int datoPrioridad;
		datoPrioridad = prioridades.getId();
		nodoCliente.getServicio().add(consultarServicio(datoPrioridad));
		nodoCliente.getServicio().add(consultarServicio(datoPrioridad));

		System.out.println("entra2");
		em.getTransaction().begin();

		nodoCliente = em.merge(nodoCliente);
		em.getTransaction().commit();
		em.close();
		mensaje = "su Turno es x";

		return mensaje;
	}

	public Servicio consultarServicio(int id) {
		EntityManager em = getEntityManager();

		Servicio resp = em.find(Servicio.class, id);

		em.close();
		return resp;
	}

	public Prioridad consultarPrioridad(int id) {
		EntityManager em = getEntityManager();

		Prioridad resp = em.find(Prioridad.class, id);

		em.close();
		return resp;
	}

	public void setVistaPrioridad(viewPrioridad prioridad) {
		this.vistaPrioridad = prioridad;
	}

	public void setVistaCliente(viewCliente cliente) {
		this.vistaCliente = cliente;
	}

	public void setVistaAdminsitrador(viewAdministrador administrador) {
		this.vistaAdministrador = administrador;
	}

}
