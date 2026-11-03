package arrays.inheritanceApp;

public class WeatherSensor extends FarmSensor {

	private double humidity;

	public WeatherSensor(int sensorId, String location, double reading, double humidity) {
		super(sensorId, location, reading);
		this.humidity = humidity;
	}

	public void setHumidity(double humidity) {
		this.humidity = humidity;
	}

	public double gethumidity() {
		return humidity;
	}

	public String checkHumidityCondition() {
		if(humidity< 30) {
			return "Low humidity-Low humidity-Monitor moisture loss and crop water needs.";
		}
		else if(humidity <=70 ) {
			return "Moderate humidity-Continue monitoring weather conditions.";
		}
		else {
			return "High humidity- Monitor crops for humidity-related problems.";
		}
	}

	public void displayDetails() {
		System.out.println("-------Weather Sensor Data--------");
		super.displayDetails();
		System.out.println("Humidity: " + humidity);
		System.out.println("Humidity conditon and advice: "+checkHumidityCondition());
	}
}
