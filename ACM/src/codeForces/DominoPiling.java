package codeForces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DominoPiling {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("dominopiling.txt"));
		// dominos are 2 x 1
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		if(M % 2 == 0 || N % 2 == 0){
			int num = M / 2;
			System.out.println(num * N);
		}
		else{
			int num = (M - 1) / 2;
			System.out.println(num * N + 1);
		}
	}
	
}
