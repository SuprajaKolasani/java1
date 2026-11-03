package casestudies;

public class MovieTheater {

	String movieName;
	String language;
	double ticketPrice;
	
	MovieTheater(String movieName, String language, double ticketPrice){
		this.movieName=movieName;
		this.language=language;
		this.ticketPrice=ticketPrice;
	}
	
	MovieTheater(MovieTheater m1, double ticketPrice){
		this.movieName=m1.movieName;
		this.language=m1.language;
		this.ticketPrice=ticketPrice;
	}
	
	public static void main(String[] args) {
		MovieTheater m1= new MovieTheater("Varanasi", "Telugu", 300.00);
		MovieTheater m2=new MovieTheater(m1, 350.00);
		
		m1.displayMovieDetails();
		m2.displayMovieDetails();
	}
	
	void displayMovieDetails() {
		System.out.println("---------Movie details----------");
		System.out.println("Movie name: "+movieName);
		System.out.println("Language: "+language);
		System.out.println("Ticket Price: "+ticketPrice);
	}

}
