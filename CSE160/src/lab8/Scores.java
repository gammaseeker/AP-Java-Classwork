package lab8;
import java.util.*;
import java.io.*;

public class Scores{

	public static void main(String[] args) throws Exception{

        ArrayList<Integer> scores = new ArrayList<Integer>();
        try {
        	File file = new File("scores.txt");
            Scanner input = new Scanner(file);
            while (input.hasNextInt()) {

                scores.add(input.nextInt());
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println("Scores = " + scores);
        System.out.println("Total = " + getTotal(scores));
        System.out.println("Average = " + getAverage(scores));

    }

    private static double getAverage(ArrayList<Integer> scores) {

        double total = getTotal(scores);

        return total / scores.size();
    }

    private static int getTotal(ArrayList<Integer> scores) {

        int total = 0;
        for (int score : scores) {
            total += score;
        }

        return total;
    }
}
