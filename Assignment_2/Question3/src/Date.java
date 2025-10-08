class Date{
	private int month;
	private int day;
	private int year;
	public Date(){
		setDay(day);
		setMonth(month);
		setYear(year);
	}
	public void setMonth(int month){
		this.month=month;
	}
	public void setDay(int day) {
		this.day=day;
	}
	public void setYear(int year) {
		this.year=year;
	}
	public int getDay(){
		return day;
	}
	public int getMonth(){
		return month;
	}
	public int getYear(){
		return year;
	}
}