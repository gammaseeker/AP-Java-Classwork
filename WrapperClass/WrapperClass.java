import java.util.ArrayList;
import java.util.List;
public class WrapperClass
{
	//Wrapper classes turn primative into objects so they can be stored in lists
	//Lists only store objects not primatives
	//int --> Integer
	//char--> Character
	//double--> Double
	//short--> Short
	//long--> Long
	//byte--> Byte
	//boolean--> Boolean
	public static void main(String[] args)
	{
		int[] myValues = {5, 7, 12, 34, 64, 23, 54, 425};
		List<Integer> values = new ArrayList<Integer>();
		for(int num: myValues)
		{
			//values.add(new Integer(num));
			values.add(num);//Auto Wraps
		}	
		for(int i = 0; i < values.size(); i++)
		{
			System.out.println(values.get(i).toString());
		}
	}
	
}