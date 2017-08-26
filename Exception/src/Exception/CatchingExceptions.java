package Exception;

import java.util.*;

public class CatchingExceptions {

	public static void main(String[] args){
		try{
			method1();
			System.out.println(1/0);
			System.out.println("Method 1 executed");
		}
		catch(ArithmeticException ex){
			System.out.print("UhhHHHHhhHHHHhhhh... ");
			System.out.println("Error in method 1");
		}
	}
	
	public static void method1(){
		try{
			method2();
			System.out.println(1/0);
			System.out.println("Method 2 executed");
		}
		catch(ArithmeticException ex){
			System.out.print("UhhHHHHhhHHHHhhhh... ");
			System.out.println("Error in method 2");
		}
	}
	
	public static void method2(){
		try{
			int result = method3(1, 0);
			System.out.println(result);
			System.out.println("Method 3 executed");
		}
		catch(ArithmeticException ex){
			System.out.print("UhhHHHHhhHHHHhhhh... ");
			System.out.println("Error in method 3");
		}
	}
	public static int method3(int num1, int num2){
		if(num2 == 0)
			throw new ArithmeticException("Divisor cannot be zero");
			
		return num1 / num2;
	}
}
