import java.util.Scanner;


class DateTest{
	Date d=new Date();
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Day:");
		int day=sc.nextInt();
		d.setDay(day);
		System.out.print("Enter the Month:");
		int month=sc.nextInt();
		d.setMonth(month);
		System.out.print("Enter the Year:");
		int year=sc.nextInt();
		d.setYear(year);
	}
	public void printRecord() {
		System.out.println(""+d.getDay()+"/"+d.getMonth()+"/"+d.getYear());

	}
}
public class main {
	public static void main (String[] args) {
		DateTest d1=new DateTest();
		d1.acceptRecord();
		d1.printRecord();
	}
}
