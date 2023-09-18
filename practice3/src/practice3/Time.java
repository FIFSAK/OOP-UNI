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
		return "";
	}
//	private boolean timeValid(int num) {
//		
//	}
}
