package myfirstcorejavaproject;

public class Variables {

	static String  departmentName="Development";
	static String location="HYD";
	
	int empID;
	String name;
	String mobile;
	String email;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*************Employee Details************** ");
		
		Variables emp1=new Variables();
		emp1.empID=1;
		emp1.name="Sharan";
		emp1.mobile="9870642343";
		emp1.email="sharan34@gmail.com";
		
		System.out.println("Department: "+departmentName);
		System.out.println("Location: "+ location);
		System.out.println("EmpID: "+ emp1.empID);
		System.out.println("Name: "+ emp1.name);
		System.out.println("Mobile: "+ emp1.mobile);
		System.out.println("Email: "+ emp1.email);
		
		
		System.out.println("********Object 2*********");
		
		
		Variables emp2=new Variables();
		emp2.empID=2;
		emp2.name="Shanvi";
		emp2.mobile="9870642383";
		emp2.email="shanvi34@gmail.com";
		
		System.out.println("Department: "+departmentName);
		System.out.println("Location: "+ location);
		System.out.println("EmpID: "+ emp2.empID);
		System.out.println("Name: "+ emp2.name);
		System.out.println("Mobile: "+ emp2.mobile);
		System.out.println("Email: "+ emp2.email);
		
		
		
		
		System.out.println("********Object 3*********");
		
		Variables emp3=new Variables();
		emp3.empID=3;
		emp3.name="Sharukh";
		emp3.mobile="9870042383";
		emp3.email="sharukh34@gmail.com";
		
		System.out.println("Department: "+departmentName);
		System.out.println("Location: "+ location);
		System.out.println("EmpID: "+ emp3.empID);
		System.out.println("Name: "+ emp3.name);
		System.out.println("Mobile: "+ emp3.mobile);
		System.out.println("Email: "+ emp3.email);
		
		
		
		departmentName="Testing";
		
		
		System.out.println("********Object 4*********");
		
		Variables emp4=new Variables();
		emp4.empID=4;
		emp4.name="Shakul";
		emp4.mobile="9870042283";
		emp4.email="sourav34@gmail.com";
		
		System.out.println("Department: "+departmentName);
		System.out.println("Location: "+ location);
		System.out.println("EmpID: "+ emp4.empID);
		System.out.println("Name: "+ emp4.name);
		System.out.println("Mobile: "+ emp4.mobile);
		System.out.println("Email: "+ emp4.email);
		
		
		
		
		System.out.println("********Object 5*********");
		
		Variables emp5=new Variables();
		emp5.empID=5;
		emp5.name="Sakshi";
		emp5.mobile="9896042383";
		emp5.email="sakshi34@gmail.com";
		
		System.out.println("Department: "+departmentName);
		System.out.println("Location: "+ location);
		System.out.println("EmpID: "+ emp5.empID);
		System.out.println("Name: "+ emp5.name);
		System.out.println("Mobile: "+ emp5.mobile);
		System.out.println("Email: "+ emp5.email);
		
		
		
		
	}

}
