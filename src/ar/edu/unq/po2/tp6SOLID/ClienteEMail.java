package ar.edu.unq.po2.tp6SOLID;

import java.util.ArrayList;

public class ClienteEMail {
	
	 ServidorPop servidor;
	 String nombreUsuario;
	 String passusuario;
	 ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;
	
	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass){
		this.servidor=servidor;
		this.nombreUsuario=nombreUsuario;
		this.passusuario=pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}
	
	
	// Se crea para poder conectar las cuentas de mail.
	public ServidorPop getServidor() {
		return servidor;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public String getPassusuario() {
		return passusuario;
	}

	public ArrayList<Correo> getInbox() {
		return inbox;
	}

	
	public void setInbox(ArrayList<Correo> inbox) {
		this.inbox = inbox;
	}

	public ArrayList<Correo> getBorrados() {
		return borrados;
	}

	public void conectar(){
		this.servidor.conectar(this.nombreUsuario,this.passusuario);
	}
	
	public void borrarCorreo(Correo correo){
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}
	
	public int contarBorrados(){
		return this.borrados.size();
	}
	
	public int contarInbox(){
		return this.inbox.size();
	}
	
	public void eliminarBorrado(Correo correo){
		this.borrados.remove(correo);
	}
	
	public void recibirNuevos(){
		inbox = this.servidor.recibirNuevos(this.nombreUsuario, this.passusuario);
	}
	
	public void enviarCorreo(String asunto, String destinatario, String cuerpo){
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

}
