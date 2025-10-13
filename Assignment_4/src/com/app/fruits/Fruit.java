package com.app.fruits;

public abstract class Fruit {
	private String color;
	private double weight;
	private String name;
	private boolean isfresh;
	public Fruit() {
		
	}
	public Fruit(String color,double weight,String name,boolean isfresh) {
		this.color=color;
		this.weight=weight;
		this.name=name;
		this.isfresh=isfresh;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isIsfresh() {
		return isfresh;
	}
	public void setIsfresh(boolean isfresh) {
		this.isfresh = isfresh;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Name: "+getName()+" Weight:"+getWeight()+" color:"+getColor()+"]";
	}
	public abstract String taste();
	
}
