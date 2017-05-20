import java.util.*;

public class EvaluatedGroup 
{
	private String groupName;
	private ArrayList<EvaluatedItem> list = new  ArrayList<EvaluatedItem>();
	
	public boolean isQualified()
	{
		boolean qualified = false;
		for(EvaluatedItem e : list)
		{
			qualified = e.qualified();
			if(qualified == false)
			{
				return false;
			}
		}
		return true;
	}
}
