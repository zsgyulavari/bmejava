package hu.bme.java.maven.weather.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/weather")
public class WeatherController {

	@Autowired
	WeatherService service;
	
	@RequestMapping(path = "/{city}", method = RequestMethod.GET)
	public Weather getWeather(@PathVariable("city") String city) {
		return service.getWeather(city);
	}
}
