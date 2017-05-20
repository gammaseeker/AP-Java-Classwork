
public class APStudent implements EvaluatedItem 
{
	private String name;
	private int score;
	
	public APStudent(String name, int score)
	{
		this.name = name;
		this.score = score;
	}
	public boolean qualified()
	{
		if(this.score >= 3)
		{
			return true;
		}
		return false;
	}
	public String getName()
	{
		return this.name;
	}
}
