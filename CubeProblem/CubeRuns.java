public class CubeRuns
{
	public static void main(String[] args)
	{
		/*if there is no constructor, then a default constructor is used 
		public NumberCube()
		{
		}*/
		NumberCube myCube = new NumberCube();
		int[] testArr = {1, 5, 5, 4, 3, 1, 2, 2, 2, 2, 6, 1, 3, 3, 5, 5, 5, 5};
		int[] testArr2 = {3, 5, 5};
		int[] testArr3 = {2,2, 2, 5, 3, 1, 1, 1, 3, 5, 6, 7};
		int[] testArr4 = {1, 3, 1, 1, 1, 1, 1, 1, 1, 4};
		int[] testArr5 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArray(testArr);
		System.out.println();
		System.out.println(getLongestRun(testArr));
	
		printArray(testArr2);
		System.out.println();
		System.out.println(getLongestRun(testArr2));
		
		printArray(testArr3);
		System.out.println();
		System.out.println(getLongestRun(testArr3));
		
		printArray(testArr4);
		System.out.println();
		System.out.println(getLongestRun(testArr4));
		
		printArray(testArr5);
		System.out.println();
		System.out.println(getLongestRun(testArr5));
		System.out.println();
	}
	//A
	public static int[] getCubeTosses(NumberCube cube, int numOfTosses)
	{
		int[] resArr = new int[numOfTosses];
		for(int i = 0; i < resArr.length; i++)
		{
			resArr[i] = cube.toss();
		}
		return resArr;
	}
	//B
	public static int getLongestRun(int[] values)
	{
		int[] runArr = new int[values.length];
		int longestRun = 1;
		int currentRun = 1;
		int longestIndex = -1;
		int currentIndex = 0;
		for(int i = 1; i < values.length; i++)
		{
			if(values[i] == values[i-1])
			{
				currentRun++;
			}
			else
			{
				if(currentRun > longestRun)
				{
					//update longest run info
					longestRun = currentRun;
					longestIndex = currentIndex;
				}
				//reset currentRun info
				currentRun = 1;
				currentIndex = i;
			}
		}
		if(currentRun > longestRun)
		{
			longestIndex = currentIndex;
		}
		return longestIndex;
	}
	public static void printArray(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if(i != arr.length -1)
			{
				System.out.print(", ");
			}
		}
	}
}