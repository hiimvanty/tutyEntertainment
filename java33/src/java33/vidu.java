package java33;

public class vidu {
	private int day;
	private int month;
	private int year;
	
	public vidu(int day, int month, int year) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}else {
			this.day = 1;
		}
		
		if(month >= 1 && month <13) {
			this.month = month;
		}else {
			this.month = 1;
		}
		if(year >=1) {
			this.year = year;
		}else {
			this.year = 1;
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if(day >= 1 && day <= 31) {
			this.day = day;
		}
	}
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month >= 1 && month <13) {
			this.month = month;
		}
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year >=1) {
			this.year = year;
		}
	}
	public String toString() {
		return this.day +"/"+ this.month+"/"+this.year;
	}
	
}
