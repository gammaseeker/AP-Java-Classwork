public class DiceRuns
{
	public static int[] getCubeTosses(
		NumberCube cube, int numTosses)
	{
		int[] tosses = new int[numTosses];
		for (int i = 0; i < numTosses; i++)
			tosses[i] = cube.toss();
		return tosses;
	}
	
	public static int getLongestRun(int[] values)
	{
		//variables for keeping track of longest run
		int startIndexOfLongestRun = -1;
		int longestRun = 1;
		
		//variables for keeping track of current run
		int startIndexOfCurrentRun = 0;
		int currentRun = 1;
		
		for (int i = 1; i < values.length; i++)
		{
			if (values[i] == values[i-1])
			{
				currentRun++;
			}
			else
			{
				if (currentRun > longestRun)
				{
					//update longestRun info
					longestRun = currentRun;
					startIndexOfLongestRun =
						startIndexOfCurrentRun;
				}
				//reset currentRun info
				currentRun = 1;
				startIndexOfCurrentRun = i;
			}
		} //end of for loop
		
		//just in case the longestRun is at the end of the array
		if (currentRun > longestRun)
		{
			startIndexOfLongestRun =
						startIndexOfCurrentRun;
		}
		
		return startIndexOfLongestRun;
	}
	
	//test out the methods
	public static void main(String[] args)
	{
		//let the computer generate the array
		NumberCube theCube = new NumberCube();
		int[] array1 = getCubeTosses(theCube, 20);
		printArray(array1);
		int startLongestRun1 = getLongestRun(array1);
		System.out.println(startLongestRun1);
		System.out.println();
		
		//longestRun in middle of the array
		int[] array2 = {4,5,2,2,3,4,1,1,1,6,2,2};
		printArray(array2);
		int startLongestRun2 = getLongestRun(array2);
		System.out.println(startLongestRun2);
		System.out.println();

		//longestRun at end of the array
		int[] array3 = {4,5,2,2,3,4,1,1,1,6,6,6,6,6,6};
		printArray(array3);
		int startLongestRun3 = getLongestRun(array3);
		System.out.println(startLongestRun3);
		System.out.println();
		
		//longestRun at start of the array
		int[] array4 = {4,4,4,4,5,2,2,3,4,1,1,1,6,2,2};
		printArray(array4);
		int startLongestRun4 = getLongestRun(array4);
		System.out.println(startLongestRun4);
		System.out.println();
		
		//no run within the array, should return -1
		int[] array5 = {4,5,2,5,3,4,1,3,1,6,5,2};
		printArray(array5);
		int startLongestRun5 = getLongestRun(array5);
		System.out.println(startLongestRun5);
		System.out.println();
	}
	
	//helper method which prints the contents of an int array
	public static void printArray(int[] arr)
	{
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]);
			if (i != arr.length - 1)
				System.out.print(", ");
		}
		System.out.println();
	}
}