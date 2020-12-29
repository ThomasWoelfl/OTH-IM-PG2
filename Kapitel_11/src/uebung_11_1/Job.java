package uebung_11_1;

public class Job {
	private String name;
	private float salary;

	public Job(String name, float salary) {
		this.name = name;
		this.salary = salary;
	}

	public float getSalary() {
		return this.salary;
	}

	public String getName() {
		return this.name;
	}
}
