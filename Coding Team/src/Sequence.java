import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Sequence {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("SequenceIn.txt");
		Scanner sc = new Scanner(file);
		
		ArrayList<Integer> myList = new ArrayList<Integer>();
		myList.add(1);
		myList.add(3);
		myList.add(5);
		myList.add(7);
		int num = sc.nextInt();
		int ctr = num-4;
		System.out.print(1 + " " + 3 + " " + 5 + " " + 7 + " ");
		while(ctr != 0)
		{
			int four = 1;
			int x = 0;
			while(four != 5)
			{
				if((myList.get(myList.size()-four)) % 2 == 0)
				{
					four++;
				}
				else
				{
					x += myList.get(myList.size()-four);
					four++;
				}
			}
			System.out.print(x + " ");
			ctr--;
			myList.add(x);
		}
	}
	 
}
