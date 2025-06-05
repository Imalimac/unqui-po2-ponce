package ar.edu.unq.po2.tp7.COMPOSITE.ShapeShifter;

import java.util.ArrayList;

public class ShapeShifter implements IShapeShifter {
	private ArrayList<ArrayList<ShapeShifter>>compositionDepth = new ArrayList<ArrayList<ShapeShifter>>();
	
	public ShapeShifter() {
		super();
	}

	/*Este método recibe un IShapeShifter y retorna un nuevo IShapeShifter que es el resultado de componer al receptor con 	el que es enviado como parámetro. La composición se realiza al mismo nivel de profundidad.*/
	public ShapeShifter compose(ShapeShifter composedShapeshifter) {
		ShapeShifter newShapeshifter = new ShapeShifter();
		
		return newShapeshifter; 
		
	}
	
	/* Retorna un numero que representa la profundidad máxima alcanzada en composiciones que contiene.*/
	public int deepest() {
		return getCompositionDepth().size();		
	}
	
	/*Achata un IShapeShifter. Si el IShapeShifter posee una prfundidad maxima >= 1, entonces retorna un IShapeShifter de 	profundidad maxima 1 con todos los IShapeShifter de profundidad 0 contenidos. En cualquier otro caso, retorna el mismo 	IShapeShifter.*/	
	public ShapeShifter flat() {
		ShapeShifter flattenShapeshifter = new ShapeShifter();
		
		for(ArrayList<ShapeShifter> levelOfDepth : compositionDepth) {
			this.extractShapeshiftersFromList(levelOfDepth, flattenShapeshifter.getCompositionDepth());
		}
		
		
		return flattenShapeshifter;
	
	}
	
	/*Retorna una lista de enteros con los valores incluidos en el IShapeShifter.*/
	public ArrayList<Integer> values(){
		ArrayList<Integer> values = new ArrayList<Integer>();
		
		for(ArrayList<ShapeShifter> levelOfDepth : compositionDepth) {
			this.extractValuesFromList(levelOfDepth, values);
		}
		return values;
	}
	
	public ArrayList<ArrayList<ShapeShifter>> getCompositionDepth() {
		return compositionDepth;
	}

	public void extractValuesFromList(ArrayList<ShapeShifter> listToExtractFrom, ArrayList<Integer> listToAdd){
		for(ShapeShifter shapeshifter : listToExtractFrom) {
			listToAdd.add(shapeshifter.deepest());
		}
	}
	
	public void extractShapeshiftersFromList(ArrayList<ShapeShifter> listToExtractFrom, ArrayList<ArrayList<ShapeShifter>> listToAdd){
		ArrayList<ShapeShifter> listOfShifters = new ArrayList<ShapeShifter>();
		
		for(ShapeShifter shapeshifter : listToExtractFrom) {
			listOfShifters.add(shapeshifter);
		}
		
		listToAdd.add(listOfShifters);
	}
}
