package ar.edu.unq.po2.tp9.observer.publicaciones;

import java.util.ArrayList;

public class Articulo {
	private String titulo;
	private String autores;
	private String filiacion;
	private String tipoDeArtículo;
	private String lugarDePublicacion;
	private ArrayList<String> palabrasClave = new ArrayList<String>();
	
	public Articulo(String titulo, String autores, String filiacion, String tipoDeArtículo, String lugarDePublicacion) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.filiacion = filiacion;
		this.tipoDeArtículo = tipoDeArtículo;
		this.lugarDePublicacion = lugarDePublicacion;
		this.palabrasClave.add(titulo);
		this.palabrasClave.add(autores);
		this.palabrasClave.add(filiacion);
		this.palabrasClave.add(tipoDeArtículo);
		this.palabrasClave.add(lugarDePublicacion);
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutores() {
		return autores;
	}

	public String getFiliacion() {
		return filiacion;
	}

	public String getTipoDeArtículo() {
		return tipoDeArtículo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	public ArrayList<String> getPalabrasClave() {
		return palabrasClave;
	}
	
	
}
