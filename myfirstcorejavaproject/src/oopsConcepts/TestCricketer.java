package oopsConcepts;

public class TestCricketer {

	public static void main(String[] args) {
		Cricketers c1= new Cricketers();	

		c1.setJnum(18);
		c1.setName("Virat");
		c1.setRuns(9230);
		
		System.out.println(c1.getJnum());
		System.out.println(c1.getName());
		System.out.println(c1.getRuns());
	}

}
