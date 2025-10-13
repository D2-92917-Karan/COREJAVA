import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Circle c2=new Circle();
		System.out.println(c2.toString());
		try {
		Scanner sc=new Scanner(System.in);
		Circle c1=new Circle();
		System.out.println("Enter the myX:");
		double x=sc.nextDouble();
		c1.setMyX(x);
		System.out.println("Enter the myY:");
		double y=sc.nextDouble();
		c1.setMyY(y);
		System.out.println("Enter the Diameter:");
		double d=sc.nextDouble();
		c1.setMyDiameter(d);
		System.out.println(c1.toString());
	}catch(NegativeDiameterException e) {
		System.out.println("Exception:"+e.getMessage());
	}
	}

}
