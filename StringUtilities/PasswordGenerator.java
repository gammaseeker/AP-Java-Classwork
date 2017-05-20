public class PasswordGenerator
{
	private char[] characters;
	
	public PasswordGenerator()
	{
		characters = new char[62];
		
		int i = 0;
		char ch = 'A';
		for(; ch <= 'Z'; i++, ch++)
		{
			characters[i] = ch;
		}
		for(ch = 'a'; ch <= 'z'; i++, ch++)
		{
			characters[i] = ch;
		}
		for(ch = '0'; ch <= '9'; i++, ch++)
		{
			characters[i] = ch;
		}
		/*
		characters[i] = '_';
		i++;
		characters[i] = '-';
		i++;
		characters[i] = '$';
		i++;
		characters[i] = '%';
		i++;
		characters[i] = '#';
		i++;
		characters[i] = '@';*/
	}
	public char[] getCharArray()
	{
		return characters;
	}
	
}