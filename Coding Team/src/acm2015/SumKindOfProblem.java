package acm2015;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class SumKindOfProblem {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("sumkindofproblem.txt"));
		
		int input = sc.nextInt();
		
		for(int i = 1; i <= input; i++){
			int set = sc.nextInt();
			int num = sc.nextInt();
			System.out.println(set + " " + getSum(num) + " " + getOdd(num) + " " + getEven(num));
		}
	}
	
	private static int getSum(int num){
		int sum = 0;
		for(int i = 1; i <= num; i++){
			sum += i;
		}
		return sum;
	}
	
	private static int getOdd(int num){
		int ctr = 1;
		int sum = 1;
		if(num == 1){
			return 1;
		}
		for(int i = 1; i < num; i++){
			ctr += 2;
			sum += ctr;
		}
		return sum;
	}
	
	private static int getEven(int num){
		int ctr = 2;
		int sum = 2;
		if(num == 1){
			return 2;
		}
		for(int i = 1; i < num; i++){
			ctr += 2;
			sum += ctr;
		}
		return sum;
	}
}
