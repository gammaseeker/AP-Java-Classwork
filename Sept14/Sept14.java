public class Sept14 
{
		public static void main(String[] args)
		{
			//static method does not require an object
			System.out.println("Hello World");
			
			int age = 17;
			System.out.println("You are " + age + " years old.");
			//S.o.pl
			System.out.println("Next year, I will be " + (age+1) + ".");//18
			//System.out.println("Next year, I will be " + age+1 + "."); 171
			
			String permission;
			//value null. No methods available, cannot be concat
		
			if(age > 17)
			{
				permission = "can";
			}
			else
			{
				permission = "cannot";
			}
			System.out.println("You " + permission + " vote.");
			
			permission = null;
			if(permission == null)
			{
				System.out.println("permission is null");
			}
			else
			{
				System.out.println("permission is not null");
			}
			int counter = 0;
			while(counter < 10);//Iterative takes up small space in memory vs Recursion will take more memory with more calls
			
				//System.out.print("Hooray ");
				counter++;
				System.out.println("Ten count complete");
				
			do 
			{
				//command
			}
			while(counter < 10);		
		}
}