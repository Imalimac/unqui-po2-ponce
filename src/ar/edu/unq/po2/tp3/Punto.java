package ar.edu.unq.po2.tp3;

public class Punto {
	private int x;
	private int y;
	
	public Punto(int x, int y) {
		super();
		this.setXY(x,y);
	}
	
	public Punto() {}
	
	public void setXY(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void moverArriba() {
		this.setY(this.getY()+1);
	}
	
	public void moverAbajo() {
		this.setY(this.getY()-1);
	}
	
	public void moverIzquierda() {
		this.setX(this.getX()-1);
	}
	
	public void moverDerecha() {
		this.setX(this.getX()+1);
	}
	
	public Punto sumarPuntos(Punto puntoASumar) {
		return new Punto(this.getX()+puntoASumar.getX(),this.getY()+puntoASumar.getY());
	}
	
	public String nombreDelPunto() {
		return "punto"+ this.getX() +this.getY();
	}
	
}
