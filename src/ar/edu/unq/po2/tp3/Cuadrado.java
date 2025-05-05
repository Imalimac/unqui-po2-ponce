package ar.edu.unq.po2.tp3;

public class Cuadrado extends Rectangulo {
	public Punto esquinaSuperiorIzquierda = new Punto();
	public Punto esquinaSuperiorDerecha = new Punto();
	public Punto esquinaInferiorIzquierda = new Punto();
	public Punto esquinaInferiorDerecha = new Punto();

	public int ancho;
	public int alto;

	
	// Constructores:
	public Cuadrado() {}

	public Cuadrado(int lado) {
		this.alto = lado;
		this.ancho = lado;
		this.esquinaInferiorIzquierda.setXY(0,0);
		this.esquinaInferiorDerecha.setXY(ancho,0);
		this.esquinaSuperiorIzquierda.setXY(0,alto);
		this.esquinaSuperiorDerecha.setXY(ancho,alto);
	}
}

