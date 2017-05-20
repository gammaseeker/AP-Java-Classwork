public class TestArrays
{
	public static void main (String[] args)
	{
		//int[] array1 = {25, -57, 10, 14,-924, -1, 7, 4, 88, 266, 6, 3, 1, 2, 123, 14335, 234135, 2145123, 21352352, 21453523,141234};
		int[] array2 = {9999, 1, 2, 3, 4, 5, 6};
		//String[] array1 = {"Jack", "Steve", "Ben", "Brian", "Cole"};	
		Student[] array1 = new Student[3];
		array1[0] = new Student("Steven", "Kotevski", 38947);
		array1[1] = new Student("Tony", "Stark", 23878);
		array1[2] = new Student("Brian", "Chiu", 1354);
		ArrayUtils.sortArray(array1);
	/*	int sum1 = ArrayUtils.sum(array1);
		double avg = ArrayUtils.average(array1);
		System.out.println("sum1 = " + sum1);
		System.out.println("avg = " + avg);
		System.out.println(ArrayUtils.sumPositiveValues(array1));
		System.out.println(ArrayUtils.averagePositiveValues(array1));
		System.out.println((double)0/0);
		System.out.println(ArrayUtils.largestValue(array1));
		System.out.println(ArrayUtils.largestValue(array2));
		System.out.println(ArrayUtils.positionOfLongest(array2));
		System.out.println(ArrayUtils.insertElement(420, array2)[array2.length]);
		array1 = ArrayUtils.deleteElement( 5, array1);*/
		for(int i = 0; i < array1.length; i++)
		{
			System.out.println(array1[i]);
		}
	}
	//Robust: Program should work for all circumstances/inputs
	//Overloading a method: method w/ different data type of parameters and different numbers of parameters
}