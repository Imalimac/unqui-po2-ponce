package ar.edu.unq.po2.tp2;
import java.time.LocalDate;

public class Recibo {
	private Empleado empleado;
	private String nombreEmpleado;
	private String direccion; 
	private LocalDate fechaDeEmision; 
	private float sueldoBruto;
	private float sueldoNeto;
	private String desgloceDeConceptos;
	
	//Constructor de recibos.
	public Recibo(Empleado empleado) {
		super();
		this.empleado = empleado;
		this.nombreEmpleado = empleado.getNombre();
	 	this.direccion = empleado.getDireccion();
	 	this.fechaDeEmision =  LocalDate.now();
	 	this.sueldoBruto = empleado.sueldoBruto();
	 	this.sueldoNeto = empleado.sueldoNeto();
	 	this.desgloceDeConceptos = empleado.desgloceDeConceptos(); 
		
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public String getNombreEmpleado() {
		return nombreEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public LocalDate getFechaDeEmision() {
		return fechaDeEmision;
	}

	public float getSueldoBruto() {
		return sueldoBruto;
	}

	public float getSueldoNeto() {
		return sueldoNeto;
	}

	public String getDesgloceDeConceptos() {
		return desgloceDeConceptos;
	}
	 	
}
