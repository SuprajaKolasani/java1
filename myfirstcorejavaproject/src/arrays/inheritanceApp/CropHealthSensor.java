package arrays.inheritanceApp;

public class CropHealthSensor extends FarmSensor{
	
	private double diseaseRisk;
	public CropHealthSensor(int sensorId, String location, double reading, double diseaseRisk) {
		super(sensorId, location, reading);
		this.diseaseRisk=diseaseRisk;
	}
	public double getDiseaseRisk() {
		return diseaseRisk;
	}
	public void setDiseaseRisk(double diseaseRisk) {
		this.diseaseRisk = diseaseRisk;
	}
	
	public String checkCropHealth() {
		if(diseaseRisk < 30) {
			return "Low Risk- Continue routine crop monitoring.";
		}
		else if(diseaseRisk <=60) {
			return "Moderate Risk-Inspect crops regularly for possible symptoms.";
		}
		else {
			return "High Risk-Inspect affected crops and consult an agricultural expert";
		}
	}
	
	public void displayDetails() {
		System.out.println("-------Crop Health Sensor Data-------");
		super.displayDetails();
		System.out.println("Disease risk: "+diseaseRisk+"%");
		System.out.println("Crop Health check and advice: "+checkCropHealth());
	}
}
