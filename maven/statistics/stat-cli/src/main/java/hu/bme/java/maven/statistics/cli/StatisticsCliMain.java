package hu.bme.java.maven.statistics.cli;

import hu.bme.java.maven.statistics.util.StatisticsUtil;

public class StatisticsCliMain {

	public static void main(String... args) {
		if (args.length < 1) {
			throw new IllegalArgumentException(
					"usage: java -jar stat-cli-x.x.x.jar [operation] [data1 data2 data3 ...]");
		}

		double[] data = new double[args.length - 1];
		for (int i = 1; i < args.length; i++) {
			data[i - 1] = Double.valueOf(args[i]);
		}
		System.out.println(compute(args[0], data));
	}

	public static double compute(String operationName, double[] data) {
		switch (operationName) {
		case "average":
			return StatisticsUtil.average(data);
		case "median":
			return StatisticsUtil.median(data);
		case "sum":
			return StatisticsUtil.sum(data);
		default:
			throw new IllegalArgumentException("unknown operation: " + operationName);
		}
	}
}
