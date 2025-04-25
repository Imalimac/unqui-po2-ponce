package ar.edu.unq.po2.tp3;

public class Multiples {

	private int x;
	private int y;
		
	public Multiples(int x, int y) {
		super();
		this.x = x;
		this.y = y;
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
	
	public boolean isMultipleOf(int  aNumber, int anotherNumber) {
		return (aNumber % anotherNumber == 0); 
	}
	
	public boolean isMultipleOfBoth(int aNumber, int anotherNumber, int numberToCheck) {
		return (this.isMultipleOf(numberToCheck, aNumber)&&this.isMultipleOf(numberToCheck, anotherNumber)); 
	}
	
	public int highestMultipleFor() {
		int numberToCheck = 1000;
		boolean multipleFound = false;
		
		while(numberToCheck>0 && multipleFound == false) {
			if(this.isMultipleOfBoth(x, y, numberToCheck)) {
				multipleFound= true;} 
			else{numberToCheck-=1;}
		}
		
		if (numberToCheck!=0) {
		return numberToCheck;} else {return -1;}
		
	}
	
}
