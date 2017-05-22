
public class ProjectEuler5 {
	public static void main(String[] args)
	{
		int num = 0;
		for(int i = 180; i < 1000000000; i = i +10)
		{
			if(num != 0)
			{
				break;
			}
			for(int j = 2; j < 21; j++)
			{
				if(i % j != 0)
				{
					break;
				}
				if(i % j == 0)
				{
					if(j == 20)
					{
						num = i;
					}
				}
			}
		}
		System.out.println(num);
	}
}
