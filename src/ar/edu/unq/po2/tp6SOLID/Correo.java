package ar.edu.unq.po2.tp6SOLID;

public class Correo {
	public String asunto;
	public String destinatario;
	public String cuerpo;
	
	public Correo(String asunto, String destinatario, String cuerpo) {
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	public String getDestinatario() {
		return destinatario;
	}
	
}

