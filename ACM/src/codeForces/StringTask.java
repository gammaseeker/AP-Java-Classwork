package codeForces;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StringTask {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("stringtask.txt"));
		
		
		while(sc.hasNextLine()){
			String input = sc.nextLine();
			ArrayList<String> letters = new ArrayList<String>(Arrays.asList(input.split("")));
			for(int i = letters.size() - 1; i >= 0; i--){
				if(letters.get(i).equalsIgnoreCase("a") || letters.get(i).equalsIgnoreCase("e") || letters.get(i).equalsIgnoreCase("i") 
						|| letters.get(i).equalsIgnoreCase("o") || letters.get(i).equalsIgnoreCase("u") || letters.get(i).equalsIgnoreCase("y")){
							letters.remove(i);
						}
			}
			
			String str = "";
			for(int i = 0; i < letters.size(); i++){
				str = str + "." + letters.get(i);
			}
			
			System.out.println(str);
		}
		
		
	}
}
