package question1;

import java.util.Objects;
import java.util.Scanner;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	private Double marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, Double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getMarks() {
		return marks;
	}

	public void setMarks(Double marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

	@Override
	public int compareTo(Student o) {	
		return Integer.compare(this.rollno, o.getRollno());
	}

	public void acceptRecord(Scanner sc) {
		System.out.println("Enter student roll no : ");
		this.rollno = sc.nextInt();
		System.out.println("Enter student name : ");
		this.name = sc.next();
		System.out.println("Enter student marks : ");
		this.marks = sc.nextDouble();
	}
	
}
