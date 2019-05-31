package turnero.example.tests;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.ibm.icu.util.GregorianCalendar;

import turnero.example.Direccion;
import turnero.example.Persona;

public class TestPersona {

	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		/* Crear el gestor de persistencia */
		emf = Persistence.createEntityManagerFactory("persistence");
		manager = emf.createEntityManager();

		Persona e = new Persona(10883361, "Alejandra Tellez ");
		Persona e2 = new Persona(24548295, "Leandro Tellez");

		manager.getTransaction().begin();
		manager.persist(e);
		manager.getTransaction().commit();
		
		
		manager.getTransaction().begin();
		manager.persist(e2);
		manager.getTransaction().commit();

		imprimirTodo();
	}

	private static void imprimirTodo() {
		List<Persona> Personas = (List<Persona>) manager.createQuery("FROM Persona").getResultList();
		System.out.print("HAY " + Personas.size() + "  Personas en el sistema \n");
		for (Persona emp : Personas) {
			System.out.print(emp.toString() + "\n");
		}
	}
}
