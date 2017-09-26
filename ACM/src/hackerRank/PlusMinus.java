package hackerRank;

import java.util.Scanner;

public class PlusMinus {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	        }
	        int pos = 0;
	        int neg = 0;
	        int zero = 0;
	        for(int i = 0; i < arr.length; i++){
	            if(arr[i] > 0)
	                pos++;
	            if(arr[i] < 0)
	                neg++;
	            if(arr[i] == 0)
	                zero++;
	        }
	        System.out.println((double)pos/n);
	         System.out.println((double)neg/n);
	         System.out.println((double)zero/n);
	    }
}
