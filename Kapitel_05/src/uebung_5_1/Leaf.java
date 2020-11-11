package uebung_5_1;

public class Leaf {
	private String color = "gruen";
	
	
	public void changeColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public String toString() {
		return "Dieses Blatt ist " + color;
	}

}
