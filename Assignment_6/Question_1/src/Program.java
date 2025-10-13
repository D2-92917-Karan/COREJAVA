import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		try {
			Scanner sc= new Scanner (System.in);
			System.out.println("Enter the string:");
			String str=sc.nextLine();
			str=str.toLowerCase().replaceAll("\\s+","");
			
				if(str.length()>80) {
					throw new ExceptionLineTooLong();
				}
				System.out.println("length:"+str.length());
		}catch(ExceptionLineTooLong e) {
			System.out.println("Error:"+e.getMessage());
			
		}
	}

}
