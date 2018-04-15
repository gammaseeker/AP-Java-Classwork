package lab8;
import java.io.*;
import java.util.*;

public class Replace {

	public static void main(String[] args) throws IOException {
		File f = new File("test.txt");
		Scanner sc = new Scanner(f);
		ArrayList<String> arr = new ArrayList<String>();
		
		while(sc.hasNext()) {
			String word = sc.next();
			arr.add(word);
		}
		
		for(int i = 0; i < arr.size(); i++) {
			if(arr.get(i).equals("Java!") || arr.get(i).equals("Java") || arr.get(i).equals("Java.")) {
				arr.set(i, "HTML");
			}
		}
		sc.close();
		PrintWriter pw = new PrintWriter("test.txt", "UTF-8");
		for(int i = 0; i < arr.size(); i++) {
			pw.print(arr.get(i));
			pw.append(" ");
			if(i == 2 || i == 7 || i == 12) {
				pw.println("");
			}
		}
		pw.close();
	}
}
