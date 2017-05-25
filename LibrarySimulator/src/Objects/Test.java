package Objects;

public class Test {

	public static void main(String[] args)
	{
		Person p1 = new Person("John", "Doe", 54);
		System.out.println(p1);
		
		System.out.println();
		
		Book b1 = new Book("Brave New World", "Aldous Huxely");
		Book b2 = new Book("Julius Caesar", "Shakespeare");
		Book[] Books = new Book[2];
		Books[0] = b1;
		Books[1] = b2;
		
		double fees = 54.32;
		
		Person p2 = new Person("John", "Smith", 92, Books, fees);
		System.out.println(p2);
		
	}
}
