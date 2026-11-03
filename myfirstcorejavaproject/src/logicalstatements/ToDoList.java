package logicalstatements;

import java.util.Scanner;

public class ToDoList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter your time: ");
		int time=sc.nextInt();
		
		if(time ==5 && time <=6) {
			System.out.println("Gooood mrng !!! Padukunnadhi chalu inka leguvu");
		}
		else if(time >=6 && time <=8) {
			System.out.println("Poyi tini, institute ki velli sadhuko!");
		}else if(time >8 && time <=12 ) {
			System.out.println("Budhi ga classes vinu");
		}
		else if(time >12 && time <=13) {
			System.out.println("Manchiga tinu, Strong ga undali!!");
		}else if(time >13 && time <=14) {
			System.out.println("Chill broo..! Take some rest");
		}else if(time >14 && time <=17) {
			System.out.println("Imp!! Mrng chaduvukunnavi practice cheyyi");
		}else if(time >17 && time <=18) {
			System.out.println("Scanks time!! malli tinu energy kavali and fresh avvu");
		}else if(time >18 && time <= 20) {
			System.out.println("Very imp!!!1 Malli practice cheyyi, yendhukante practice makes man/woman Perfect kabatti");
		}
		else if(time >20 && time <=21) {
			System.out.println("Dinner tiiiime, malli tinu em parvala. Intlo vallatho matladu!"); 
		}
		else if(time >21 && time <=22) {
			System.out.println("Pratice chesinavi anni revise chesko, imp bigulu");
		}
		else if(time >22 && time <=23) {
			System.out.println("Happy scrolling!!");
		}
		else {
			System.out.println("Inka yenthasepu chusatv raaa aa dikkumaalina ph, emundhi le inka paduko");
		}
	}

}
