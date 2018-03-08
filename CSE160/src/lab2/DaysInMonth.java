package lab2;
import java.util.*;

public class DaysInMonth {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month: ");
		int month = sc.nextInt();
		System.out.println("Enter a year: ");
		int year = sc.nextInt();
		
		String[] months = {"January","February","March","April","May","June","July","August","September","OCtober","November","December"};
		System.out.println(months[month-1] + " " + year + " has " + daysInMonth(month) + " days.");
	}
	
	public static int daysInMonth(int m) {
	    switch(m) {
	        case 1:
	        case 3:
	        case 5:
	        case 7:
	        case 8:
	        case 10:
	        case 12:
	            return 31;
	        case 4:
	        case 6:
	        case 9:
	        case 11:
	            return 30;
	        default:
	            return 29;
	    }
	}
}
