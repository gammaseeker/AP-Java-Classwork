
public class ProjectEuler2 {
	
	public static void main(String[] args)
	{
		int sum = 0;
		int ctr = 1;
		while(fib(ctr) <= 4000000)
		{
			if(fib(ctr)%2 == 0)
			{
				sum += fib(ctr);
			}
			ctr++;
		}
		System.out.println(sum);
	}
	
	private static int fib(int n)
	{
		if(n == 1)
			return 1;
		else
		{
			if(n == 2)
				return 1;
			else
				return fib(n-2) + fib(n-1);
		}
	}
}
