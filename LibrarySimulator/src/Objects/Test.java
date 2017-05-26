package Objects;
import java.util.*;

public class Test {

	public static void main(String[] args)
	{
		Person p1 = new Person("John", "Doe", 54);
		System.out.println(p1);
		
		System.out.println();
		
		Book b1 = new Book("Brave New World", "Aldous Huxely");
		Book b2 = new Book("Julius Caesar", "Shakespeare");
		Stack<Book> Books = new Stack<Book>();
		Books.push(b1);
		Books.push(b2);
		
		double fees = 54.32;
		
		Person p2 = new Person("John", "Smith", 92, Books, fees);
		System.out.println(p2);
		
	}
}
