public class Coin
{
	//instance variables <--- Fields: not inside a method, value assignment does not matter
	//Blue print for building a coin or prototype
	private double headsProb;
	//private - client cannot see
	//if we want client to see, we write a method for client to see	(accessor) 
	/* Visibility Mod
	 protected
	 			<-- no visibility mod. More protected than private but not as protected
	 private */
	 public Coin()//no return type. Constructor-->Build new coin but no return
	 {
	 	headsProb = 0.5;
	 	//this(0.5);
	 }
	 public Coin(double headsProb)
	 {
	 	if(headsProb < 0 || headsProb > 1.0)
	 	{
	 		headsProb = 0.5;
	 	}
	 	else
	 	{
	 		this.headsProb = headsProb;
	 		//Instance var		local var
	 	}
	 }
	 public Coin(double headsProportion, double tailsProportion)
	 {
	 	if(headsProportion == 0.0 && tailsProportion == 0.0)
	 	{
	 		headsProb = 0.5;
	 	}
	 	else
	 	{
	 		headsProportion = Math.abs(headsProportion);
	 		tailsProportion = Math.abs(tailsProportion);
	 		headsProb = headsProportion/(headsProportion + tailsProportion);
	 	}
	 }
	 public String toss()
	 {
	 	double flip = Math.random();
	 	if(flip < headsProb)
	 	{
	 		return "heads";
	 	}
	 	else
	 	{
	 		return "tails";
	 	}
	 }
	
}