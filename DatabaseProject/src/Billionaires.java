import java.util.ArrayList;
public class Billionaires
{
	private ArrayList<Billionaire> billionaires = new ArrayList<Billionaire>();
	
	public Billionaires(Billionaire[] theBillionaires)
	{
		for(int i = 0; i < theBillionaires.length; i++)
		{
			billionaires.add(theBillionaires[i]);
		}
	}
	public Billionaires(ArrayList<Billionaire> theBillionaires)
	{
		billionaires = theBillionaires;
	}
	public Billionaire getByUID(int uid)
	{
		
		for(int i = 0; i < billionaires.size(); i++)
		{
			if(billionaires.get(i).getRank() == uid)
			{
				return billionaires.get(i);
			}
		}
		return null;
	}
	public ArrayList<Billionaire> getBySource(String source)
	{
		ArrayList<Billionaire> returnList = new ArrayList<Billionaire>();
		
		for(int y = 0; y < billionaires.size(); y++)
		{
				if(billionaires.get(y).getSource().equals(source))
				{
					returnList.add(billionaires.get(y));
				}		
		}
		return returnList;
	}
	public ArrayList<Billionaire> getByCountry(String country)
	{
		ArrayList<Billionaire> returnList = new ArrayList<Billionaire>();
		
		for(int y = 0; y < billionaires.size(); y++)
		{
				if(billionaires.get(y).getCountry().equals(country))
				{
					returnList.add(billionaires.get(y));
				}		
		}
		return returnList;
	}
	private void swap(ArrayList<Billionaire> arr, int a, int b)
	{
		arr.set(b, arr.set(a, arr.get(b)));
	}
	public void sortAlpha()
	{
		for(int i = 0; i < billionaires.size()-1; i++)
		{
			int minIndex = i;
			for(int y = i+1; y < billionaires.size(); y++)
			{
				if(billionaires.get(y).compareTo(billionaires.get(minIndex)) < 0)
				{
					minIndex = y;
				}	
			}
			swap(billionaires, minIndex, i);
		}
	}
	public void sortByNetWorth()
	{
		for(int i = 0; i < billionaires.size()-1; i++)
		{
			int maxIndex = i;
			for(int y = i+1; y < billionaires.size(); y++)
			{
				if(billionaires.get(y).compareNetWorth(billionaires.get(maxIndex)) > 0)
				{
					maxIndex = y;
				}	
			}
			swap(billionaires, maxIndex, i);
		}
	}
	public int removeTopBillionaires(long netWorth)//netWorth is min value needed for removal
	{
		int ctr = 0;
		for (int i = billionaires.size()-1; i >= 0; i--)
		{
			if(billionaires.get(i).getNetWorth() >= netWorth)
			{
				billionaires.remove(i);
				ctr++;
			}
		}
		return ctr;
	}
	public double getTotal()
	{
		double total = 0;
		for(Billionaire b : billionaires)
		{
			total += b.getNetWorth();
		}
		return total;
	}
	public double getAvg()
	{
		return getTotal()/billionaires.size();
	}
	public String toString()
	{
		String output = "";
		for (Billionaire s : billionaires)
			output += s.toString() + "\n";
		output += "\n";
		
		return output;	
		
	}
}