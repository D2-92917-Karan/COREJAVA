package com.app.fruits;

public class Apple extends Fruit{
	public Apple(String color,double weight,String name) {
		super(color,weight,name,true);
	}
	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}

}
