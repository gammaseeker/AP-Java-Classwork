package codeForces;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WayTooLongWords {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("waytoolongwords.txt"));
		
		int input = sc.nextInt();
		for(int i = 0; i <= input; i++){
			String word = sc.nextLine();
			if(word.length() < 10){
				System.out.println(word);
			}
			else{
				String[] arr = word.split("");
				int num = arr.length-2;
				System.out.println(arr[0] + num + arr[arr.length-1]);	
			}
		}
	}
}
