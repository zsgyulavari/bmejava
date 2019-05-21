package hu.bme.java.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeUtils {

	public static List<Employee> getAllEmployees() {
		return Arrays.asList(
				new Employee("Chloe-Ann Blankenship", "executive", 10000),
				new Employee("Shahid Allman", "executive", 10000),
				new Employee("Callen Stanley", "engineering", 3000),
				new Employee("Martyn Oliver", "engineering", 3400),
				new Employee("Elana Nealson", "engineering", 1200),
				new Employee("Huma Bautista", "support", 2000),
				new Employee("Vinny Lester", "support", 1380),
				new Employee("Marshall Lister", "marketing", 1800),
				new Employee("Dolly Haas", "marketing", 1830),
				new Employee("Regan Lane", "finance", 1700),
				new Employee("Elle Snider", "hr", 1400));
	}
	
	public static Predicate<? super Employee> earnsLessThan(int salary) {
		return e -> {
//			try {
//				Thread.sleep(5000);
//			} catch (InterruptedException e1) {
//				e1.printStackTrace();
//			}

			System.out.println(Thread.currentThread().getName() + " filter: " + e.getName());
			return e.getSalary() < salary;
		};
	}

	public static Predicate<String> isShorterThan(int length) {
		return name -> name.length() < length;
	}

}
