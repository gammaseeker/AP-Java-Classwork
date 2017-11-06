import java.util.*;
public class TestList {
	public static void main(String[] arg)
	{
		
	}
	
	public static void mB(int n)
	{
		int ctr = 1;
		for(int i = 0; i < n; i++)
		{
			for(int j = 0; j < i; j++)
			{
				System.out.println(ctr);
				ctr++;
			}
		}
	}
}
