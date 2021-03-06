package hu.bme.java.streams;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

public class MBLPlayerUtils {

	public static List<CSVRecord> readMLBPlayers() throws IOException {
		try (InputStream inputStream = SimpleStreamsMain.class.getClassLoader().getResourceAsStream("mlb_players.csv");
				InputStreamReader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				CSVParser csv = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(reader)) {

			return csv.getRecords();
		}
	}

}
