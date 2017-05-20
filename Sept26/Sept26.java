import java.util.*;
import java.util.Scanner;
public class Sept26
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//Scanner data type
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		System.out.print("How old are you? ");
		int age = sc.nextInt();
		
		System.out.print("What is your GPA? ");
		double gpa = sc.nextDouble();
		
		System.out.println("Your name is " + name + ".");
		System.out.println("You are " + age + " years old");
		System.out.println("Your gpa is " + gpa);
		menu();
	}
	public static void menu()
	{
		boolean correct = false;
		Scanner sc = new Scanner (System.in);
		System.out.print("You may choose a number: \n");
		System.out.println("1. Beginner");
		System.out.println("2. Intermediate");
		System.out.println("3. Advanced");
		System.out.println("4. Expert");
		
		for(int i = 0; i < 3; i++)
		{
			int select = sc.nextInt();
			if(select == 1)
			{
				System.out.println ("You have selected Beginner");
				correct = true;
				return;
			}
			if(select == 2)
			{
				System.out.println ("You have selected Intermediate");
				correct = true;
				return;
			}
			if(select == 3)
			{
				System.out.println ("You have selected Advanced");
				correct = true;
				return;
			}
			if(select == 4)
			{
				System.out.println ("You have selected Expect");
				correct = true;
				return;
			}
			if(correct == false && i < 2)
			{
				System.out.println("Try again");
			}
			if(i == 2)
			{
				System.out.println ("You done goofed");
			}
			
		}
		
	}
}