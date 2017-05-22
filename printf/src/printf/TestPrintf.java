package printf;

public class TestPrintf {
	public static void main(String[] args)
	{
		String str = "Hello World";
		String b = "Test";
		System.out.printf("This is a %s application", str);
		System.out.println();
		System.out.printf("This is a %s application %s", str, b);
		double num1 = 5.7;
		int num2 = 3;
		System.out.println();
		System.out.printf("The double is %f. The int is %d.", num1, num2);
		System.out.println();
		System.out.printf("The double is %, .2f. The int is %d.", num1, num2);
		System.out.println();
		System.out.printf("The double is %, .4f. The int is %d.", num1, num2);
	}
}
