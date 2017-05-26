package Objects;
import java.util.*;

public class Person {
	private String firstName;
	private String lastName;
	private Stack<Book> books;
	private int libraryId;
	private double fees;
	
	public Person(String firstName, String lastName, int libraryId)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.libraryId = libraryId;
	}
	
	public Person(String firstName, String lastName, int libraryId, Stack<Book> books, double fees)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.libraryId = libraryId;
		this.books = books;
		this.fees = fees;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public Stack<Book> getBooks()
	{
		return this.books;
	}
	
	public int getLibraryId()
	{
		return this.libraryId;
	}
	
	public double getFees()
	{
		return this.fees;
	}
	
	public void setBooks(Stack<Book> books)
	{
		this.books = books;
	}
	
	public void setLibraryId(int id)
	{
		this.libraryId = id;
	}
	
	public void setFees(double fees)
	{
		this.fees = fees;
	}
	
	private String printBooks()
	{
		String str = "";
		if(this.books == null)
		{
			return "Not checking out any books";
		}
		else
		{
			@SuppressWarnings("unchecked")
			Stack<Book> temp = (Stack<Book>) this.books.clone();
			
			for(int i = 0; i < this.books.size(); i++)
			{
				if(i == this.books.size() - 1)
				{
					str += temp.pop();
				}
				else
				{
					str += temp.pop() + ", ";
				}
				
			}
		}
		
		return str;
	}
	
	public String toString()
	{
		return this.firstName + " " + this.lastName + "\n" +
				"Books: " + printBooks() + "\n" +
				"Library ID: " + this.libraryId + "\n" +
				"Fees: $" + Math.floor(fees * 100) / 100;
		
	}
}
