class Employee{
	private String first_Name;
	private String last_Name;
	private double month_Sal;
	
	public Employee(){
		setFirstName(first_Name);
		setLastName(last_Name);
		setMonthSal(month_Sal);
	}
	public void setFirstName(String first_Name) {
		this.first_Name=first_Name;
	}
	public void setLastName(String last_Name) {
		this.last_Name=last_Name;
	}
	public void setMonthSal(double month_Sal) {
		if(month_Sal>0) {
		this.month_Sal=month_Sal;
		}else {
			this.month_Sal=0;
		}
	}
	public String getFirstName() {
		return first_Name;
	}
	public String getLastName() {
		return last_Name;
	}
	public Double getMonthSal() {
		return month_Sal;
	}
	public Double getyearSal() {
		return 12*month_Sal;
	}
	public Double getyearIncreSal() {
		return 12*(month_Sal+(month_Sal/10));
	}
}