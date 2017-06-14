public class Billionaire
{
	private String rank;
	private String lastName;
	private String firstName;
	private String netWorth;//parse into double
	private String age;//parse into int
	private String source;
	private String country;
	
	public Billionaire(String rank, String firstName, String lastName, String netWorth, String age, String source, String country)
	{
		this.rank = rank;
		this.lastName = lastName;
		this.firstName = firstName;
		this.netWorth = netWorth;
		this.age = age;
		this.source = source;
		this.country = country;
	}
	public String toString()
	{
		return firstName + " " + lastName + ", " + age + ", $" + netWorth + ", " + source + ", " + country;
	}
	public int getRank()
	{
		return Integer.parseInt(rank);
	}
	public String getFirstName()
	{
		return firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public double getNetWorth()
	{
		return Double.parseDouble(netWorth);
	}
	public int getAge()
	{
		return Integer.parseInt(age);
	}
	public String getSource()
	{
		return source;
	}
	
	public String getCountry()
	{
		return country;
	}
	public int compareTo(Billionaire other)
	{
		int lastCompare = 
			this.lastName.compareTo(other.lastName);
		if (lastCompare == 0)
			return this.firstName.compareTo(
									other.firstName);
			
		return lastCompare;
	}
	public double compareNetWorth(Billionaire other)
	{
		double netWorthCompare = Double.toString(this.getNetWorth()).compareTo(Double.toString(other.getNetWorth()));
		if(netWorthCompare == 0)
		{
			return compareTo(other);
		}
		return netWorthCompare;
	}
	public int compareAge(Billionaire other)
	{
		int ageCompare = Integer.toString(this.getAge()).compareTo(Integer.toString(other.getAge()));
		if(ageCompare == 0)
		{
			return (int)compareNetWorth(other);
		}
		return ageCompare;	
	}
	public int compareSource(Billionaire other)//wrong
	{
		int sourceCompare = 
				this.source.compareTo(other.source);
			if (sourceCompare == 0)
				return (int)compareNetWorth(other);
				
			return sourceCompare;
	}
	public int compareCountry(Billionaire other)//wrong
	{
		int countryCompare = 
				this.source.compareTo(other.country);
			if (countryCompare == 0)
				return (int)compareNetWorth(other);
				
			return countryCompare;
	}
}
