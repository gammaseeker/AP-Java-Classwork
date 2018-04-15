package IOException;
import java.util.*;
import java.io.*;
public class WriteData {

	public static void main(String[] args) throws Exception{
		File file = new File("name.txt");
		if(file.exists()) {
			System.out.println("File already exists");;
			System.exit(0);
		}
		PrintWriter output = new PrintWriter(file);
		output.print("John T Smith ");
		output.close();
	}
}
