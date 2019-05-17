package turnero.example;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TB_EMPLEADO")

public class Empleado implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "COD_EMPLEADO")
	private Long codigo;

	@Column(name = "APELLIDOS")
	private String apellido;

	@Column(name = "NOMBRES")
	private String nombre;

	@Column(name = "FECHA_NACIMIENTO")
	private int fechaNacimiento;
	/*
	@OneToOne
	@JoinColumn(name="DIRECCION")
	
*/
	
	public Empleado(Long codigo, String apellido, String nombre, int fechaNacimiento) {

		this.codigo = codigo;
		this.apellido = apellido;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}

	
	
	
	public Empleado() {
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
/*
	public void setDireccion(Direccion direccion) {
		this.direccion=direccion;
	}
*/
	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellido=" + apellido + ", nombre=" + nombre + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}

}
