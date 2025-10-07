package Assignment;

import java.util.Scanner;

public class Q1 {
	public static void main(String[] args) {
Scanner sc= new Scanner(System.in);
System.out.print("Enter the number:");
	int num=sc.nextInt();
	System.out.println("Given Number"+num);
	String num2=Integer.toBinaryString(num);
	System.out.println("Binary equivalent:"+num2);
	String num4=Integer.toOctalString(num);
	System.out.println("Octal equivalent:"+num4);
	String num3=Integer.toHexString(num);
	System.out.println("Heaxdecimal equivalent:"+num3);
	}
}
