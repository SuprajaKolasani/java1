package arrays.inheritanceApp;

public class SoilSensor extends FarmSensor {

	private double moistureLevel;

	public SoilSensor(int sensorId, String location, double reading, double moistureLevel) {
		super(sensorId, location, reading);
		this.moistureLevel = moistureLevel;
	}

	public void setMoistureLevel(double moistureLevel) {
		this.moistureLevel = moistureLevel;
	}

	public double getMoistureLevel() {
		return moistureLevel;
	}

	public String checkSoilCondition() {
		if (moistureLevel > 70) {
			return "Wet-check for excessive moisture.";
		} else if (moistureLevel <= 70 && moistureLevel >= 30) {
			return "Optimal — moisture is within the configured range.";
		}
		else {
			return "Dry — irrigation may be needed.";
		}
	}
	
	public void displayDetails(){
		System.out.println("----------Soil sensor data--------");
		super.displayDetails();
		System.out.println("Moisture Level: "+moistureLevel+"%");
		System.out.println("Soil condition and advice: "+checkSoilCondition());
	}

}
