package lab3;
import java.util.*;

public class Rev {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		reverse(sc.nextInt());
	}
	
	public static void reverse(int number) {
		String num = Integer.toString(number);
		String[] arr = num.split("");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}
}
