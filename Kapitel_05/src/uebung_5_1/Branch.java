package uebung_5_1;

import java.util.Arrays;

public class Branch {
	private double length = 10.0;
	private Leaf[] leafs = new Leaf[5];
	private Fruit[] fruits = new Fruit[5];
	
	public void initBranch(double length) {
		for(int i = 0; i < leafs.length; i++) {
			leafs[i] = new Leaf();
		}
		
		for(int i = 0; i < fruits.length; i++) {
			fruits[i] = new Fruit();
		}
	}
	
	public void grow() {
		this.length += 1;
	}

	public double getLength() {
		return length;
	}

	public Leaf[] getLeafs() {
		return leafs;
	}

	public Fruit[] getFruits() {
		return fruits;
	}
	
	public String toString() {
		return "Dieser Ast hat " + leafs.length + " Blaetter und " + fruits.length + " Fruechte" + Arrays.toString(leafs) + Arrays.toString(fruits);
	}

}
