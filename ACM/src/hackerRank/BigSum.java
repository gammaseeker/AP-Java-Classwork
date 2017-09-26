package hackerRank;
import java.util.*;

public class BigSum {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        long sum = 0;
        for(int i = 0; i < arr.length; i++)
            {
            sum += (long)arr[i];
        }
        System.out.println(sum);
    }
}
