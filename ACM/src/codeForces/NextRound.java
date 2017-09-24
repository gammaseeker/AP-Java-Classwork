package codeForces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NextRound {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("nextround.txt"));
		
		int input = sc.nextInt();
		int k = sc.nextInt();
		int advance = 0;
		ArrayList<Integer> contestants = new ArrayList<Integer>();
		for(int i = 0; i < input; i++){
			contestants.add(sc.nextInt());
		}
		
		for(int i = 0; i < contestants.size(); i++){
			if(contestants.get(i) > 0 && contestants.get(i) >= contestants.get(k-1)){
				advance++;
			}
		}
		System.out.println(advance);
	}
}
