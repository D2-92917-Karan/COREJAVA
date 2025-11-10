package com.main;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import com.domain.Book;
import com.util.SortByPrice;

public class Program {
	private static Scanner sc= new Scanner(System.in);
	private static List<Book> list=new ArrayList<>();
	
	public static void addBook() {
		System.out.println("Enter isbn:");
		String isbn=sc.next();
		System.out.println("Enter Price:");
		double price=sc.nextDouble();
		System.out.println("Enter AutherName:");
		String name=sc.next();
		System.out.println("Enter Qunantity: ");
		int quan=sc.nextInt();
		
		list.add(new Book(isbn,price,name,quan));
		System.out.println("data Entered successfully.......");
	}
	
	public static void forwardTraverse() {
		ListIterator<Book> itr= list.listIterator();
		while(itr.hasNext()) {
			Book ele=itr.next();
			System.out.println(ele.toString());
		}
	}
	public static void ReverseTraverse() {
		ListIterator<Book> itr=list.listIterator(list.size());
		while(itr.hasPrevious()) {
			Book ele=itr.previous();
		System.out.println(ele.toString());	
		}
	}
	private static void deleteElement() {
		// TODO Auto-generated method stub
		forwardTraverse();
		System.out.println("Enter Index to delete:");
		int idx=sc.nextInt();
		list.remove(idx);
	}
	
	public static int menuList() {
		System.out.println("0.exit");
		System.out.println("1. Add book");
		System.out.println("2.Display all books in forward order");
		System.out.println("3. Display all books in reverse order");
		System.out.println("4. Delete a book at given index");
		System.out.println("5. sort all books by price in decs order");
		System.out.println("Enter the choice:");
		return sc.nextInt();
	}
	
	public static void main(String[] args) {
		int choice;
		while((choice=menuList())!=0) {
			switch(choice) {
			case 1:
				addBook();
				break;
			case 2:
				forwardTraverse();
				break;
			case 3:
				ReverseTraverse();
				break;
			case 4:
				deleteElement();
				break;
			case 5:
				Comparator<Book> comaparator=new SortByPrice();
				forwardTraverse();
				break;

			default:
				System.out.println("Enter wrong choice");
				break;
			}
			
		}
	}

	
}
