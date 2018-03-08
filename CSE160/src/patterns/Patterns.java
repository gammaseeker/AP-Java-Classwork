package patterns;

public class Patterns {

	public static void main(String[] args) {
		printSquare(5);
		printSpaceShip(5);
		printNumPyramid(4);
		printNumSquare(5);
		System.out.println();
		tartan(4);
		tartan(3);
		timDiamond(3);
		timDiamond(6);
	}
	
	public static void printSquare(int n) {
		
		for (int i = 0; i < n; i++) { //First Row
	        System.out.print("*");
	    }
		
	    System.out.println();//Next Row
	    
	    for (int i = 0; i < n - 2; i++) {
	    	System.out.print("*");//Left side
	        for (int j = 0; j < n - 2; j++) {
	            System.out.print(" ");//inside space
	        }
	        System.out.println("*");//Right side
	    }
	    for (int i = 0; i < n; i++) { //Last Row
	        System.out.print("*");
	    }
	    System.out.println();
	}
	
	public static void printSpaceShip(int n) {
		int ctr = 3;
		
		System.out.println("\\"); //First Row
		
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < ctr; j++) {
				System.out.print("\\");
			}
			ctr += 2;
			System.out.println();
		}
		
		for(int i = 0; i < ctr; i++) {
			System.out.print(">");
		}
		
		ctr = ctr - 2;
		System.out.println();
		for(int i = 1; i < n; i++) {
			for(int j = 0; j < ctr; j++) {
				System.out.print("\\");
			}
			ctr -= 2;
			System.out.println();
		}
		System.out.println("\\");
	}
	
	public static void printNumPyramid(int n) { //n <= 10
		
		int rowCount = n;
		
        //Implementing the logic
 
        for (int i = 0; i < n; i++)
        {
            //Printing i*2 spaces at the beginning of each row
 
            for (int j = 1; j <= i*2; j++)
            {
                System.out.print(" ");
            }
 
            //Printing j where j value will be from 1 to rowCount
 
            for (int j = 1; j <= rowCount; j++)             
            {
                System.out.print(j+" ");
            }
 
            //Printing j where j value will be from rowCount-1 to 1
             
            for (int j = rowCount-1; j >= 1; j--)
            {                 
                System.out.print(j+" ");             
            }
             
            System.out.println();
 
            //Decrementing the rowCount
 
            rowCount--;
        }
	}
	
	public static void printNumSquare(int n) {
		int row = n;
		int[] arr = new int[n];
		
		for(int i = 1; i <= n; i++) {
			arr[i-1] = i;
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print(arr[j]);
			}
			if(i > 0) {
				for(int k = 0; k < i; k++) {
					System.out.print(arr[k]);
				}
			}
			System.out.println();
		}
	}
	
	public static void tartan(int n) {
		int m = n - 1;
		boolean toggle = false;
		
		for(int i = 0 ; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i%2 == 0) {
					if(toggle) {
						System.out.print(m);
					}
					else {
						System.out.print(n);
					}
					toggle = !toggle;
				}
				else {
					if(toggle) {
						System.out.print(m);
					}
					else {
						System.out.print(n);
					}
					toggle = !toggle;
				}
			}
			System.out.println();
		}
	}
	
	public static void diamond(int n) {
		if(n%2!=0) {
			for(int i = 0; i < n/2; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i =0; i<n-1; i++) {
			int pSpace = ((n-2*i)/2)-1;
			int mSpace = (2*i);
			if(i >= n/2) {
				mSpace = 2*(n-i-2);
				pSpace = ((n-2*(n-1-2))/2)-1;
			}
			if(n%2!=0) {
				mSpace++;
			}
			if(n%2==0 || i!=n/2) {
				for(int j = 0; j <pSpace; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				for(int j = 0; j < mSpace; j++) {
					System.out.print(" ");
				}
				System.out.println("*");
			}
		}
		if(n%2!=0) {
			for(int i = 0; i< n/2; i++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}
	}
	
	public static void dispatch(int i, int halfHeight, boolean isEven) {
		String buf = "";
		for(int j = 0; j < halfHeight - i; j++) {
			buf += " ";
		}
		buf += "*";
		for(int k = 0; k < i*2 - 1; k++) {
			buf += " ";
		}
		if(isEven && i > 0) {
			buf += " ";
		}
		if(isEven || i > 0) {
			buf += "*";
		}
		System.out.print(buf);
	}
	
	public static void timDiamond(int n) {
		boolean isEven = n%2 == 0;
		int halfHeight = (n + 1) /2 -1;
		
		for(int i = 0; i < halfHeight + 1; i++) {
			dispatch(i, halfHeight, isEven);
		}
		for(int i = halfHeight - 1; i >= 0; i--) {
			dispatch(i, halfHeight, isEven);
		}
		System.out.println();
	}
}
