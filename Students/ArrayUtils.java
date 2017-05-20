public class ArrayUtils
{
	public static void sortArray(int[] values)
	{
		//int[] sorted = new int[values.length];
	
		//minIndex = 0;
		

		for(int i = 0; i < values.length-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < values.length; y++)
			{
				if(values[y] < values[minIndex])
				{
					minIndex = y;
					//swap	
				}	
			}
			swap(values, minIndex, i);
		}
	
	}
	public static void sortArray(String[] values)
	{
		for(int i = 0; i < values.length-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < values.length; y++)
			{
				if(values[y].compareTo(values[minIndex]) < 0)
				{
					minIndex = y;
					//swap	
				}	
			}
			swap(values, minIndex, i);
		}
	
	}
	public static void sortArray(Student[] values)
	{
		for(int i = 0; i < values.length-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < values.length; y++)
			{
				if(values[y].compareTo(values[minIndex]) < 0)
				{
					minIndex = y;
					//swap	
				}	
			}
			swap(values, minIndex, i);
		}
	
	}
	private static void swap(Student[] arr, int a, int b)
	{
		Student temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private static void swap(String[] arr, int a, int b)
	{
		String temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	private static void swap(int[] arr, int a, int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
	public static int[] insertElement(int value, int[] arr)//Assume insert element at end
	{
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++)
		{
			arr2[i] = arr[i];
		}
		arr2[arr2.length - 1] = value;
		return arr2;
	}
	//precondition: index < arr.length
	public static int[] insertElement(int index, int value, int[] arr)//Overloading a method
	{
		int[] arr2 = new int[arr.length + 1];
		for(int i = 0; i < arr.length; i++)
		{
			if(i == index)
			{
				arr2[i] = value;
			}
			else
			{
				arr2[i] = arr[i];
			}
		}
		return arr2;
	}
	//precondition: index < arr.length   index >= 0
	public static int[] deleteElement(int index, int[] arr)
	{
		int[] arr2 = new int[arr.length-1];
		for(int i = 0; i < index; i++)
		{
			arr2[i] = arr[i];
		}
		for(int i = index + 1; i < arr.length; i++)
		{
			arr2[i - 1] = arr[i];
		}
		return arr2;
	}
	public static int sum(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			sum = sum + arr[i];//sum += arr[i];
			//return sum; If return in here, then compiler error. If array is empty, cannot return int. Will not loop if 0<0
		}
		return sum;
	}
	//Compiler looks at overall logic first, logical flow must guarentee a return for datatype
	public static double average(int[] arr)
	{
		if(arr.length == 0)
		{
			return -1;
		}
		double sum = sum(arr);
		double avg = sum/arr.length;
		return avg;
	}
	public static int sumPositiveValues(int[] arr)
	{
		int sum = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
			{
				sum += arr[i];
			}
		}
		return sum;
	}
	public static double averagePositiveValues(int[] arr)
	{
		double sum = sumPositiveValues(arr);
		int ctr = 0;
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 0)
			{
				ctr++;
			}
		}
		if(ctr == 0)
		{
			return(-1);
		}
		double avg = sum/ctr;
		return avg;
	}
	//precondition: arr.length > 0
	public static int largestValue(int[] arr)
	{
		int largest = Integer.MIN_VALUE;// Smallest possible value into an int -2^31
		//int largest = arr[0]; Risk empty array without precondition
		for(int i =0; i <arr.length; i++)
		{
			if(arr[i] > largest)
			{
				largest = arr[i];
			}
		}
		return largest;
	}
	public static int positionOfLongest(int[] arr)
	{
		int theIndex = 0;
		//int position = 0;
		int largest = largestValue(arr);
		for (int i = 0; i < arr.length; i++)
		{
			/*if(arr[i] > arr[position])
			{
				theIndex = i;
			}*/
			if(arr[i] == largest)
			{
				theIndex = i;
			}
		}
		return theIndex;
	}
}