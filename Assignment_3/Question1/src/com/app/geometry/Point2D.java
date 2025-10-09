package com.app.geometry;

public class Point2D {
	private double x;
	private double y;
	
	public Point2D(double x,double y) {
		this.x=x;
		this.y=y;
	}
	
	public String getDetails() {
		return "x="+x+",y="+y;
	}
	
	public boolean isEqual(Point2D p1) {
		if(this.x==p1.x && this.y==p1.y){
			return true;
		}else {
			return false;
		}
	}	 
	public double calculateDistance(Point2D p1) {
		double x1=this.x-p1.x;
		double y1=this.y-p1.y;
		double dist=Math.sqrt(Math.pow(x1,2)+Math.pow(y1,2));
		return dist;
	}
	
}
