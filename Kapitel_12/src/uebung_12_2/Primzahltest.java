package uebung_12_2;

import java.math.BigInteger;

public class Primzahltest extends Thread {

	BigInteger rest = new BigInteger("4");
	BigInteger number = new BigInteger("2");

	BigInteger sub_1 = new BigInteger("2");
	BigInteger sub_2 = new BigInteger("1");
	BigInteger zero = new BigInteger("0");

	int exponent = 0;
	boolean isOdd = true;

	public Primzahltest(int exponent) {
		this.exponent = exponent;
		if ((this.exponent % 2) == 0) {
			isOdd = false;
		} else {
			number = number.pow(this.exponent);
			number = number.subtract(sub_2);
		}
	}

	public void run() {
		if (isOdd) {
			for (int i = 0; i < exponent; i++) {
				rest = rest.mod(number);
				if (rest.compareTo(zero) == 0) {
					break;
				}
				rest = rest.multiply(rest);
				rest = rest.subtract(sub_1);
			}

			if (rest.compareTo(zero) == 0) {
				System.out.println("2 hoch " + exponent + "-1 ist Prim");
			} else {
				System.out.println("2 hoch " + exponent + "-1 ist nicht Prim");
			}
		} else {
			System.out.println("2 hoch " + exponent + "-1 ist nicht Prim");
		}
	}

}
