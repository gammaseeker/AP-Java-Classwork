package dailyProgrammer;

public class GameOfThrees {

	public static void main(String[] args) {
		gameOfThrees(100);
		improved(100);
		
		gameOfThrees(31337357);
		improved(31337357);
	}
	
	public static void gameOfThrees(int num) {
		while(num != 1) {
			if(num != 3) {
				System.out.print(num);
			}
			if(num%3 == 0) {
				if(num == 3) {
					num = 1;
					System.out.println(1);
				}
				else {
					num = num / 3;
					System.out.print(" " + 0);
				}
				
			}
			else {
				if(num%3 == 1) {
					num = num - 1;
					num = num/3;
					System.out.print(" " + "-1");
				}
				else {
					num = num + 1;
					num = num/3;
					System.out.print(" " + 1);
				}
			}
			System.out.println();
		}
		System.out.println(1);
	}
	
	public static void improved(int input) {
		while(input > 1) {
            int n = input % 3 == 0 ? 0 : input % 3 == 1 ? -1 : 1;
            System.out.println(input + " " + n);
            input = (input + n) / 3;
        }

        System.out.println(input);
	}
}
