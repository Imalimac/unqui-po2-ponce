package ar.edu.unq.po2.tp3;

public class Rectangulo {
	public Punto esquinaSuperiorIzquierda = new Punto();
	public Punto esquinaSuperiorDerecha = new Punto();
	public Punto esquinaInferiorIzquierda = new Punto();
	public Punto esquinaInferiorDerecha = new Punto();
	
	public int ancho;
	public int alto;
	
	
	// Constructores:
	public Rectangulo() {}
	
	public Rectangulo(int ancho,int alto) {
		super();
		this.ancho = ancho;
		this.alto = alto;
		this.esquinaInferiorIzquierda.setXY(0, 0);
		this.esquinaInferiorDerecha.setXY(ancho, 0);
		this.esquinaSuperiorIzquierda.setXY(0, alto);
		this.esquinaSuperiorDerecha.setXY(ancho, alto);
	}

	//setters y getters de esquinas:
	public Punto getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	public Punto getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	public Punto getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	public Punto getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}
	
	//setters y getters de ancho y alto:

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}
	
	// Obtener Perímetro
	
	public int perimetro() {
		return (this.getAncho() * 2 + this.getAlto() * 2);
	}
	
	// Obtener Area:
	
	public int area() {
		return (this.getAncho() * this.getAlto());
	} 
	
	
	// Determinar si es horizontal o vertical:
	public boolean esHorizontal() {
		return this.getAncho()>this.getAlto(); 
	}
	
	public boolean esVertical() {
		return this.getAncho()<this.getAlto(); 
	}	
	
}
