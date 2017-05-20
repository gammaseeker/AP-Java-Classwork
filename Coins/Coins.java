public class Coins
{
	public static void main (String[] args)
	{
		coinToss();
	}
	public static void coinToss()
	{
		int heads = 0;
		int tails = 0;
		for(int i =0; i < 100; i++)
		{
			int toss = (int)(Math.random() * 2);
			if(toss == 0)
			{
				heads++;
			}
			else
			{
				tails++;
			}
		}
		System.out.println("Heads: " + heads);
		System.out.println("Tails: " + tails);
	}
}