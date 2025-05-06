package ar.edu.unq.po2.tp4;

import java.util.ArrayList;

public class Trabajador {
	
	public ArrayList<Ingreso> ingresosAnuales = new ArrayList <Ingreso> ();
	public String nombre;
	
	public Trabajador(ArrayList<Ingreso> ingresosAnuales, String nombre) {
		super();
		this.ingresosAnuales = ingresosAnuales;
		this.nombre = nombre;
	}
	
	public Trabajador(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	public void agregarIngreso(Ingreso ingresoAAgregar) {
		this.ingresosAnuales.add(ingresoAAgregar);
	}

	//retornar el monto total percibido por el trabajador
	public double getTotalPercibido() {
		 double totalPercibido = 0;
		 for(Ingreso ingreso:ingresosAnuales) {
			 totalPercibido = totalPercibido+ ingreso.getMontoPercibido();
		 }
		 
		 return totalPercibido;
	 }
	 
	//retornar el monto imponible al impuesto al trabajador
	
	public double getMontoImponible() {
		 double totalMontoImponible = 0;
		 for(Ingreso ingreso:ingresosAnuales) {
			 totalMontoImponible = totalMontoImponible + ingreso.getMontoImponible();
		 }
		 
		 return totalMontoImponible;
	}
	 

	//retornar el monto a pagar por el trabajador, calculado como el 2% del monto imponible
	public double getImpuestoAPagar() {
		return this.getMontoImponible()*0.2;
	}
	 
	

}
