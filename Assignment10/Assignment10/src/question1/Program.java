package question1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	
	private static Scanner sc = new Scanner(System.in);
	
	private static void searchAndDisplayStudent(List<Student> list) {
		System.out.print("Enter roll no : ");
		int rollno = sc.nextInt();
		System.out.println("----------------------");
		list.forEach((student) -> {
			if(student.getRollno()==rollno) {
				System.out.println(student);
				return;
			}
			else {
				System.out.println("Student not found!!");
			}
		});
		System.out.println("----------------------\n");
	}

	private static void sortStudents(List<Student> list) {
		System.out.println("Sort on : ");
		System.out.println("1. rollno");
		System.out.println("2. name");
		System.out.println("3. marks");
		System.out.print("Enter choice : ");
		int choice = sc.nextInt();
		
		switch (choice) {
		case 1:
			list.sort(null);
			break;
		case 2:
			list.sort((a,b) -> a.getName().compareTo(b.getName()));
			break;
		case 3:
			list.sort((a,b) -> Double.compare(a.getMarks(), b.getMarks()));
			break;
		default:
			break;
		}
		System.out.println("After sorting : ");
		System.out.println("----------------------");
		displayAllStudents(list);	
		System.out.println("----------------------\n");
	}

	private static void displayAllStudents(List<Student> list) {
		list.forEach(student -> System.out.println(student));
	}

	private static void addStudent(List<Student> list) {
		Student student = new Student();
		student.acceptRecord(sc);
		list.add(student);	
	}
	
	public static int menuList() {
		System.out.println("------------------------------------");
		System.out.println("1. Add student");
		System.out.println("2. Display all students");
		System.out.println("3. Search student");
		System.out.println("4. Sort Students");
		System.out.println("5. Exit");
		System.out.println("------------------------------------");
		System.out.print("Enter choice : ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		while(true){
			int choice = menuList();
			switch (choice) {
			case 1:
				addStudent(list);
				break;
			case 2:
				displayAllStudents(list);
				break;
			case 3: 
				searchAndDisplayStudent(list);
				break;
			case 4: 
				sortStudents(list);			
				break;
			case 5:
				System.out.println("exiting.......");
				return;

			default:
				System.out.println("Enter valid option!!");
				break;
			}
		}
	}



}
