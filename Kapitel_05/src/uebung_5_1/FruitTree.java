package uebung_5_1;

import java.util.Arrays;

public class FruitTree {
	private double height = 10.0;
	private int age = 5;
	private int waterAmount = 30;
	private Branch[] branches = new Branch[5];
	private Root[] roots = new Root[10];

	public void initFruitTree() {
		for (int i = 0; i < branches.length; i++) {
			Branch newBranch = new Branch();
			newBranch.initBranch(60.0);
			branches[i] = newBranch;
		}

		for (int i = 0; i < roots.length; i++) {
			roots[i] = new Root();
		}
	}

	public static void main(String[] args) {
		FruitTree fruitTree = new FruitTree();
		fruitTree.initFruitTree();
		fruitTree.growBranches();
		fruitTree.ripeFruits();
		fruitTree.changeLeafColor("gelb");
		fruitTree.printTree();
	}

	public void receiveWater() {
		for (int i = 0; i < roots.length; i++) {
			waterAmount += roots[i].deliverWater();
		}
		System.out.printf("Der Baum verfuegt über %d Einheiten Wasser\n", waterAmount);
	}

	public void growBranches() {
		if (waterAmount >= 5) {
			for (int i = 0; i < branches.length; i++) {
				branches[i].grow();
			}
			waterAmount -= 5;
			System.out.printf("Alle Aeste sind um %f Meter gewachsen\n", 1.0);
		}
		else {
			System.out.println("Nicht genuegend Wasser vorhanden");
		}
	}

	public void ripeFruits() {
		if (waterAmount >= 5) {
			for (int i = 0; i < branches.length; i++) {
				for (int j = 0; j < branches[i].getFruits().length; j++) {
					branches[i].getFruits()[j].ripe();
				}
			}
			waterAmount -= 5;
			System.out.println("Alle Fruechte sind gereift");
		}
		else {
			System.out.println("Nicht genuegend Wasser vorhanden");
		}
	}
	
	public void changeLeafColor(String color) {
		if (waterAmount >= 5) {
			for (int i = 0; i < branches.length; i++) {
				for (int j = 0; j < branches[i].getLeafs().length; j++) {
					branches[i].getLeafs()[j].changeColor(color);
				}
			}
			waterAmount -= 5;
			System.out.println("Alle Blaetter haben die Farbe gewechselt");
		}
		else {
			System.out.println("Nicht genuegend Wasser vorhanden");
		}
	}
	
	public void printTree() {
		System.out.printf("Dieser Baum ist %f Meter hoch, %d Jahre alt, %d Wasserreserven und folgende Bestandteile:\n", height, age, waterAmount);
		System.out.println(Arrays.toString(branches));
		System.out.println(Arrays.toString(roots));
	}

	public double getHeight() {
		return height;
	}

	public int getAge() {
		return age;
	}

	public int getWaterAmount() {
		return waterAmount;
	}

	public Branch[] getBranches() {
		return branches;
	}

	public Root[] getRoots() {
		return roots;
	}

}
