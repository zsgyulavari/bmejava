package hu.bme.java.maven.weather.service;

public class Weather {
	int tempreture;
	int windSpeed;
	String windDirection;

	public int getTempreture() {
		return tempreture;
	}

	public void setTempreture(int tempreture) {
		this.tempreture = tempreture;
	}

	public int getWindSpeed() {
		return windSpeed;
	}

	public void setWindSpeed(int windSpeed) {
		this.windSpeed = windSpeed;
	}

	public String getWindDirection() {
		return windDirection;
	}

	public void setWindDirection(String windDirection) {
		this.windDirection = windDirection;
	}
}
