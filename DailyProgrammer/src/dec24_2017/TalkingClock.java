package dec24_2017;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TalkingClock {

	private static final String[] tensNames = {
		    " ten",
		    " twenty",
		    " thirty",
		    " forty",
		    " fifty"
		  };

		  private static final String[] numNames = {
		    "",
		    " one",
		    " two",
		    " three",
		    " four",
		    " five",
		    " six",
		    " seven",
		    " eight",
		    " nine",
		    " ten",
		    " eleven",
		    " twelve",
		    " thirteen",
		    " fourteen",
		    " fifteen",
		    " sixteen",
		    " seventeen",
		    " eighteen",
		    " nineteen"
		  };
		  
	public static void main(String[] args) throws FileNotFoundException {
		File input = new File("clock.txt");
		Scanner sc = new Scanner(input);
		String[] parts = new String[2];
		while(sc.hasNext()) {
			parts = sc.next().split(":");
			String period = AmOrPm(Integer.parseInt(parts[0]));
			String minutes = minutes(Integer.parseInt(parts[1]));
			String hour = hour(Integer.parseInt(parts[0]), period);
			System.out.println("It's " + hour + " " + minutes + " " + period);
		}
	}
	
	public static String AmOrPm(int i) {
		if(i < 12) {
			return "am";
		}
		else {
			return "pm";
		}
	}
	
	public static String hour(int i, String period) {
		if(period.equals("am")) {
			return numNames[i];
		}
		else {
			
			if(i == 12) {
				return "twelve";
			}
			else {
				i = i - 12;
				return numNames[i];
			}
		}
	}
	public static String minutes(int i) {
		if(i < 10 && i > 0) {
			return "oh " + numNames[i - 1];
		}
		if(i < 20 && i >= 10) {
			return numNames[i-1];
		}
		if(i >= 20) {
			String minutes = Integer.toString(i);
			String[] digits = minutes.split("");
			return tensNames[Integer.parseInt(digits[0])] + " " + numNames[Integer.parseInt(digits[1])];
		}
		return "";
	}
}
