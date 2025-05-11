package ar.edu.unq.po2.tp7.STATE;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaquinaDeVideojuegosTestCase {

	private MaquinaDeVideoJuegos maquina = new MaquinaDeVideoJuegos();

	
	@Test
	public void estadoInicial() {
		assertEquals(maquina.getEstado().estado(), "apagado");
	}

	@Test
	public void ingresarFichas() {
		maquina.encender();
		maquina.botonInicio();
		maquina.ingresarFichas();
		assertEquals(maquina.getEstado().estado(), "encendido1");
		assertEquals(maquina.getCantidadDeFichas(), 1);
		maquina.ingresarFichas();
		assertEquals(maquina.getEstado().estado(), "encendido2");
		assertEquals(maquina.getCantidadDeFichas(), 2);

	}
	
	@Test
	public void jugar() {
		maquina.encender();
		maquina.botonInicio();
		maquina.ingresarFichas();
		assertEquals(maquina.getEstado().estado(), "encendido1");
		assertEquals(maquina.getCantidadDeFichas(), 1);
		maquina.botonInicio();
		assertEquals(maquina.getEstado().estado(), "jugando");
		assertEquals(maquina.getCantidadDeFichas(), 0);
		maquina.terminarJuego();
		assertEquals(maquina.getEstado().estado(), "encendido");
	}
	
	@Test
	public void encenderYApagar() {
		maquina.encender();
		assertEquals(maquina.getEstado().estado(), "encendido");
		maquina.apagar();
		assertEquals(maquina.getEstado().estado(), "apagado");
	}
}
