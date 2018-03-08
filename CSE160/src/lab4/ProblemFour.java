package lab4;
import java.util.*;

public class ProblemFour {

	public static void main(String[] args) {
		pattern(5);
	}
	
	public static void pattern(int n) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i <= n; i++) {
			list.add(i);
			Collections.reverse(list);
			list.stream().forEach(e -> System.out.print(e + " "));
			Collections.reverse(list);
			System.out.println("");
		}
		
	}
}
