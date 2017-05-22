
public class ProjectEuler6 {
	public static void main(String[] args)
	{
		pE6Inefficient();
		pe6Efficient();
	}
	
	private static void pE6Inefficient() //O(n) runtime
	{
		long sumSquares = 0;
		long squareOfSum = 0;
		for(int i = 1; i<= 100; i++)
		{
			squareOfSum += i;
			sumSquares += Math.pow(i, 2);
		}
		long output = (long) (Math.pow(squareOfSum, 2) - sumSquares);
		System.out.println(output);
	}
	
	private static void pe6Efficient()//O(1) runtime
	{
		long sumSquares = 0;
		long squareOfSum = 0;
		final int N = 100;
		
		sumSquares = N * (N+1)/2;
		squareOfSum = (N * (N + 1)  * (2 * N + 1))/6;
		long output = (long) Math.pow(sumSquares, 2) - squareOfSum;
		System.out.println(output);
	}
}
