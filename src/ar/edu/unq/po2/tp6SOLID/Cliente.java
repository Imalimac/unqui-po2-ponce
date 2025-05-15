package ar.edu.unq.po2.tp6SOLID;

public class Cliente {
    private String nombre;
    private Integer edad;
    private double saldoCuenta;
    private double sueldoNetoMensual;
    private double sueldoNetoAnual;
    
    public Cliente(String nombre, Integer edad, double saldoCuenta, double sueldoNetoMensual, double sueldoNetoAnual) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.saldoCuenta = saldoCuenta;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoAnual;
	}

	public void solicitarCredito(Banco bancoAcreedor, Credito creditoASolicitar){
    	bancoAcreedor.registrarSolicitudDeCredito(creditoASolicitar);
    }

    public String getNombre(){
        return this.nombre;
    }

    public Integer getEdad(){
        return this.edad;
    }

    public double getSueldoNetoAnual(){
        return this.sueldoNetoAnual;
    }
    
    public double getSueldoNetoMensual(){
        return this.sueldoNetoMensual;
    }

	public double getSaldoCuenta() {
		return saldoCuenta;
	}

	public void setSaldoCuenta(double saldoCuenta) {
		this.saldoCuenta = saldoCuenta;
	}
    
    
}
