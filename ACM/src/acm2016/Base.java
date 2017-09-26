package acm2016;
import java.util.*;
import java.io.*;

public class Base {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("base.txt"));
		int cases = sc.nextInt();
		for(int i = 1; i <= cases; i++){
			int line = sc.nextInt();
			int input = sc.nextInt();
			String inp = Integer.toString(input);
			String[] in = Integer.toString(input).split("");
			int octo = 1;
			int hexa = 1;
			for(int j = 0; j < in.length; j++){
				if(Integer.parseInt(in[j]) > 8)
				{
					octo = 0;
				}
				else{
					if(j == in.length-1 && octo != 0){
						octo = Integer.parseInt(inp, 8);
					}
				}
				if(Integer.parseInt(in[j]) > 16)
				{
					hexa = 0;
				}
				else{
					if(j == in.length-1 && hexa != 0){
						hexa = Integer.parseInt(inp, 16);
					}
				}
			}
			
			System.out.println(line + " " + octo + " " + input + " " + hexa);
		}
	}
}
