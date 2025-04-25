package ar.edu.unq.po2.tp2;
import java.util.ArrayList;	


public class Empresa {
	
	private String nombre;
	private int cuit;
	private ArrayList <Empleado> empleados;
	private ArrayList <Recibo> recibosDeHaberes;
		
	//Constructor abstracto.
	public Empresa() {
		this.empleados =  new ArrayList<Empleado>();
		this.recibosDeHaberes =  new ArrayList<Recibo>();
	}
	
	//Constructor para pre-cargar los datos básicos.
	public Empresa(String nombre, int cuit, ArrayList<Empleado> empleados, ArrayList<Recibo> recibosDeHaberes) {
		super();
		this.nombre = nombre;
		this.cuit = cuit;
		this.empleados = empleados;
		this.recibosDeHaberes = recibosDeHaberes;
	}
	
	//setter y getter del nombre de la empresa.
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	//setter y getter del cuit de la empresa.
	public int getCuit() {
		return cuit;
	}

	public void setCuit(int cuit) {
		this.cuit = cuit;
	}

	//setter y getter de la lista de empleados de la empresa.
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	//setter y getter de la lista de recibos de la empresa.
	public ArrayList<Recibo> getRecibosDeHaberes() {
		return recibosDeHaberes;
	}

	public void setRecibosDeHaberes(ArrayList<Recibo> recibosDeHaberes) {
		this.recibosDeHaberes = recibosDeHaberes;
	}

	//Mensajes para emplear o despedir empleados.
	public void contratar(Empleado empleado) {
		this.empleados.add(empleado);
	}
	
	public void despedir(Empleado empleado) {
		this.empleados.remove(empleado);
	}
	
	public void liquidarSueldos() {
		for (Empleado empleado : this.empleados) {
			this.recibosDeHaberes.add(new Recibo(empleado));
		}
	}
	
    public float montoTotalNeto(){
    	float totalNeto = 0;
    	
        for (Empleado empleado : this.empleados) {
			totalNeto += empleado.sueldoNeto();
		}
        
    	return totalNeto;
    }

    public float montoTotalBruto(){
    	float totalBruto = 0;
    	
        for (Empleado empleado : this.empleados) {
			totalBruto += empleado.sueldoBruto();
		}
        
    	return totalBruto;
    }

    public float montoTotalRetenciones(){
        float totalRetenciones = 0;
    	
        for (Empleado empleado : this.empleados) {
			totalRetenciones += empleado.retenciones();
		}
        
    	return totalRetenciones;
    }

}