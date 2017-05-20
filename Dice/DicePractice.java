public class DicePractice
{
	public static final int DEFAULT_NUM_OF_ROLLS = 100;
	
	private int[] rolls;
	private int[] theoreticalRolls;
	private PairOfDice myDice;
	private int numberOfRolls;
	
	public DicePractice(PairOfDice dice)//Formal Parameter
	{				//datatype     name
		this(dice, DEFAULT_NUM_OF_ROLLS);//Calls second constructor. Must be first command
		/*myDice = dice;
		numberOfRolls = DEFAULT_NUM_OF_ROLLS;
		rolls = new int[myDice.getHighestRoll() + 1];
		theoreticalRolls = new int[myDice.getHighestRoll() + 1];*/
	}
	public DicePractice(PairOfDice dice, int numOfRolls)//order of datatype matters
	{
		myDice = dice;//this.myDice = dice; still correct
		numberOfRolls = numOfRolls;
		rolls = new int[myDice.getHighestRoll() + 1];
		theoreticalRolls = new int[myDice.getHighestRoll() + 1];
		
		rollDice();
		
		simulateTheoreticalRolls();
		
		printRolls();
	}
	public void simulateTheoreticalRolls()
	{
		int die1Size = myDice.getDie1().getNumOfSides();
		int die2Size = myDice.getDie2().getNumOfSides();
		for(int i = 1; i <= die1Size; i++)
		{
			for(int j = 1; j <= die2Size; j++)
			{
				theoreticalRolls[i + j]++;
			}
		}
		printTheoreticalRolls();
	}
	public void rollDice()//Not static because numberOfRolls is instance variables. Many objects/values
	{
		for(int i = 0; i < numberOfRolls; i++)
		{
			rolls[myDice.roll()]++;
		}
	}
	public void printTheoreticalRolls()
	{
		int possibleRolls = myDice.getDie1().getNumOfSides() * myDice.getDie2().getNumOfSides();
		for(int i = 2; i < theoreticalRolls.length; i++)
		{
			System.out.println("[" + i + "] = " + theoreticalRolls[i] );
			System.out.print("\t\t");
			System.out.println( theoreticalRolls[i] / (double)possibleRolls);
		}
		System.out.println();
	}
	public void printRolls()
	{
		for(int i = 2; i < rolls.length; i++)
		{
			System.out.println("[" + i + "] = " + rolls[i]);
			System.out.print("\t\t");
			System.out.println( rolls[i] / (double)numberOfRolls);
		}
		System.out.println();
	}
	
/*	public static void main(String[] args)
	{
		NumberCube d1 = new NumberCube();
		NumberCube d2 = new NumberCube();
		PairOfDice theDice = new PairOfDice(d1, d2);
		DicePractice dp1 = new DicePractice(theDice);
		DicePractice dp2 = new DicePractice(theDice, 100000);
		//PairOfDice myDice = new PairOfDice(new NumberCube(), new NumberCube());
		
	}*/
}