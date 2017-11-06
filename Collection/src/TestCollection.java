import java.util.*;

public class TestCollection {
	public static void main(String[] args)
	{
		ArrayList<String> collection1 = new ArrayList<String>();
		collection1.add("New York");
		collection1.add("Dallas");
		collection1.add("Boston");
		
		ArrayList<String> collection2 = new ArrayList<String>();
		collection2.add("Los Angeles");
		collection2.add("Seattle");
		collection2.add("Cambridge");
		
		ArrayList<String> c1 = (ArrayList<String>)(collection1.clone());
		c1.addAll(collection2);
		System.out.println(c1);
		
		c1.retainAll(collection2);
		System.out.println(c1);
		
		c1.removeAll(collection2);
		System.out.println(c1);
	}
}
