package doubleTransposition;
import java.util.*;

public class DoubleTransposition {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Would you like to encrypt or decrypt?");
		if(sc.next().equals("encrypt")){
			System.out.println("Enter your message: ");
			String message = sc.next();
			System.out.println("Enter your key: ");
			String key = sc.next();
			//encrypt(key, message);
		}
		if(sc.next().equals("decrypt")){
			System.out.println("Enter your encryption: ");
			String enc = sc.next();
			System.out.println("Enter your key: ");
			String key = sc.next();
			//decrypt(key, enc);
		}
		
	}
	
	public static void encrypt(String key, String msg)
	{
		
	}
	
	public static void decrypt(String key, String msg)
	{
		
	}
}
