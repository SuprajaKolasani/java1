package arrays.inheritanceApp;

public class FarmSensor {

	private int sensorId;
	private String location;
	private double reading;
	
	public FarmSensor(int sensorId, String location, double reading) {
		this.sensorId = sensorId;
		this.location = location;
		this.reading = reading;
	}

	public void setSensorId(int sensorId) {
		this.sensorId=sensorId;
	}
	
	public int getSensorId() {
		return sensorId;
	}
	
	public void setLocation(String location) {
		this.location=location;
	}
	
	public String getLocation() {
		return location;
	}
	
	public void setReading(double reading) {
		this.reading=reading;
	}
	
	public double getReading() {
		return reading;
	}
	
	public void displayDetails() {
		System.out.println("SensorId: "+sensorId);
		System.out.println("Location: "+location);
		System.out.println("SensorReading: "+reading);
		System.out.println("Status: "+getStatus());
	}
	
	public String getStatus() {
		return "Active";
	}
}
