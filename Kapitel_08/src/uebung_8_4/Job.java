package uebung_8_4;

public class Job {
	private String name;
	private double salary;

	public Job(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public String getName() {
		return this.name;
	}
}
