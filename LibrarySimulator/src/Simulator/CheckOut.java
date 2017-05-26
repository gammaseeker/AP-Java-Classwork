package Simulator;
import java.util.*;

import Objects.Book;
import Objects.Person;

public class CheckOut implements Runnable{

	public Queue<Person> line = new ArrayDeque<Person>();
	public CheckOut(Queue<Person> line)
	{
		this.line = line;
	}

	
	@Override
	public void run() {
		while(!line.isEmpty())
		{
			Person temp = line.remove();
			Stack<Book> tempBooks = temp.getBooks();
			Book tempBook = tempBooks.pop();
			tempBook.borrow();
			//System.out.println(line.remove() + "\n");
		}
		
		
	}
}
