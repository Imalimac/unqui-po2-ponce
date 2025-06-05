package ar.edu.unq.po2.tp9.observer.publicaciones;

import java.util.ArrayList;

//Observador Concreto
class Investigador implements ISuscriptor{
    private String nombre;
    private ArrayList<String>suscripciones = new ArrayList<String>();
    private ArrayList<Articulo>articulos = new ArrayList<Articulo>();
    private ArrayList<String>notificaciones = new ArrayList<String>();

    public Investigador(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
		return nombre;
	}
    
    public ArrayList<String> getSuscripciones() {
		return suscripciones;
	}
    

    public ArrayList<Articulo> getArticulos() {
		return articulos;
	}
    
    public void agregarArticulo(Articulo articuloAAgregar) {
    	articulos.add(articuloAAgregar);
    }
    
    public ArrayList<String> getNotificaciones() {
		return notificaciones;
	}

	@Override
    public void actualizar(String novedad) {
        this.notificaciones.add(novedad);
    }

	@Override
    public void suscribirse(Notificaciones notificador, String suscripcion) {
    	suscripciones.add(suscripcion);
    	notificador.agregarSuscriptor(this);
    }
    

}