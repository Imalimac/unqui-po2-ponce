package ar.edu.unq.po2.tp9.observer.publicaciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Sujeto
public class Notificaciones {
	private ArrayList<Investigador> suscriptores = new ArrayList<>();
	private ArrayList<Articulo> articulos = new ArrayList<>();

    public void agregarSuscriptor(Investigador subscriber) {
        this.suscriptores.add(subscriber);
    }

    public void agregarArticulo(Articulo articulo) {
    	this.articulos.add(articulo);
    }
    
    public void notificarSuscriptor() {
        for (Investigador suscriptor : suscriptores) {
            if(this.hayNovedades(suscriptor)) {
            	for (Articulo articulo : articulos) {
            		if(!suscriptor.getArticulos().contains(articulo)) {
            			suscriptor.actualizar("Hay novedades de " + this.novedades(suscriptor, articulo));
            		}
            	}
            }
        }
    }
    
    public boolean hayNovedades(Investigador suscriptor) {
    	boolean hayNovedad = false;
    	for (Articulo articulo : articulos) {
            if(!Collections.disjoint(articulo.getPalabrasClave(), suscriptor.getSuscripciones())&&!suscriptor.getArticulos().contains(articulo)) {
            	hayNovedad=true;
            };
        }
    	return hayNovedad;
    }
    
    public String novedades(Investigador suscriptor, Articulo articulo){
        List<String> listaA = suscriptor.getSuscripciones();
        List<String> listaB = articulo.getPalabrasClave();

        listaA.retainAll(listaB);
        return listaA.toString();
    }
}
    	
    
	

