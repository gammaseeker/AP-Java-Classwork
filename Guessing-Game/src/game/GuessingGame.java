package game;

import java.util.*;

public class GuessingGame {

	public static void main(String [] args){
		front();
		game(scannerCall());
	}
	public static int scannerCall(){
		Scanner sc = new Scanner (System.in);
		int input = sc.nextInt();
		return input;
	}
	public static void front(){
		System.out.println("Guessing Game ");
		System.out.println("1. Beginner (numbers between 1 and 10)");
		System.out.println("2. Intermediate (numbers between 1 and 100)");
		System.out.println("3. Advanced (numbers between 1 and 1000)");
		System.out.println("4. Expert (numbers between 1 and 10000)");
		System.out.println("Type the number corresponding to the level you want to play:");
	}
	public static void game(int level){
		
		if(level > 4 || level < 1){
			System.out.println("Error select between 1 through 4");
			game(scannerCall());
		}
		else{
			int theValue = (int)(Math.random() * Math.pow(10, level)) + 1;
			int guess = 1;
			boolean correct = false;
			System.out.println("Enter a guess");
			int[] guessArray = new int[0];
			while(!correct){
				Scanner scanner = new Scanner (System.in);
				int select = scanner.nextInt();
				if(select == theValue){
					
					System.out.println("Congratulations! It took you " + guess + " guesses.");
					System.out.println("Would you like to play again?");
					if(scanner.next().equals("yes")){
						correct = false;
						System.out.println("Enter a guess");
						guess = 1;
					}
					else{
						correct = true;
						for(int i = 0; i < guessArray.length; i++){
							System.out.println(guessArray[i] + " ");
						}
					}
				}
				else{
					if(select > theValue){
						System.out.println("You guessed too high. Try again.");
						guess++;
					}
					else{
						System.out.println("You guessed too low. Try again.");
						guess++;
					}
				}
			}
		}
	}
}
