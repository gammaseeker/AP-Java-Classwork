package acm2017;
import java.util.*;
import java.io.*;

public class Pieces {

	public static void main(String[] args) throws FileNotFoundException{
		Scanner sc = new Scanner(new File("piecesofparenthesis.txt"));
		int lines = sc.nextInt();
		Stack<String> paren = new Stack<String>();
		System.out.println(sc.next());
		for(int i = 1; i <= lines; i++){
			ArrayList<String> input = new ArrayList<String>(Arrays.asList(sc.next().split("")));
			paren.push(sc.next());
		}
	}
}
