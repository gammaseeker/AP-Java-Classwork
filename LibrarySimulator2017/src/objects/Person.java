package objects;
import java.util.*;

public class Person {
	private String firstName;
	private String lastName;
	private String libraryId;
	private double fees;
	private Stack <Book> books;
	
	
	public Person()
	{
		this.firstName = "";
		this.lastName = "";
		this.libraryId = "";
		this.fees = 0;	
	}
	
	public Person(Stack<Book> theBooks)
	{
		this.books = theBooks;
	}
	
	public void setFirstName(String name)
	{
		this.firstName = name;
	}
	
	public void setLastName(String name)
	{
		this.lastName = name;
	}
	
	public void setLibraryId(String id)
	{
		this.libraryId = id;
	}
	
	public void setFees(double num)
	{
		this.fees = num;
	}
	
	public String getFirstName()
	{
		return this.firstName;
	}
	
	public String getLastName()
	{
		return this.lastName;
	}
	
	public String getLibraryId()
	{
		return this.libraryId;
	}
	
	public double getFees()
	{
		return this.fees;
	}
	
	public String printBooks()
	{
		Stack<Book> tempBooks = books;
		String tempTitle;
		String tempAuthor;
		Book tempBook = new Book("", "");
		String output = "";
		
		for(int i = 0; i <= books.size(); i++ )
		{
			tempBook = tempBooks.pop();
			tempTitle = tempBook.getTitle();
			tempAuthor = tempBook.getAuthor();
			output = output + tempTitle + " by " + tempAuthor + "\n";
		}
		return output;
	}
	
	public String toString()
	{
		return firstName + " " + lastName + "\n" + "Books: " + printBooks() + "\n" + "Library ID: " + libraryId + "\n" + "Fees: $" + Math.floor(fees * 100) / 100;	
	}
	
}
	

	

