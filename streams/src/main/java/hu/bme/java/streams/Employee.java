package hu.bme.java.streams;

public class Employee {
	private String name;
	private String branch;
	private int salary;

	public Employee(String name, String branch, int salary) {
		this.name = name;
		this.branch = branch;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public String getBranch() {
		return branch;
	}

	public int getSalary() {
		return salary;
	}
}
