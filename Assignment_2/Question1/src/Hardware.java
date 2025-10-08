

import java.util.Scanner;

class InvoiceTest{
		Scanner sc= new Scanner(System.in);
		Invoice in=new Invoice();
		public void acceptRecord() {
			System.out.print("Enter the Part_number:");
			String part_number=sc.next();
			in.setPartNumber(part_number);
			System.out.print("Enter the description:");
			String desc=sc.next();
			in.setDescription(desc);
			System.out.print("Enter the Quantity:");
			int qty_item=sc.nextInt();
			in.setQuntity(qty_item);
			System.out.print("Enter the price:");
			double price=sc.nextDouble();
			in.setPrice(price);
		}
		public void printRecord() {
			System.out.println("Part_number:"+in.getPart());
			System.out.println("Description:"+in.getDescription());
			System.out.println("Qty:"+in.getQuntity());
			System.out.println("Price:"+in.getQuntity()*in.getPrice());
		}
}

class Hardware{
	public static void main(String[] args) {
		InvoiceTest in=new InvoiceTest();
		in.acceptRecord();
		in.printRecord();
		}
}
