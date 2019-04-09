package hu.bme.java.maven.statistics.util;

import java.util.Arrays;

public final class StatisticsUtil {

	private StatisticsUtil() {
		// utility class
	}

	public static double sum(double... data) {
		if (isNullOrEmpty(data)) {
			return Double.NaN;
		}
		double result = 0d;
		for (int i = 0; i < data.length; i++) {
			result += data[i];
		}
		return result;
	}

	public static double average(double... data) {
		if (isNullOrEmpty(data)) {
			return Double.NaN;
		}
		return sum(data) / data.length;
	}

	public static double median(double... data) {
		if (isNullOrEmpty(data)) {
			return Double.NaN;
		}
		Arrays.sort(data);
		int middle = data.length / 2;
		return average(data[middle], data[data.length - 1 - middle]);
	}

	public static boolean isNullOrEmpty(double... data) {
		return data == null || data.length == 0;
	}

}
