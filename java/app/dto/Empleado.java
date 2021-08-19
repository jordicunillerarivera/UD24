package app.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="empleado")//en caso que la tabala sea diferente
public class Empleado {

	//Atributos de entidad empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "nombre")//no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido")//no hace falta si se llama igual
	private String apellido;
	@Column(name = "puesto")//no hace falta si se llama igual
	private String puesto;
	@Column(name = "salario")//no hace falta si se llama igual
	private int salario;
	@Column(name = "direccion")//no hace falta si se llama igual
	private String direccion;
	@Column(name = "dni")//no hace falta si se llama igual
	private int dni;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	//Constructores
	
	public Empleado() {
//		this.salario = salario(this.puesto);
	}

	/**
	 * @param id
	 * @param nombre
	 * @param apellido
	 * @param puesto
	 * @param salario
	 * @param direccion
	 * @param dni
	 * @param fecha
	 */
	public Empleado(Long id, String nombre, String apellido, String puesto, int salario, String direccion, int dni, Date fecha) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.puesto = puesto;
		this.salario = salario;
		this.direccion = direccion;
		this.dni = dni;
		this.fecha = fecha;
	}
	
	// Metodos
	
	public int salario(String puesto) {
		
		if (puesto.equals("RRHH")) {
			salario = 2000;
		} else if (puesto.equals("Ventas")) {
			salario = 1800;
		} else {
			salario = 1050;
		}
		
//		switch (puesto) {
//			case "RRHH":
//				salario = 2000;
//				break;
//			case "Ventas":
//				salario = 1800;
//				break;
//			case "Administracion":
//				salario = 2100;
//				break;
//			case "Mozo":
//				salario = 1500;
//				break;
//			case "Marqueting":
//				salario = 1700;
//				break;
//	
//			default:
//				salario = 1500;
//				break;
//		}
		
		return salario;
		
	}

	
	//Getters y Setters
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	
	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	/**
	 * @return the dni
	 */
	public int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	
	//Metodo impresion de datos por consola
	@Override
	public String toString() {
		return "empleado [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", puesto=" + puesto + ", salario=" + salario + ", direccion=" + direccion
				+ ", dni=" + dni + ", fecha=" + fecha + "]";
	}
	
	
	
	
	
}
