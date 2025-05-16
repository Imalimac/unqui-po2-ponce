package ar.edu.unq.po2.tp6SOLID;

public class Cliente {
    private String nombre;
    private Integer edad;
    private double saldoCuenta;
    private double sueldoNetoMensual;
    private double sueldoNetoAnual;
    private ClienteEMail email;
    
    public Cliente(String nombre, Integer edad, double saldoCuenta, double sueldoNetoMensual, double sueldoNetoAnual, ClienteEMail email) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.saldoCuenta = saldoCuenta;
		this.sueldoNetoMensual = sueldoNetoMensual;
		this.sueldoNetoAnual = sueldoNetoAnual;
		this.email = email;
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
	
	// Gestionar Email
	
	public void conectarMail() {
		email.conectar();
	}
	
	public void borrarMail(Correo correo){
		email.borrarCorreo(correo);
	}
	
	public int contarMailBorrado(Correo correo){
		return email.contarBorrados();
	}
	
	public int contarInboxMail(Correo correo){
		return email.contarInbox();
	}
	
	public void eliminarCorreoBorrado(Correo correo){
		email.eliminarBorrado(correo);
	}
	
	public void recibirNuevos(){
		email.recibirNuevos();
	}
	
	public void enviarMail(String asunto, String destinatario, String cuerpo) {
		email.enviarCorreo(asunto, destinatario, cuerpo);
	}

	public ClienteEMail getEmail() {
		return email;
	}

	public void setEmail(ClienteEMail email) {
		this.email = email;
	}
	
	
  
}
