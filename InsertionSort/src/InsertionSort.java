
public class InsertionSort 
{
	public static void main(String[] args)
	{
		int[] arr = {64, 5, 1, 89, 54, 24, 39, 43, 23, 54, 24, 542, 234, 624, 2334, 2, 4, 7};
		//insertionSort(arr);
		
		long start = 0;
		long end = 0;
		start = System.currentTimeMillis();
		insertionSort(arr);
		end = System.currentTimeMillis();
		System.out.println(end-start);
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
	
	/*public static void InsertionSort( int [ ] num)
	{
	    int j;                    
	    int key;               
	    int i;  

	    for (j = 1; j < num.length; j++)    
	    {
	    	key = num[ j ];
	        for(i = j - 1; (i >= 0) && (num[i] > key); i--)  // > Ascending < Descending
	        {
	        	num[ i+1 ] = num[ i ];
	        }
	        num[i+1] = key;    
	    }

	} */
	
	public static void insertionSort(int[] elements)
	{
		for(int j = 1; j < elements.length; j++)
		{
			int temp = elements[j];
			int possibleIndex = j;
			while(possibleIndex > 0 && temp < elements[possibleIndex-1])
			{
				elements[possibleIndex] = elements[possibleIndex - 1];
				possibleIndex--;
			}
			elements[possibleIndex] = temp;
		}
	}
}
