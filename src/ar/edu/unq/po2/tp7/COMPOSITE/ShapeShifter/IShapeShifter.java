package ar.edu.unq.po2.tp7.COMPOSITE.ShapeShifter;

import java.util.ArrayList;

public interface IShapeShifter {
	public ShapeShifter compose(ShapeShifter shapeshifter);
	public int deepest();
	public ShapeShifter flat();
	public ArrayList<Integer> values();
}
