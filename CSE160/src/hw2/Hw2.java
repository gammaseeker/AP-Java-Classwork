//Joey Jiemjitpolchai, 111613728
package hw2;
import java.util.*;

public class Hw2 {

	public static int[] count(String s) {
		Map<String, Integer> freq = new HashMap<String, Integer>();
		int[] output = new int[10];
		String[] arr = s.split("");
		for(int i = 0; i < arr.length; i++) {
			if(isDigit(arr[i])) {
				if(freq.containsKey(arr[i])) {
					freq.put(arr[i], freq.get(arr[i])+1);
				}
				else {
					freq.put(arr[i], 1);
				}
			}
		}
		
		for(int i = 0; i < output.length; i++) {
			if(freq.containsKey(Integer.toString(i)))
				output[i] = freq.get(Integer.toString(i));
		}
		
		return output;
	}
	
	private static boolean isDigit(String str) {
		try {
			int i = Integer.parseInt(str);
		}
		catch(NumberFormatException nfe) {
			return false;
		}
		return true;
	}
	
	public static String binaryToHex(String binaryValue) {
		String output = "";
		int bin = Integer.parseInt(binaryValue, 2);
		int rem;
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(bin > 0) {
			rem = bin%16;
			output = hex[rem] + output;
			bin /= 16;
		}
		return output;
	}
	
	public static String sort(String s) {
		String output = "";
		char[] helper = s.toCharArray();
		for(int i = 0; i < helper.length-1; i++) {
			char min = helper[i];
			int minIndex = i;
			for(int j = i+1; j < helper.length; j++) {
				if(min > helper[j]) {
					min = helper[j];
					minIndex = j;
				}
			}
			if(minIndex !=i) {
				helper[minIndex] = helper[i];
				helper[i] = min;
			}
		}
		output = new String(helper);
		return output;
	}
}
