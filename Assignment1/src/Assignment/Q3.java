package Assignment;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int item;
		double bill=0.0;
		int qty=0;
		double price=0.0;
		do {
			System.out.println("************************************");
			System.out.println("Select the item:");
			System.out.println("************************************");
			System.out.println("1.Dosa");
			System.out.println("2.Idli");
			System.out.println("3.Samosa");
			System.out.println("4.Bill");
			System.out.println("************************************");
			System.out.println("************************************");
			item=sc.nextInt();
			switch(item) {
			case 1:
				System.out.println("Enter the Quantity:");
				qty=sc.nextInt();
				System.out.println("Enter the price:");
				price=30;
				bill+=price*qty;
				break;
			case 2:
				System.out.println("Enter the Quantity:");
				qty=sc.nextInt();
				price=20;
				bill+=price*qty;
				break;
			case 3:
				System.out.println("Enter the Quantity:");
				qty=sc.nextInt();
				price=15;
				bill+=price*qty;
				break;
			case 4:
				break;
			}
		}while(item!=4);
		System.out.println("************************************");
		System.out.println("Total bill:"+bill);
		System.out.println("************************************");
	}
}
