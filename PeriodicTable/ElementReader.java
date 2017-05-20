import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.util.Scanner;

public class ElementReader
{
	//collection of elements
	//get elements by uid
	
	public static void main(String[] args) throws Exception
	{
		String filename = "Elements.csv";
		File inputFile = new File(filename);
		if(!inputFile.exists())
			System.out.println("File does not exist.");
		else
		{
			Scanner input = new Scanner(inputFile);
						
			//count number of records, excluding title row
			int numOfRecords = 0;
			while (input.hasNextLine())
			{
				input.nextLine();
				numOfRecords++;
			}
				//instantiate new Students object, which includes a Student array
			if(numOfRecords > 0)
			{
				Element[] myElements = new Element[numOfRecords];
				input = null;
				input = new Scanner(inputFile);
				input.nextLine();  //read heading line
				
				String rowOfData, name, atNum, symbol, atWeight, oxState, family, metal;
				String[] splitRowOfData;
				int elemIndex = 0;
				boolean metalBool = false;
				while (input.hasNextLine())	
					//prepare student test array
				{
					rowOfData = input.nextLine();
					splitRowOfData = rowOfData.split(",");
					name = splitRowOfData[0];
					atNum = splitRowOfData[1];
					symbol = splitRowOfData[2];
					atWeight = splitRowOfData[3];
					oxState	= splitRowOfData[4];
					family = splitRowOfData[5];
					metal = splitRowOfData[6];
					//instantiate new Student
					
					int atomNum = Integer.parseInt(atNum);
					double weight = Double.parseDouble(atWeight);
					int stableOxState = Integer.parseInt(oxState);
					if(metal.equals("M"))
					{
						metalBool = true;
					}
					else
					{
						metalBool = false;	
					}
					myElements[elemIndex] = new Element(name, atomNum, symbol, weight, stableOxState, family, metalBool);
																
					elemIndex++;  //Fix this my guy
				}//end while
				Elements theElements = new Elements(myElements);
				
				for(int i = 0; i < myElements.length; i++)
				{
					
				}
				/*theElements.sortByName();
				System.out.println(theElements);
				System.out.println();*/
			}
		}	
	}
}