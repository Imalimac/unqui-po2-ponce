package ar.edu.unq.po2.tp9.observer.publicaciones;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NotificacionesTestUnit {
	private Investigador maria;
	private Investigador luis;
	private Articulo articuloUno;
	private Articulo articuloDos;
	private Notificaciones notificador;

	@BeforeEach
	public void setUp() {
	
	notificador = new Notificaciones();	
	maria = new Investigador("Maria");
	luis = new Investigador("Luis");
	articuloUno = new Articulo("Patrones", "Gamma", "Universidad De Oviedo", "Divulgacion", "Argentina");
	articuloDos = new Articulo("Patrones", "Helm", "Harvard", "Divulgacion", "Estados Unidos");
	
	maria.suscribirse(notificador,"Patrones");
	maria.agregarArticulo(articuloDos);
	
	luis.suscribirse(notificador,"Gamma");
	luis.agregarArticulo(articuloUno);
	luis.agregarArticulo(articuloUno);
	
	notificador.agregarArticulo(articuloUno);
	notificador.agregarArticulo(articuloDos);

	}
	
	@Test
	public void Notificaciones() {
		assertTrue(maria.getNotificaciones().isEmpty());
		assertTrue(luis.getNotificaciones().isEmpty());
		
		notificador.notificarSuscriptor();
		assertEquals(maria.getNotificaciones().get(0), "Hay novedades de [Patrones]");
		assertTrue(luis.getNotificaciones().isEmpty());
		
	
	
	}
}
