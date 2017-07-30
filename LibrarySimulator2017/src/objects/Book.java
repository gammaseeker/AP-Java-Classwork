package objects;
import java.util.*;


public class Book {
	private String title;
	private String author;
	private int id;
	public boolean borrowed;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		borrowed = false;
	}
	
	public Book(String title, String author, int id)
	{
		this.title = title;
		this.author = author;
		this.id = id;
		this.borrowed = false;
	}
	
	public String getTitle()
	{
		return this.title;
	}
	
	public String getAuthor()
	{
		return this.author;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public boolean isBorrowed()
	{
		return borrowed;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void borrow()
	{
		this.borrowed = true;
	}
	
	public String toString()
	{
		return this.title;
	}
}
