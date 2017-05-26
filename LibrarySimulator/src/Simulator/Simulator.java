package Simulator;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

import Objects.Book;
import Objects.Person;

public class Simulator implements Runnable{
	
	public Simulator()
	{
		
	}

	@Override
	public void run() {
	/*	System.out.println(createPerson());
		System.out.println();
		System.out.println(createPerson());
		System.out.println();
		System.out.println(createPerson());*/
		Person p1 = createPerson();
		Person p2 = createPerson();
		Person p3 = createPerson();
		Queue<Person> test = new ArrayDeque<Person>();
		test.add(p1);
		test.add(p2);
		test.add(p3);
		//System.out.println(p1);
		Runnable q1 = new CheckOut(test);
		Thread queue1 = new Thread(q1);
		queue1.start();
		
	}
	
	private Person createPerson()
	{
		String[] first = {"John", "Steve", "Bob", "James"};
		String[] last = {"Doe", "Smith", "Jenson", "Gates"};
		Stack<Book> s = new Stack<Book>();
		s.push(new Book("Brave New World", "Aldous Huxely"));
		s.push(new Book("Julius Caesar", "Shakespeare"));
		return new Person(first[getRandomIndex(0, first.length)], last[getRandomIndex(0, last.length)], 1, s, getRandomDouble(0, 50));
	}
	
	private int getRandomIndex(int lower, int upper)
	{
		return (int)(Math.random() * (upper - lower)) + lower;
	}
	
	private double getRandomDouble(int lower, int upper)
	{
		return (double)(Math.random() * (upper - lower)) + lower;
	}
}
