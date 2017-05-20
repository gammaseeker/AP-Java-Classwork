import java.util.ArrayList;
import java.util.List;
public class Primes
{
	public static void main(String[] args)
	{
		System.out.println(isPrime(2));
		System.out.println(isPrime(3));
		System.out.println(isPrime(4));
		System.out.println(isPrime(5));
		System.out.println();
		int[] myArr = getPrimes(2, 2);
		for(int i = 0; i < myArr.length; i++)
		{
			System.out.println(myArr[i]);
		}
		System.out.println();
		myArr = getPrimesWithinRange(2, 7);
		for(int i = 0; i < myArr.length; i++)
		{
			System.out.println(myArr[i]);
		}
		System.out.println();
		ArrayList<Integer> myList = getPrimesListWithinRange(2,7);
		for(int i = 0; i < myList.size(); i++)
		{
			System.out.println(myList.get(i));
		}
	}
	public static boolean isPrime(int num)
	{
		if(num == 2)
			return true;
		if (num%2==0) 
			return false;
		for(int i=3;i*i<=num;i+=2) 
		{
   	 		if(num%i==0)
        			return false;
		}
    		return true;
	}
	
	public static int[] getPrimes(int start, int numberOfPrimes)
	{
		int ctr = 0;
		int[] primes = new int[numberOfPrimes];
		for(int i = start; i <= start + primes.length; i++)
		{
			if(isPrime(i))
			{
				primes[ctr] = i;
				ctr++;
			}
		}
		return primes;
	}
	
	public static int[] getPrimesWithinRange(int minValue, int maxValue)
	{
		int ctr = 0;
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = minValue; i <= maxValue; i++)
		{
			if(isPrime(i))
			{
				primes.add(i);
			}
		}
		int[] primesArr = new int[primes.size()];
		for(int i = 0; i < primesArr.length; i++)
		{
			primesArr[i] = primes.get(i);
		}
		return primesArr;
	}
	
	public static ArrayList<Integer> getPrimesListWithinRange(int minValue, int maxValue)
	{
		ArrayList<Integer> primes = new ArrayList<Integer>();
		for(int i = minValue; i <= maxValue; i++)
		{
			if(isPrime(i))
			{
				primes.add(i);
			}
		}
		return primes;
	}
	
}