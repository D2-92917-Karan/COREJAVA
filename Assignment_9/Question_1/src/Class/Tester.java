package Class;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Stack stack=null;
		boolean exit=false;
		
		while(!exit) {
			System.out.println("1. Choose Fixed Stack");
			System.out.println("2. Choose Growable Stack");
			System.out.println("3. Push Employee");
			System.out.println("4. Pop Employee");
			System.out.println("5. Exit");
			int choice=sc.nextInt();
			
			switch(choice) {
			
				case 1:
					if(stack ==null) {
						stack=new FixedStack();
						System.out.println("Fixed Stack Selected");
					}else {
						System.out.println("Stack already selected");
					}
					break;
					
				case 2:
					if(stack == null) {
						stack= new GrowableStack();
						System.out.println("Growable Stack selected");
						
					}else {
						System.out.println("Stack is already selected");
					}
					break;
					
				case 3:
					if(stack != null) {
						System.out.println("Enter Id: ");
						int id=sc.nextInt();
						sc.nextLine();
						System.out.println("Enter the name:");
						String name=sc.nextLine();
						System.out.println("Enter Salary: ");
						double salary=sc.nextDouble();
						stack.push(new Employee(id,name,salary));
					}else {
						System.out.println("No Stack chosen");
					}
					break;
					
				case 4:
					if(stack != null) {
						stack.pop();
					}else {
						System.out.println("No stack choosen");
					}
					break;
					
				case 5:
					exit=true;
					System.out.println("Exit.....");
					break;
					
				default:
					System.out.println("Invalid choice");
				}	
		}
	}
}
