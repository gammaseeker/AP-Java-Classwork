import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Worm {
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File("WormIn.txt");
		Scanner sc = new Scanner(file);
		ArrayList<Integer> info = new ArrayList<Integer>();
		while(sc.hasNextLine())
		{
			info.add(sc.nextInt());
		}
		while(info.size() != 0)
		{
			if(info.size() % 3 == 0)
			{
				int ctr = 0;
				int h = info.get(0);
				int sp = info.get(1);
				int sl = info.get(2);
				boolean toggle = true;
				while (h > 0)
				{
					if(toggle)
					{
						h -= sp;
						ctr++;
						toggle = false;
					}
					else
					{
						if(!toggle)
						{
							h += sl;
							ctr++;
							toggle = true;
						}
					}
				}
				System.out.println(ctr);
				for(int i = 0; i < 3; i++)
				{
					info.remove(0);
				}
			}
		}
		
		
	}
}
