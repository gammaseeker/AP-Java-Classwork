package Objects;

public class Book {
	private String title;
	private String author;
	private int id;
	private Log log;
	public boolean borrowed;
	
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;
		borrowed = false;
	}
	
	public Book(String title, String author, int id, Log log)
	{
		this.title = title;
		this.author = author;
		this.id = id;
		this.log = log;
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
	
	public Log getLog()
	{
		return this.log;
	}
	
	public boolean isBorrowed()
	{
		return borrowed;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setLog(Log log)
	{
		this.log = log;
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
