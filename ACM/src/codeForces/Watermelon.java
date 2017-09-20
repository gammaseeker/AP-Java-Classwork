package codeForces;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Watermelon {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("watermelon.txt"));
		
		int weight = sc.nextInt();
		if(weight % 2 == 0){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
	}
}
