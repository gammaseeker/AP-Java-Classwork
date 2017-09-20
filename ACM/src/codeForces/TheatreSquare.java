package codeForces;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class TheatreSquare {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("theatresquare.txt"));
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		int a = sc.nextInt();
		
		int ctr = n;
		int flags = 0;
		while (ctr > 0){
			ctr -= a;
			flags++;
		}
		
		ctr = m;
		while (ctr > 0){
			ctr -= a;
			flags++;
		}
		
		System.out.println(flags);
	}
	
}
