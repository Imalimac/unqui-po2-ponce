package ar.edu.unq.po2.tp6SOLID;

import java.util.ArrayList;


public class ServidorPop implements IServidor {
	
	public ArrayList<ClienteEMail> listaClienteDeMail = new ArrayList<ClienteEMail>();
	private ClienteEMail clienteConectado;
	
	
	public ServidorPop() {
		super();
	}
	
	public ArrayList<ClienteEMail> getListaClienteDeMail() {
		return listaClienteDeMail;
	}

	public void agregarClienteDeMail(ClienteEMail clienteAAgregar) {
		this.listaClienteDeMail.add(clienteAAgregar);
	}



	public ArrayList <Correo> recibirNuevos(String user, String pass) {
		ArrayList<Correo> retorno = new ArrayList<Correo>();
		
		//Verificar autenticidad de usuario.
		this.conectar(user, pass);
		//obtener emails Nuevos del usuario.
		retorno = clienteConectado.getInbox();
		
		//asignar a retorno la lista de los nuevos e-mails.
		return retorno;
	}

	public void conectar(String nombreUsuario, String passusuario) {
	   //Verifica que el usuario sea valido y establece la conexion.
		for (ClienteEMail clienteAConectar: this.listaClienteDeMail)
			if (clienteAConectar.getNombreUsuario() == nombreUsuario && clienteAConectar.getPassusuario() == passusuario) {
				clienteConectado = clienteAConectar;
			}
			
	}

	public void enviar(Correo correo) {
      //realiza lo necesario para enviar el correo.	
		for (ClienteEMail destinatario: this.listaClienteDeMail)
			if (destinatario.getNombreUsuario() == correo.getDestinatario()) {
				destinatario.getInbox().add(correo);
			}
		
	}

	@Override
	public float tazaDeTransferencia() {
		//no corresponde
		return 0;
	}

	@Override
	public void resetear() {
         //no corresponde		
	}

	@Override
	public void realizarBackUp() {
		//no corresponde
		
	}



}
