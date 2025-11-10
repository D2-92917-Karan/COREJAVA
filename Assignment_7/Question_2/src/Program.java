import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Program {
	public static Student[] getInstance() {
		Student[] arr=new Student[6];
		arr[0] = new Student(1, "Karan", "Pune", 85);
	    arr[1] = new Student(2, "mit", "Mumbai", 75);
	    arr[2] = new Student(3, "Rohan", "Pune", 90);
	    arr[3] = new Student(4, "Neha", "Delhi", 90);
	    arr[4] = new Student(5, "asha", "Mumbai",75);
	    arr[5] = new Student(6, "Kunal", "Delhi", 70);
		return arr;
	}
	public static void printStudent(Student[] arr) {
		for(Student s : arr) {
			System.out.println(s.toString());
		}
	}
	public static int menuList() {
		int choice;
		System.out.println("0.Exit");
		System.out.println("1.1st level sorting");
		System.out.println("2. secondlevel sorting");
		System.out.println("3.third level sorting");
		System.out.println("Enter choice:");
		Scanner sc = new Scanner(System.in);
		choice=sc.nextInt();
		return choice;
	}
	
	public static void main(String[] args) {
		int choice;
		Student[] arr=Program.getInstance();
		while((choice=menuList())!=0) {
			Comparator<Student> comparator=null;
			switch(choice) {
			case 1:
				comparator=new CompareByCity();
					break;
			case 2:
				comparator=new ComapreByCityMarks();
					break;
			case 3:
				comparator=new CompareByCityMarksName();
				break;
			}
			Arrays.sort(arr,comparator);
			printStudent(arr);
		}
	}
}
