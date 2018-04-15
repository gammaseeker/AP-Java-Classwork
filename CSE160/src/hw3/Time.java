//Joey Jiemjitpolchai 111613728
package hw3;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	private int hour, minute, second;
	
	public Time() {
		Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        String[] time = (sdf.format(cal.getTime())).split(":");
        hour = Integer.parseInt(time[0]);
        minute = Integer.parseInt(time[1]);
        second = Integer.parseInt(time[2]);
	}
	
	public Time(long time) {
		long totalSeconds = time/1000L;
		this.second = (int) (totalSeconds%60L);
		long totalMinutes = totalSeconds/60L;
		this.minute = (int) (totalMinutes%60L);
		int totalHours = (int)(totalMinutes/60L);
		this.hour = totalHours%24;
	}
	
	public Time(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	public int getHour() {
		return this.hour;
	}
	
	public int getMinute() {
		return this.minute;
	}
	
	public int getSecond() {
		return this.second;
	}
	
	public void setTime(long elapseTime) {
		long totalSeconds = elapseTime/1000L;
		this.second = (int) (totalSeconds%60L);
		long totalMinutes = totalSeconds/60L;
		this.minute = (int) (totalMinutes%60L);
		int totalHours = (int)(totalMinutes/60L);
		this.hour = totalHours%24;
	}
	
}
