
public class ProjectEuler3 {
	public static void main(String[] args)
	{
		long num = 600851475143L;
		int i = 2;
		while(i * i < num)
		{
			while(num%i == 0)
				num = num/i;
			i++;
		}
		System.out.println(num);
	}
}
