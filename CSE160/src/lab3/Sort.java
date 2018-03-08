package lab3;
import java.util.*;
/*
 * Write a program that sorts three integers. The integers are entered from the input dialogs and stored in variables num1, num2, and num3, respectively. The program prints the sorted numbers.
 */
public class Sort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int[] arr = {num1, num2, num3};	
		Arrays.sort(arr);
		for(int i: arr) {
			System.out.println(i);
		}

	}
}
