package Assignment;

import java.util.Scanner;

public class Q2 {
		
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter the Number");
			if(!sc.hasNextInt() && sc.hasNextDouble()) {
				double num1=sc.nextDouble();
				System.out.println("Enter the number2");
				if(!sc.hasNextInt() && sc.hasNextDouble()) {
					double num2=sc.nextDouble();
					double avg=(num1+num2)/2;
					System.out.println("Average:"+avg);
				}else {
					System.out.println("The number2 is not boolen");
				}
				
			}else {
				System.out.println("The number is not boolen");
			}
		

	}
}
