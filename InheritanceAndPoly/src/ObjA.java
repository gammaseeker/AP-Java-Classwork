
public abstract class ObjA 
{
	public ObjA()
	{
		
	}
	
	public void methodA()
	{
		System.out.println("a");
		methodB();
	}
	
	public void methodB()
	{
		System.out.println("ObjA");
	}
}
