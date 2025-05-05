package ar.edu.unq.po2.tp3;
import java.util.ArrayList;


public class Multioperador {
	
	private ArrayList<Integer> listaDeEnteros = new ArrayList<Integer> ();
	
	// Constructores
	public Multioperador(ArrayList<Integer> listaDeNumeros) {
		super();
		 listaDeEnteros = listaDeNumeros;
	}
	
	public Multioperador() {}
	
	
	// Setters y Getters  para lista de Numeros.	
	public ArrayList<Integer> getListaDeEnteros() {
		return this.listaDeEnteros;
	}	

	public void setListaDeEnteros(ArrayList<Integer> listaDeEnteros) {
		this.listaDeEnteros = listaDeEnteros;
	}
	
	//  Método para agregar número a la lista.
		public void addNumber(int numero) {
		this.listaDeEnteros.add(numero);
	}
	
	// Operaciones
	public int add() {
		int resultado = 0;
		
		for (int numero: this.listaDeEnteros){
			resultado = resultado + numero; 
		}
	
		return resultado;
	}
	
	public int substract() {
		int resultado = 0;
		
		for (int numero: this.listaDeEnteros){
			resultado = resultado - numero; 
		}
	
		return resultado;
	}
	
	public int multiply() {
		int resultado = 1;
		
		for (int numero: this.listaDeEnteros){
			resultado = resultado * numero; 
		}
	
		return resultado;
	}
	

}
