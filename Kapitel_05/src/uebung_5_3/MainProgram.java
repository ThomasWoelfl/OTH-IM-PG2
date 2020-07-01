package uebung_5_3;

import java.util.Scanner;

public class MainProgram {

	private FieldObject[][] field;
	private Hamster peter;

	public static void main(String[] args) {
		MainProgram mainProgram = new MainProgram();
	}

	public MainProgram() {
		Scanner sc = new Scanner(System.in);

		initField();

		int choice = 0;
		do {
			printField();
			choice = sc.nextInt();
			sc.nextLine();

			switch (choice) {
			case 1:
				// turn left
				peter.left();
				break;

			case 2:
				// turn right
				peter.right();
				break;

			case 3:
				// move forward
				field = peter.goForward(field);
				break;

			case 4:
				// print eaten corns
				System.out.println(peter.getName() + " hat bereits " + peter.getCornAmount() + " Koerner gefressen");
				break;

			case 5:
				// exit
				break;

			default:
				System.out.println("Falsche Eingabe");
			}
		}
		while (choice != 5);

		sc.close();
	}

	public void initField() {
		field = new FieldObject[10][10];
		peter = new Hamster('>', "Peter", 3, 2);

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				field[i][j] = new EmptyField(' ');
			}
		}

		for (int i = 0; i < 10; i++) {
			field[0][i] = new Wall('#');
			field[9][i] = new Wall('#');
		}

		for (int i = 0; i < 9; i++) {
			field[i][0] = new Wall('#');
			field[i][9] = new Wall('#');
		}

		field[4][4] = new Wall('#');
		field[4][5] = new Wall('#');
		field[8][5] = new Wall('#');
		field[7][5] = new Wall('#');
		field[5][7] = new Corn('*');
		field[5][3] = new Corn('*');
		field[peter.getX()][peter.getY()] = peter;
	}

	public void printField() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(field[i][j].getSymbol());
			}
			System.out.println();
		}

		System.out.println("Waelen Sie eine Funktion aus:");
		System.out.println("1) Links drehen:");
		System.out.println("2) Rechts drehen:");
		System.out.println("3) Vorwaerts gehen:");
		System.out.println("4) Anzahl gefressener Koerner ausgeben:");
		System.out.println("5) Programm beenden:");
	}
}
