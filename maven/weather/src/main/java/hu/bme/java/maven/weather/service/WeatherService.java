package hu.bme.java.maven.weather.service;

import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class WeatherService {
	public Weather getWeather(String city) {
		try (InputStream inputStream = new ClassPathResource(city + ".json").getInputStream()) {
			return new ObjectMapper().readValue(inputStream, Weather.class);
		} catch (Exception ex) {
			// not found
			throw new IllegalArgumentException("city not found", ex);
		}
	}
}
