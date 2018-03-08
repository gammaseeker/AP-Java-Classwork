package lab4;
import java.util.*;

public class SumCol {

	public static void main(String[] args) {
		double[][] test = new double[5][5];
		for(int i = 0; i < test.length; i++) {
			for(int j = 0; j < test[i].length; j++) {
				test[i][j] = j;
			}
		}
		double result = sumColumn(test, test.length);
		System.out.println(result);
	}
	
	public static double sumColumn(double [][] m, int c) {
		double sum = 0;
		for(int i = 0; i < m[0].length; i++) {
			for(int j = 0; j < m.length; j++) {
				sum += m[j][i];
			}
			
		}
		return sum;
	}
}
