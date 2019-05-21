package hu.bme.java.streams;

import static hu.bme.java.streams.EmployeeUtils.earnsLessThan;
import static hu.bme.java.streams.EmployeeUtils.getAllEmployees;
import static hu.bme.java.streams.EmployeeUtils.isShorterThan;
import static hu.bme.java.streams.MBLPlayerUtils.readMLBPlayers;

import java.io.IOException;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Stream;

public class SimpleStreamsMain {

	public static void main(String... args) throws IOException {
		example1();
//		example2();
//		example3();
//		example4();
//		example5();
//		example6();
	}

	/**
	 * This example prints out all the fruits within the stream with the forEach
	 * terminal operation.
	 */
	private static void example1() {
		Stream<String> fruits = Stream.of("apple", "banana", "cherry", "date", "elderberry");

		// passing a method reference here
		fruits.forEach(System.out::println);
	}

	/**
	 * This example finds the maximum salary across the engineers
	 */
	private static void example2() {
		OptionalInt max = getAllEmployees()
				.stream()
				.filter(e -> e.getBranch().equals("engineering"))
				.mapToInt(e -> e.getSalary())
				.peek(System.out::println)
				.max();

		if (max.isPresent()) {
			System.out.println("maximum: " + max.getAsInt());
		} else {
			System.out.println("no maximum value found");
		}
	}

	/**
	 * This example finds employees who are earning less than a parameter and having
	 * a short name.
	 */
	private static void example3() {
		getAllEmployees()
				.stream()
				.filter(earnsLessThan(12000)) // <- using clousures to make filter predicate reusable
				.map(Employee::getName)
				.filter(isShorterThan(11))
				.forEach(System.out::println);
	}

	/**
	 * The same as example 4 but in a parallel fashion
	 */
	private static void example4() {
		getAllEmployees()
				.parallelStream()
				.filter(earnsLessThan(12000))
				.map(Employee::getName)
				.filter(isShorterThan(11))
				.forEach(System.out::println);
	}

	private static void example5() {
		Random random = new Random();
		Stream.generate(random::nextInt) // <- endless stream with generator function
				.limit(10) // <- take only 10 elements
				.forEach(System.out::println);
	}

	private static void example6() throws IOException {
		// Exercise:
		// try to find the average weight of baseball players of a specific role across the league

		//readMLBPlayers().stream()...
	}

}
