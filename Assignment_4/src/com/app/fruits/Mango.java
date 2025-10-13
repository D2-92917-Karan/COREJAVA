package com.app.fruits;

public class Mango extends Fruit {

	public Mango(String color,double weight,String name) {
		super(color,weight,name,true);
	}
	
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "Sweet";
	}
	
}
