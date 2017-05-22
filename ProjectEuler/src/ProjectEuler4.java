
public class ProjectEuler4 {
	
	public static void main(String[] args)
	{
		int i = 100;
		int j = 100;
		int greatest = 0;
		while(i <= 999)
		{
			while(j <= 999)
			{
				int p = i * j;
				if(p > greatest && isPalindrome(new Integer(p).toString()))
				{
					greatest = p;
				}
				j++;
			}
			j = 100;
			i++;
		}
		System.out.println(greatest);
	}
	
	private static boolean isPalindrome(String s)
	{
		return(s.equals(new StringBuilder(s).reverse().toString()));
	}
}
