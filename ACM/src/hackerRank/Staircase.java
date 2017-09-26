package hackerRank;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String rstr="";
        for(int i = 1; i <= n; i++){
            rstr += "#";
            System.out.format("%"+n+"s%n",rstr);
           
        }
    }
}
