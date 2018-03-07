package practice;
import java.util.*;

public class InnerSort {


	public static String sortTheInnerContent(String words)
	{
		String[] arr = words.split(" ");
		for(int i = 0; i < arr.length; i++){
			if(arr[i].length() != 1){
				char[] c = arr[i].substring(1, arr[i].length()-1).toCharArray();
				String str = new String(c);
				String[] ss = str.split(""); 
				Arrays.sort(ss, Collections.reverseOrder());
				String sorted = arr[i].substring(0, 1);
				for(int j = 0; j < ss.length; j++) {
					sorted += ss[j];
		        }
				sorted += arr[i].substring(arr[i].length() - 1, arr[i].length());
				arr[i] = sorted;
			}
      
		}
		words = "";
		for(int i = 0;i < arr.length; i++){
			words += arr[i] + " ";
		}
		words = words.substring(0, words.length()-1);
		return words;
	}
}
