package hu.bme.java.streams;

import java.util.Arrays;
import java.util.List;

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

	public static List<Employee> getAll() {
		return Arrays.asList(
				new Employee("Chloe-Ann Blankenship", "executive", 10000),
				new Employee("Shahid Allman", "executive", 10000),
				new Employee("Callen Stanley", "engineering", 3000),
				new Employee("Martyn Oliver", "engineering", 3400),
				new Employee("Elana Neal", "engineering", 1200),
				new Employee("Huma Bautista", "support", 2000),
				new Employee("Vinny Lester", "support", 1380),
				new Employee("Marshall Lister", "marketing", 1800),
				new Employee("Dolly Haas", "marketing", 1830),
				new Employee("Regan Lane", "finance", 1700),
				new Employee("Elle Snider", "hr", 1400));
	}
}
