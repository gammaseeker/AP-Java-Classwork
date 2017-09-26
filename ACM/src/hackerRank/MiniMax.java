package hackerRank;

import java.util.Arrays;
import java.util.Scanner;

public class MiniMax {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] arr = new long[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextLong();
        }
        Arrays.sort(arr);
        long numMin = arr[0] + arr[1] + arr[2] + arr[3];
        long numMax = arr[1] + arr[2] + arr[3] + arr[4];
        String min = String.valueOf(numMin);
        String max = String.valueOf(numMax);
        System.out.print(min + " " + max);
    }
}
