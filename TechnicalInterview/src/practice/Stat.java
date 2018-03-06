package practice;

import java.util.Arrays;

/*
 * You are the "computer expert" of a local Athletic Association (C.A.A.). Many teams of runners come to compete. Each time you get a string of all race results of every team who has run. For example here is a string showing the individual results of a team of 5 runners:

"01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"

Each part of the string is of the form: h|m|s where h, m, s (h for hour, m for minutes, s for seconds) are positive or null integer (represented as strings) with one or two digits. There are no traps in this format.

To compare the results of the teams you are asked for giving three statistics; range, average and median.
Your task is to return a string giving these 3 values. For the example given above, the string result will be

"Range: 00|47|18 Average: 01|35|15 Median: 01|32|34"
 */
public class Stat {
	
	public static void main(String[] args) {
		//System.out.println(toFormat(2838));
		System.out.println(stat("01|15|59, 1|47|6, 01|17|20, 1|32|34, 2|3|17"));
	}
	
    
	public static String stat(String strg) {
		String[] arr = strg.split(",");
		int[][] nums = new int[arr.length][3];
		for(int i = 0; i < arr.length; i++) {
			String[] helper = arr[i].split("\\|");
			for(int j = 0; j < nums[i].length; j++) {
				nums[i][j] = Integer.parseInt(helper[j].trim());
			}
		}

		return "Range: " + getRange(toSeconds(nums)) + " Average: " + getAverage(toSeconds(nums)) + " Median: " + getMedian(toSeconds(nums));
	}
	
	private static double[] toSeconds(int[][] matrix) {
		double[] seconds = new double[matrix.length];
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				switch(j) {
					case 0: 
						seconds[i] += matrix[i][j] * 3600;
						break;
					case 1:
						seconds[i] += matrix[i][j] * 60;
						break;
					case 2: 
						seconds[i] += matrix[i][j];
						break;
				}
			}
		}

		return seconds;
	}
  
	private static String toFormat(double seconds) {
		String hh = "";
		String mm = "";
		String ss = "";
		String output = "";
		if(seconds > 3600) {
			hh = ((int)(seconds/3600) < 10 ? "0" : "") + (int)(seconds/3600) + "|";
			seconds -= (int)(seconds/3600) * 3600;
		}
		else {
			hh = "00|";
		}
		if(seconds > 60) {
			mm += ((int)(seconds/60) < 10 ? "0" : "") + (int)(seconds/60) + "|";
			seconds -= (int)(seconds/60) * 60;
		}
		else {
			mm = "00|";
		}
		if(seconds < 60) {
			ss = ((int)(seconds) < 10 ? "0" : "") + Integer.toString((int)seconds);
		}
		else {
			ss = "00";
		}
		return hh + mm + ss;
	}
	
	private static String getRange(double[] seconds){
		String output = "";
		double max = seconds[0];
		double min = seconds[0];
		double range = 0;
		for(int i = 0; i < seconds.length; i++) {
			if(seconds[i] > max)
				max = seconds[i];
			if(seconds[i] < min)
				min = seconds[i];
		}
		range = max - min;
		output = toFormat(range);
		return output;
	}
	
	private static String getAverage(double[] seconds) {
		double avg = 0;
		for(int i = 0; i < seconds.length; i++) {
			avg += seconds[i];
		}
		avg /= seconds.length;
		return toFormat(avg);
	}
	
	private static String getMedian(double[] seconds) {
		int mid = seconds.length/2;
		Arrays.sort(seconds);
		double median;
		if (seconds.length % 2 == 0)
		    median = ((double)seconds[seconds.length/2] + (double)seconds[seconds.length/2 - 1])/2;
		else
		    median = (double) seconds[seconds.length/2];
 
		  return toFormat(median);
	}
}
