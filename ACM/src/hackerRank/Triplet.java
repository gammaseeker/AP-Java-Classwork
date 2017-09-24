package hackerRank;
import java.util.*;
public class Triplet {

	 public static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2){
	    int[] aliceArr = {a0, a1, a2};
	    int[] bobArr = {b0, b1, b2};
	    int[] answer = new int[2];
	    int alice = 0;
	    int bob = 0;
	    for(int i = 0; i < aliceArr.length; i++)
	        {
	        if(aliceArr[i] > bobArr[i])
	            {
	            alice++;
	        }
	        if(aliceArr[i] < bobArr[i])
	            {
	            bob++;
	        }
	       
	    }
	    answer[0] = alice;
	    answer[1] = bob;
	    return answer;
	}

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int a0 = in.nextInt();
	    int a1 = in.nextInt();
	    int a2 = in.nextInt();
	    int b0 = in.nextInt();
	    int b1 = in.nextInt();
	    int b2 = in.nextInt();
	    int[] result = solve(a0, a1, a2, b0, b1, b2);
	    for (int i = 0; i < result.length; i++) {
	        System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	    }
	    System.out.println("");
	
	
	}
}
