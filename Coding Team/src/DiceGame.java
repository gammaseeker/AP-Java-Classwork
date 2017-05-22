import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class DiceGame {
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner in = new Scanner(new File("DiceGameIn.txt"));
		/*ArrayList<ArrayList<Integer>> playerRolls = new ArrayList<ArrayList<Integer>>();
		int input = sc.nextInt();
		for(int i = 0; i <= input; i++)
		{
			for(int j = 0; j < 2; j++)
			{
				int n = sc.nextInt();
				int r = sc.nextInt();
				for(int k = 0; k < n; k++)
				{
					ArrayList<Integer> player = new ArrayList<Integer>();
					for(int l = 0; l < r; l++)
					{
						player.add(sc.nextInt());
					}
					playerRolls.add(player);
				}
			}
		}
	}
	
	private static int calcTotal(ArrayList<Integer> list)
	{
		int sum = 0;
		for(int i = 0; i < list.size(); i++)
		{
			sum += list.get(i);
		}
		return sum;
	}*/
		int games = in.nextInt();
		for(int w = 0; w < games; w++)
		{
			ArrayList<int[]> players = new ArrayList<int[]>();
			int nPlayers = in.nextInt();
			int[] scores = new int[nPlayers];
			int nRounds = in.nextInt();
			int RoundsPlayed = 0;
			for(int j = 0; j < nPlayers; j++)
				players.add(new int[nRounds]);
			/*for(int p = 0; p < players.size(); p++){
				for(int s = 0; s < nRounds; s++)
					players.get(p)[s] = in.nextInt();
			}*/
			for(int i = 0; i < nPlayers; i++)
			{
				int total = 0;
				int roll = 0;
				for(int k = 0; k < nRounds; k++){
					RoundsPlayed++;
					roll = in.nextInt();
					total += roll;
					players.get(i)[k] = roll;
					if(willLose(scores,total,nRounds,k))
						break;
					if(i == nPlayers - 1 && willWin(scores,total,nRounds,k))
						break;
				}
				scores[i] = total;
			}
			System.out.print(RoundsPlayed);
			System.out.println(" " + findMax(scores));
			System.out.println(winnersString(findMax(scores),scores));
			if(in.hasNextLine())in.nextLine();
		}
	}
	
	public static boolean willWin(int[] scores, int total, int rounds,int currRound){
		int PerfectScore = total;
		for(int s : scores)
			if(s > PerfectScore) return false;
		return true;
	}
	
	public static String winnersString(int max,int[] scores){
		String output = "";
		for(int i = 0; i < scores.length; i++){
			if(scores[i] == max)
				output += (i + 1) +  " ";
		}
		return output;
	}
	
	public static boolean willLose(int[] scores, int total, int rounds,int currRound){
		int PerfectScore = total + ((rounds - (currRound + 1)) * 60);
		for(int s : scores)
			if(s > PerfectScore) return true;
		return false;
	}
	
	public static int findMax(int[] scores){
		int max = Integer.MIN_VALUE;
		for(int s: scores)
			if(s > max) max = s;
		return max;
	}
}
