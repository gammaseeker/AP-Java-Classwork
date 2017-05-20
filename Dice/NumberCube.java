public class NumberCube
{
	 //Class variables
	public static final int MIN_SIDES = 4;
	public static final int MAX_SIDES = 120;
	public static final int DEFAULT_SIDES = 6;//static all numbercubes have them (non unique)	
	//Instance Variables
	private int numOfSides;//not static every numbercube has it's own individual(unique) numOfSides
	
	public NumberCube()
	{
		this(DEFAULT_SIDES);
		//numOfSides = DEFAULT_SIDES;
	}
	public NumberCube(int numOfSides)
	{
		if(numOfSides < MIN_SIDES || numOfSides > MAX_SIDES)
		{
			this.numOfSides = DEFAULT_SIDES;
		}
		else
		{
			this.numOfSides = numOfSides;
		}	
	}
	public int roll()//Not static. Will roll based on numOfSides
	{
		return (int)(Math.random() * numOfSides) + 1;
	}
	public int getNumOfSides()
	{
		return numOfSides;
	}
}