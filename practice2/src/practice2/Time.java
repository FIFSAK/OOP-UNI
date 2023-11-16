package practice2;

public class Time implements Comparable<Time>{
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
		if (hour>12 & hour==0) {
			return hour-12 + " " + minute + " " + second + " pm";
		}
		else {
			return hour + " " + minute + " " + second + " am";
		}
	}
	public String add(Time t) {
	    int newSecond = this.second + t.second;
	    int newMinute = this.minute + t.minute;
	    int newHour = this.hour + t.hour;

	    if (newSecond > 59) {
	        newMinute += newSecond / 60;
	        newSecond %= 60;
	    }

	    if (newMinute > 59) {
	        newHour += newMinute / 60;
	        newMinute %= 60;
	    }

	    if (newHour > 23) {
	        newHour %= 24;
	    }

	    return newHour + " " + newMinute + " " + newSecond;
	}
	@Override
	public int compareTo(Time o) {
		if(this.hour>o.hour) return 1;
		if(this.hour<o.hour) return -1;
		if(this.minute>o.minute) return 1;
		if(this.minute<o.minute) return -1;
		if(this.second>o.second) return 1;
		if(this.second<o.second) return -1;
		
		return 0;
	}

}
