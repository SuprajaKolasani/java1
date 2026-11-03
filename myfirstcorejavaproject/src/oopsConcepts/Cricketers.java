package oopsConcepts;

public class Cricketers {

	private int jNum;
	private String name;
	private double runs;
	
	public void setJnum(int jNum) {
		this.jNum=jNum;
	}
	public int getJnum() {
		return jNum;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	
	public void setRuns(double runs) {
		if(runs>0) {
			this.runs=runs;
		}
		else {
			System.out.println("Inavlid runs");
		}
	}
	
	public double getRuns() {
		return runs;
	}
}
