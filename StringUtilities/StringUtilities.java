import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;

public class StringUtilities
{
	private String path;
	private boolean append_to_file = false;
	private static ArrayList<String> obj = new ArrayList<String>();
	
	public StringUtilities(String file_path)
	{
		path = file_path;
	}
	public StringUtilities(String file_path, boolean append_value)
	{
		path = file_path;
		append_to_file = append_value;
	}
	public void writeToFile(String textLine ) throws IOException 
	{
		FileWriter write = new FileWriter( "storedPasswords.txt", true);
		PrintWriter print_line = new PrintWriter( write );
		print_line.println(textLine);
		print_line.close();
	}
	public static String reverseString(String str)
	{
		String output = "";
		for(int i = str.length()-1; i >= 0; i--)
		{
			output += str.substring(i, i+1);
		}
		return output;
	}
	public static boolean isVowel(String str)
	{
		if(str.length() != 1)
		{
			return false;
		}
		return "aeiouAEIOU".indexOf(str) != -1;
	}
	public static boolean isLower(String str)
	{
		if(str.length() != 1)
		{
			return false;
		}
		return "abcdefghijklmnopqrstuvwxyz".indexOf(str) != -1;
	}
	public static boolean isUpper(String str)
	{
		if(str.length() != 1)
		{
			return false;
		}
		return "ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(str) != -1;
	}	
	public static boolean hasVowel(String str)
	{
		for(int i = 0; i < str.length(); i++)
		 {
		 	if(isVowel(str.substring(i, i+1)))
		 		return true;
		 }
		return false;
	}
	public static boolean isPalindrome(String str)
	{
		return (str.equals(reverseString(str)));
	}
	public static boolean isDigit(String str)
	{
		if(str.length() != 1)
		{
			return false;
		}
		return str.charAt(0) >= '0' && str.charAt(0) <= '9';
	}
	public static boolean allDigits(String str)
	{
		boolean digitBool = true;
		for(int i = 0; i < str.length(); i++)
		{
			if(isDigit(str.substring(i, i+1)))
			{
				digitBool = true;
			}
			else
			{
				digitBool = false;
				break;
			}
			/*
			 if(!isDigit(str.substring(i, i+1)))
			{
				return false;
			}
			 */
			 /*
			  if(str.length() !=1)
			  	return false;
			  
			  return str.charAt(0) >= '0' && str.charAt(0) <= '9';
			  */
		 		
		}
		return digitBool;
	}
	public static void letterCount(String str)
	{
		//String str.toUpperCase() return all caps string. Does not alter initial string
		//String str.toLowerCase() return all lower case string. Does not alter initial string
	}	
	public static void main(String[] args) throws IOException
	{
		/*String myStr = "Hello";
		String str = reverseString(myStr);
		System.out.println(str);
		
		String theString = "anna";
		System.out.println(isPalindrome(theString));
		
		String letter = "A";
		System.out.println(isVowel(letter));
		String test = "cat";
		System.out.println(hasVowel(test));
		
		char c1 = 'G';//single quote only
		System.out.println(c1);
		System.out.println((int)c1);
		c1++;
		System.out.println(c1);
		System.out.println((int)c1);
		//c1 = c1 + 1; does not work because char + int
		c1 = (char) (c1+1);
		System.out.println(c1);
		String testDigit = "19Cat";
		System.out.println(allDigits(testDigit));
		String testDigit2 = "1999";
		System.out.println(allDigits(testDigit2));*/
		
		for(int i = 1; i < 100; i++)
		{
			createPassword();
			System.out.println();	
		}
		/*StringUtilities data = new StringUtilities("test.txt", true);
		data.writeToFile("");*/
		//Write password to file
	}
	public static void createPassword() throws IOException
	{
		PasswordGenerator theOptions = new PasswordGenerator();
		int theLength = (int)(Math.random() * (12 - 8) + 8);
		char[] password = new char[theLength];
		password[0] = theOptions.getCharArray()[(int)(Math.random() * 52)];
		for(int i = 1; i < password.length; i++)
		{
			int selection = (int)(Math.random() * 62);
			password[i] = theOptions.getCharArray()[selection];
		}
		passwordValidation(password);
	}
	public static void passwordValidation(char[] password) throws IOException
	{
		boolean oneUpper = false;
		boolean oneLower = false;
		boolean oneNum = false;	
		for(int i = 0; i < password.length; i++)
		{
			if(isDigit(Character.toString(password[i])))
			{
				oneNum = true;
			}
			if(isLower(Character.toString(password[i])))
			{
				oneLower = true;
			}
			if(isUpper(Character.toString(password[i])))
			{
				oneUpper = true;
			}
		}
		if(!oneUpper && !oneLower && !oneNum)
		{
			createPassword();
		}
		else
		{
			insertSpecialCharacter(password);
		}
	}
	public static void insertSpecialCharacter(char[] password) throws IOException
	{
		char[] specialChar = {'_' , '-' , '$' ,'%' , '#' , '@'};
		int theLength = password.length;
		int theRndIndex = (int)(Math.random() * (theLength-2) +1);
		password[theRndIndex] = specialChar[(int)(Math.random() * 6)];
		printPassword(password);
	}
	public static void printPassword(char[] password) throws IOException
	{
		File theFile = new File("storedPasswords.txt");
		Scanner sc = new Scanner(theFile);
		String thePassword = "";
		for(int i = 0; i < password.length; i++)
		{
			thePassword += Character.toString(password[i]);
			System.out.print(password[i]);
		}
		while(sc.hasNextLine())
		{
			obj.add(sc.nextLine());
		}
		
		if(!obj.contains(thePassword))
		{
			StringUtilities data = new StringUtilities("storedPasswords.txt", true);
			data.writeToFile(thePassword);
			obj.add(thePassword);
		}
	
		
	}

}