package practice3;

public class Time {
	int hour;
	int minute;
	int second;
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	public void setTime(int hour, int minute, int second) {
		if(hour < 24 && hour>-1) {
			this.hour = hour;
		}
		if(minute < 60 && minute>-1) {
			this.minute = minute;
		}
		
		if(second < 60 && second>-1) {
			this.second = second;
		}
		else {
			System.out.println("invalid data");
		}
	}
	public String universal() {
		return hour + " " + minute + " " + second;
	}
	public String standard() {
		if (hour>12) {
			return hour-12 + " " + minute + " " + second + " pm";
		}
		else {
			return hour + " " + minute + " " + second + " am";
		}
	}
	public String add(Time t) {
		return this.hour + t.hour + " " + this.minute + t.minute + " " + this.second + t.second;
	}
//	private boolean timeValid(int num) {
//		
//	}
}
