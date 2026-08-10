package myfirstcorejavaproject;

class Student{
	
	static String collegeName;
	int rollNo=11;
	String name="syam";
	String phno="9989877872";
	String email;
	String branch;
}

public class Project2 {

	static String collegeName;
	static String location;
	int pincode;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student std= new Student();
		
		System.out.println(std.rollNo);
		System.out.println(std.name);
		System.out.println(std.phno);
		System.out.println(std.email);
		System.out.println(std.branch);
		
		System.out.println(collegeName);
		System.out.println(location);
		
		System.out.println(Student.collegeName);
		
	}

}
