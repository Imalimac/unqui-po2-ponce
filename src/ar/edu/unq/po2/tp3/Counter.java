package ar.edu.unq.po2.tp3;
import java.util.ArrayList;


public class Counter {
	private ArrayList<Integer> listaDeNumeros;
	
	public Counter() {
		this.listaDeNumeros = new ArrayList<>();
	}
	
	// This constructor is declared in case we want to create the list at once.
	public Counter(ArrayList<Integer> listaDeNumeros) {
		super();
		this.listaDeNumeros = listaDeNumeros;
	}

	// This method is declared in case we want to modify the list of numbers during the execution of the program.
	public void setListaDeNumeros(ArrayList<Integer> listaDeNumeros) {
		this.listaDeNumeros = listaDeNumeros;
	}
	
	public ArrayList<Integer> getListaDeNumeros() {
		return listaDeNumeros;
	}

	public void addNumber(int number) {
		this.listaDeNumeros.add(number);
	}

	public boolean isEven(int numero) {
		return (numero % 2 == 0);
	}

	public boolean esMultiplo(int unNumero, int otroNumero) {
		return (unNumero % otroNumero == 0); 
	}

	public int getEvenOcurrences() {
		int evenCounter = 0;

		for (int entero : listaDeNumeros) {
			if (this.isEven(entero)) {
				evenCounter = evenCounter + 1;
			}
		}

		return evenCounter;
	}

	public int getUnevenOcurrences() {
		int unevenCounter = 0;

		for (int entero : listaDeNumeros) {
			if (!this.isEven(entero)) {
				unevenCounter = unevenCounter + 1;
			}
		}

		return unevenCounter;
	}

	public int contadorDeMultiplosDe(int numero) {
		int contadorDeMultiplos = 0;

		for (int entero : listaDeNumeros) {
			if (this.esMultiplo(entero, numero)) {
				contadorDeMultiplos = contadorDeMultiplos + 1;
			}
		}

		return contadorDeMultiplos;
	}
	
}
