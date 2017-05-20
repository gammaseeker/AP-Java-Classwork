public class CoinTosses
{
	public static void main(String[] args)
	{
		Coin myCoin = new Coin();
		Coin myCoin2 = new Coin(.2);
		Coin myCoin3 = new Coin(5, 9);
		
		String result;
		int headsCount = 0;
		int tailsCount = 0;
		for(int i = 0; i < 100000; i++)
		{
			result = myCoin.toss();
			if(result.equals("heads"))
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		System.out.println("heads: " + headsCount);
		System.out.println("tails: " + tailsCount);
		
		headsCount = 0;
		tailsCount = 0;
		
		for(int i = 0; i < 100000; i++)
		{
			result = myCoin2.toss();
			if(result.equals("heads"))
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		System.out.println("heads: " + headsCount);
		System.out.println("tails: " + tailsCount);
		
		headsCount = 0;
		tailsCount = 0;
		
		for(int i = 0; i < 100000; i++)
		{
			result = myCoin3.toss();
			if(result.equals("heads"))
			{
				headsCount++;
			}
			else
			{
				tailsCount++;
			}
		}
		System.out.println("heads: " + headsCount);
		System.out.println("tails: " + tailsCount);
	}
}