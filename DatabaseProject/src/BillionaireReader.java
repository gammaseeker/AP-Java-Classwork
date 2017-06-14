import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class BillionaireReader
{
	public static void main(String[] args) throws Exception
	{
		String filename = "billionaires.csv";
		File inputFile = new File(filename);
		if(!inputFile.exists())
			System.out.println("File does not exist.");
		else
		{
			Scanner input = new Scanner(inputFile);
						
			
			int numOfRecords = -1;
			while (input.hasNextLine())
			{
				input.nextLine();
				numOfRecords++;
			}
				
			if(numOfRecords > 0)
			{
				Billionaire[] myBillionaires = new Billionaire[numOfRecords];
				input = null;
				input = new Scanner(inputFile);
				input.nextLine();  
				
				String rowOfData, lName, fName, source, country;
				String rank, net, age;
				String[] splitRowOfData;
				int billIndex = 0;
				
				while (input.hasNextLine())	
					
				{
					rowOfData = input.nextLine();
					splitRowOfData = rowOfData.split(",");
					rank = splitRowOfData[0];
					fName = splitRowOfData[1];
					lName = splitRowOfData[2];
					net = splitRowOfData[3];
					age = splitRowOfData[4];
					source = splitRowOfData[5];
					country = splitRowOfData[6];
					
					myBillionaires[billIndex] = new Billionaire(rank, fName, lName, net, age, source, country);
															
																
					billIndex++; 
				}
				Billionaires theBillionaires = new Billionaires(myBillionaires);	
				ArrayList<Billionaire> billionaireList = new ArrayList<Billionaire>();
				
				System.out.println("Alphabetical sort by last name");
				theBillionaires.sortAlpha();
				System.out.println(theBillionaires);
				System.out.println();
				
				System.out.println("Sort by net worth");
				theBillionaires.sortByNetWorth();
				System.out.println(theBillionaires);
				System.out.println();
				
				System.out.println("Get a billionaire by a unique key");
				Billionaire testList = theBillionaires.getByUID(1);
				System.out.println(testList.toString());
				System.out.println();
				
				System.out.println("Get a list of billionaires by a specified source");
				billionaireList = theBillionaires.getBySource("Microsoft");
				for(Billionaire b : billionaireList)
				{
					System.out.println(b.toString());
					System.out.println();
				}
				System.out.println();
				
				System.out.println("Get a list of billionaires by a specified country");
				billionaireList = theBillionaires.getByCountry("United States");
				for(Billionaire b : billionaireList)
				{
					System.out.println(b.toString());
					System.out.println();
				}
				System.out.println();
				
				System.out.println("Remove Billionaires above a specified value");
				long value = 39600000000L;
				System.out.println(theBillionaires.removeTopBillionaires(value));
				System.out.println();
				
				System.out.println("Get total net worth of entire data");
				System.out.println(theBillionaires.getTotal());
				System.out.println();
				
				System.out.println("Get average net worth of entire data");
				System.out.println(theBillionaires.getAvg());
			
				

				
			}
		}	
	}
}