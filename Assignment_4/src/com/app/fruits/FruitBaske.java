package com.app.fruits;

import java.util.Scanner;

public class FruitBaske {
	public static int menuList() {
		Scanner sc =new Scanner(System.in);
		System.out.print("**********************************************");
		System.out.println("0. Exit");
		System.out.println("1. Add Mango");
		System.out.println("2. Add orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display All names of fruites");
		System.out.println("5. Display name, color, weight, taste of all fresh fruits, in the basket.   ");
		System.out.println("6. Display tastes of all stale (not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale.");
		System.out.println("8. Mark all sour fruits stale (optional).");
		System.out.print("*********************************************");
		System.out.print("Enter choice:");
		return sc.nextInt();
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of basket:");
		int size=sc.nextInt();
		Fruit[] basket=new Fruit[size];
		int counter=0;
		
		int choice;
		while((choice=menuList())!=0) {
			switch(choice) {
			case 1:
				if(counter<basket.length) {
					System.out.println("Enter the Name:");
					String name=sc.next();
					System.out.println("Enter the weight:");
					double weight=sc.nextDouble();
					System.out.println("Enter the color:");
					String color =sc.next();
					basket[counter++]=new Mango(name,weight,color);
				}else {
					System.out.println("Basket is full.");	
				}
				break;
			case 2:
				if(counter<basket.length) {
					System.out.println("Enter the Name:");
					String name=sc.next();
					System.out.println("Enter the weight:");
					double weight=sc.nextDouble();
					System.out.println("Enter the color:");
					String color =sc.next();
					basket[counter++]=new Orange(name,weight,color);
				}else {
					System.out.println("Basket is full.");
					
				}
				break;
			case 3:
				if(counter<basket.length) {
					System.out.println("Enter the Name:");
					String name=sc.next();
					System.out.println("Enter the weight:");
					double weight=sc.nextDouble();
					System.out.println("Enter the color:");
					String color =sc.next();
					basket[counter++]=new Apple(name,weight,color);
				}else {
					System.out.println("Basket is full.");
				}
				break;
			case 4:
				for(Fruit f:basket) {
					if(f!=null) {
						System.out.println(f.getName());
					}
				}
				break;
			case 5:
				for(Fruit f:basket) {
					if(f!=null &&f.isIsfresh()){
						System.out.println(f.toString()+"/Taste: " + f.taste());
					}
				}
				break;
			case 6:
				for(Fruit f:basket) {
					if(!f.isIsfresh()) {
						System.out.println("Name:"+f.getName()+" Taste:"+f.taste());
					}
				}
				break;
			case 7:
				System.out.println("Enter the index:");
				int idx=sc.nextInt();
					if(idx<=counter) {
						basket[idx].setIsfresh(false);
					}else {
						System.out.println("Invalid index");
					}
				break;
			case 8:
				for(Fruit f:basket) {
					if(f.taste() != null && f.taste()=="sour") {
						f.setIsfresh(false);
					}
				}
				break;
			}
		}
		System.out.println("Entred Wrong choice");
	}
}
