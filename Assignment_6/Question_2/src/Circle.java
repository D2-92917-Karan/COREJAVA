
public class Circle {
	private double myX;
	private double myY;
	private double myDiameter;
	
	public Circle() {
		this.myX=0.0;
		this.myY=0.0;
		this.myDiameter=100;
	}
	public Circle(double myX, double myY,double myDiameter) {
		this.myX = myX;
		this.myY = myY;
		this.myDiameter=myDiameter;
	}
	public double getMyDiameter() {
		return myDiameter;
	}
	public void setMyDiameter(double myDiameter) throws NegativeDiameterException{
		if(myDiameter <0) {
			throw new NegativeDiameterException();
		}
		this.myDiameter = myDiameter;
	}
	
	public double getMyX() {
		return myX;
	}
	public void setMyX(double myX) {
		this.myX = myX;
	}
	public double getMyY() {
		return myY;
	}
	public void setMyY(double myY) {
		this.myY = myY;
	}
	@Override
	public String toString() {
		return "Circle [myX=" + myX + ", myY=" + myY + ", myDiameter=" + myDiameter + "]";
	}
	
	
}
