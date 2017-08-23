package Exception;

import java.util.Scanner;

public class Quotient {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		if(num2 != 0){
			System.out.println(num1 + "/" + num2 + " is " + (num1/num2));
		}
		else{
			System.out.println("Divisor cannot be zero");
		}
		
	}
	
	public static int quotient(int number1, int number2) {
		if (number2 == 0) {
		System.out.println("Divisor cannot be zero");
		System.exit(1);
		}
	
		return number1 / number2;
	}
}
