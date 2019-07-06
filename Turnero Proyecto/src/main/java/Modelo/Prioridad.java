package Modelo;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Prioridad")
public class Prioridad 	implements Serializable {

		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@Column(name = "nombre_Prioridad")
		private String prioridad;

		@OneToMany
		private List<Cliente> dato;

		public Prioridad() {
		}

		public Prioridad(String dato) {
			this.prioridad = dato;
		}

		public List<Cliente> getCliente() {
			return dato;
		}

		public void setCliente(List<Cliente> dato) {
			this.dato = dato;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getPrioridad() {
			return this.prioridad;
		}

		public void setPrioridad(String prioridad) {
			this.prioridad = prioridad;
		}

}
