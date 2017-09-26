package hackerRank;
import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i < n; i++)
            {
            sum1 += a[i][i];
        }
       
        for(int j = 0, i = n-1; j < n; j++, i--)
            {
            sum2 += a[j][i];
            
        }
        System.out.println(Math.abs(sum1-sum2));
    }
}
