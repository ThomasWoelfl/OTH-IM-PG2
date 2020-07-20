package uebung_12_3;

public class Main {

	public static void main(String[] args) {
		int exponent = 19;

		int i = 3;

		//Creating 8 new Thread. Every single one is dead, because we did not start it.
		PrimeTest p1 = new PrimeTest(0);
		PrimeTest p2 = new PrimeTest(0);
		PrimeTest p3 = new PrimeTest(0);
		PrimeTest p4 = new PrimeTest(0);
		PrimeTest p5 = new PrimeTest(0);
		PrimeTest p6 = new PrimeTest(0);
		PrimeTest p7 = new PrimeTest(0);
		PrimeTest p8 = new PrimeTest(0);

		//If one of our threads has done its job, it dies. So if the thread is not alive anymore, we can create a new one with a new number to test.
		while (true) {
			if (!p1.isAlive()) {
				p1 = new PrimeTest(i);
				p1.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p2.isAlive()) {
				p2 = new PrimeTest(i);
				p2.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p3.isAlive()) {
				p3 = new PrimeTest(i);
				p3.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p4.isAlive()) {
				p4 = new PrimeTest(i);
				p4.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p5.isAlive()) {
				p5 = new PrimeTest(i);
				p5.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p6.isAlive()) {
				p6 = new PrimeTest(i);
				p6.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p7.isAlive()) {
				p7 = new PrimeTest(i);
				p7.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
			if (!p8.isAlive()) {
				p8 = new PrimeTest(i);
				p8.start();
				i++;
				if (stop(i, exponent)) {
					break;
				}
			}
		}

		//wait for all running threads before we end the programm
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
			p6.join();
			p7.join();
			p8.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//If the maximum exponent is reached, we want to break the while-loop
	private static boolean stop(int index, int exponent) {
		if (index > exponent) {
			return true;
		}
		return false;
	}
}
