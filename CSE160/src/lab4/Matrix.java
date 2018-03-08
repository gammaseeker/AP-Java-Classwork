package lab4;
import java.util.*;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimension n of an n x n matrix: ");
		int n = sc.nextInt();
		int[][] matrix = new int[n][n];
		System.out.println("Enter elements row by row (with the elements separated by spaces): ");
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int sum = 0;
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				sum += matrix[j][i];
			}
			System.out.println("The sum of column " + i + " is " + sum);
			sum = 0;
		}
	}
	
	
}
