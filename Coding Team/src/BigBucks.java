import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class BigBucks {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner sc = new Scanner(new File("BigBucksIn.txt"));
		int input = sc.nextInt();
		List<Integer> outputs = new ArrayList<Integer>();
		String num = "";
		for(int i = 1; i <= 2; i++)
		{
			String s = sc.nextLine();
			String[] pieces = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
			for(int j = 0; j < pieces.length; j++)
			{
				if(isNumeric(pieces[j]))
				{
					
				}
			}
			
			System.out.println(num);
			//Integer theNum = Integer.valueOf(num);
			int theNum = Integer.parseInt(num);
			outputs.add(theNum);
		}
		for(int k = 0; k < outputs.size(); k++)
		{
			System.out.println("$" + outputs.get(k) + ".00");
		}
	}
	
	public static boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	}  
	
}
