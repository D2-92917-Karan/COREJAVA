import java.util.Scanner;


class Employee_Test{
	Scanner sc= new Scanner(System.in);
	Employee emp=new Employee();
	
	public void acceptRecord() {
	System.out.print("Enter First Name:");
	String Fname=sc.next();
	emp.setFirstName(Fname);
	System.out.print("Enter Last Name:");
	String Lname=sc.next();
	emp.setLastName(Lname);
	System.out.print("Enter Monthly Salary:");
	double Msal=sc.nextDouble();
	emp.setMonthSal(Msal);
	}
	
	public void printRecord() {
		System.out.println("First Name:"+emp.getFirstName());
		System.out.println("Last Name:"+emp.getLastName());
		System.out.println("Monthly Salary:"+emp.getMonthSal());	
		System.out.println("Yearly Salary:"+emp.getyearSal());
		System.out.println("Yearly Salary with increment:"+emp.getyearIncreSal());
	}
}

public class Main {
	public static void main(String[] args) {
	Employee_Test emp1=new Employee_Test();
	emp1.acceptRecord();
	emp1.printRecord();
	Employee_Test emp2=new Employee_Test();
	emp2.acceptRecord();
	emp2.printRecord();
	}
}
