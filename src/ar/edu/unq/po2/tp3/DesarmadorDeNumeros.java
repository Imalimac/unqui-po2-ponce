package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class DesarmadorDeNumeros {
	private ArrayList<Integer> listaDeNumeros;
	
	public DesarmadorDeNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}
	
	// This constructor is declared in case we want to create the list at once.
	public DesarmadorDeNumeros(ArrayList<Integer> listaDeNumeros) {
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

	public int amountOfDigitsFor(int number) {
		int counterOfDigits = 0;
		int numberToDivide = number;
		
		while (numberToDivide != 0) {
			numberToDivide = (numberToDivide/10);
			counterOfDigits +=1;
		}
		
		return counterOfDigits;
	}
	
	public int amountOfEvenDigitsFor(int number) {
		int counterOfEvenDigits = 0;
		int repetitions = this.amountOfDigitsFor(number);
		int numberToDivide = number;
		
		while (repetitions != 0) {
			if (this.isEven(numberToDivide)) {
				counterOfEvenDigits +=1;
			}
			numberToDivide = (numberToDivide/10);
			repetitions-=1;
		}

		return counterOfEvenDigits;	
	}
	
	public int numberWithMostEvenDigits() {
		int number = this.listaDeNumeros.get(0);
		

		for (int entero : listaDeNumeros) {
			if (this.amountOfEvenDigitsFor(entero) > this.amountOfEvenDigitsFor(number)) {
				number = entero;
			}
		}

		return number;
	}
	
	
	public void addNumber(int number) {
		this.listaDeNumeros.add(number);
	}

	public boolean isEven(int numero) {
		return (numero % 2 == 0);
	}


}
