package lab4;

public class BubbleSort {

	public static void main(String[] args) {
		double[] test = {6.0, 4.4, 1.9, 2.9, 3.4, 2.9, 3.5};
		bubbleSort(test);
		for(double d:test) {
			System.out.println(d);
		}
	}
	
	public static void bubbleSort(double[] arr) {
		int length = arr.length;
		for(int i = 0; i < length-1; i++) {
			for(int j = 0; j < length-i-1; j++) {
				if(arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
