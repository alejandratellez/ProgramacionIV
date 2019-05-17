package turnero.example.tests;

import java.sql.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import com.ibm.icu.util.GregorianCalendar;

import turnero.example.Direccion;
import turnero.example.Empleado;

public class TestEmpleados {

	private static EntityManager manager;
	private static EntityManagerFactory emf;

	public static void main(String[] args) {
		/* Crear el gestor de persistencia */
		emf = Persistence.createEntityManagerFactory("persistence");
		manager = emf.createEntityManager();
		/*
		 * List<Empleado> empleados= (List<Empleado> )
		 * manager.createQuery("FROM Empleado").getResultList();
		 * System.out.print("En esta base de datos hay " + empleados.size() +
		 * " Empleados");
		 */
		Empleado e = new Empleado(10L, "Tellez", "Alejandra", 23);
		Empleado e2 = new Empleado(11L, "Tellez", "Leandro", 26);
		/*Direccion d =new Direccion (10L, "Tb", "123", "Pereira","Colombia");
		 * e.setDireccion(d)*/
		
		manager.getTransaction().begin();
		manager.persist(e);
	
		manager.getTransaction().commit();
		manager.persist(e2);
	
		

		imprimirTodo();
	}

	private static void imprimirTodo() {
		List<Empleado> empleados = (List<Empleado>) manager.createQuery("FROM Empleado").getResultList();
		System.out.print("HOY " + empleados.size() + "empleados en el sistema \n");
		for (Empleado emp : empleados) {
			System.out.print(emp.toString()+"\n");
		}
	}
}
