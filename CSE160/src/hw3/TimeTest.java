//Joey Jiemjitpolchai 111613728
package hw3;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time();
		Time u = new Time(555550000);
		System.out.println(t.getHour() + ":" + t.getMinute() + ":" + t.getSecond());
		System.out.println(u.getHour() + ":" + u.getMinute() + ":" + u.getSecond());
	}
}
