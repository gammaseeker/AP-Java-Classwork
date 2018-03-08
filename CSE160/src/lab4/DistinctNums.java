package lab4;
import java.util.*;

public class DistinctNums {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<Integer>();
		for(int i = 1; i <= 10; i++) {
			set.add(sc.nextInt());
		}
		set.stream().forEach(e -> System.out.println(e));
	}
}
