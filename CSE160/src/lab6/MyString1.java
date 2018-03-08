package lab6;

import java.util.ArrayList;

public class MyString1 {
	char[] chars;
	
	public MyString1(char[] chars) {
		this.chars = chars;
	}
	
	public MyString1 print() {
        for(int i = 0; i < this.length(); i++) {
            System.out.print(this.chars[i]);
        }
        
        return this;
    }
	
	public char charAt(int index) {
		return this.chars[index];
	}
	
	public int length() {
		return this.chars.length;
	}
	
	public MyString1 substring(int begin, int end) {
		int ctr = 0;
		char[] helper = new char[end-begin];
		for(int i = begin; i < end; i++) {
			helper[ctr] = this.chars[i];
			ctr++;
		}
		return new MyString1(helper);
	}
	
	public MyString1 toLowerCase() {
		for(int i = 0; i < this.chars.length; i++) {
			this.chars[i] = Character.toLowerCase(this.chars[i]);
		}
		return new MyString1(chars);
	}
	
	public boolean equals(MyString1 s) {
		if(s.length() > this.chars.length) {
			for(int i = 0; i < this.chars.length; i++) {
				if(s.charAt(i) != this.chars[i]) {
					return false;
				}
			}
			return true;
		}
		else {
			for(int i = 0; i < s.length(); i++) {
				if(s.charAt(i) != this.chars[i]) {
					return false;
				}
			}
			return true;
		}
	}
	
	public static MyString1 valueOf(int i) {
		char[] c = {(char)i};
		return new MyString1(c); 
	}
	
	public static String[] split(String s, String regex) {

        if (isRegexArray(regex)) {
            return arraySplit(s, regex);
        } else {
            return wordSplit(s, regex);
        }

    }

    private static String[] wordSplit(String s, String regex) {

        ArrayList<String> temp = new ArrayList<>();

        int newIndex = 0;
        for (int i = 0; i < s.length() - regex.length(); i++) {

            if (regex.compareTo(s.substring(i, i + regex.length() )) == 0) {
                temp.add(s.substring(newIndex, i));
                temp.add(regex);
                newIndex = i + regex.length();
            }

        }
        temp.add(s.substring(newIndex, s.length()));
        return temp.toArray(new String[temp.size()]);
    }

    private static String[] arraySplit(String s, String regex) {
        char[] regexChars = getRegex(regex);

        ArrayList<String> temp = new ArrayList<>();
        int newIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            for (int j = 0; j < regexChars.length; j++) {

                if (ch == regexChars[j]) {
                    if (newIndex != i)
                        temp.add(s.substring(newIndex, i));
                    temp.add("" + regexChars[j]);
                    newIndex = i + 1;
                }
            }
        }
        temp.add(s.substring(newIndex, s.length()));
        return temp.toArray(new String[temp.size()]);
    }

    private static char[] getRegex(String regex) {

        if (regex.charAt(0) != '[' && regex.charAt(regex.length() - 1) != ']')
            return regex.toCharArray();
        else
            return regex.substring(1, regex.length() - 1).toCharArray();

    }

    private static boolean isRegexArray(String regex) {
        return (regex.charAt(0) == '[' && regex.charAt(regex.length() - 1) == ']');
    }

}
