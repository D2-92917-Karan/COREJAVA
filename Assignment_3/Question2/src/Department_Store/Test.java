package Department_Store;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("No of Records");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			customer c1=new customer();
			c1.acceptRecord();
			c1.printRecord();
		}
		
	}
}
