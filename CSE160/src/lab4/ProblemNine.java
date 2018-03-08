package lab4;
import java.util.*;

public class ProblemNine {
	
	static public boolean player1 = true;
	static int row = 0;
	static int col = 0;
	static boolean won;

	public static void main(String[] args) {
		boolean play = true;
		boolean empty = true;
		Scanner sc = new Scanner(System.in);
		String[][] board = createGrid(3, 3);
		
		while(play) {
			display(board);
			do {
				row = getRow();
				col = getCol();
				empty = isEmpty(board);
				if (!empty) 
					System.out.println("position has already been taken please try again");
			}while(!empty);
			
			nextTurn(board);
			determineStatus(board);
			
			if (won) {
				display(board);
				String player = (player1) ? "X" : "O";
				System.out.println("Player " + player + " has won.");
				System.out.print("Do you want to play again? y/n: ");
				String option = sc.next();
				play = (option.equalsIgnoreCase("y"));
				board = createGrid(3, 3);
			}
			player1 = !player1;
		}
		System.out.println("Game ended..");		
	}
	
	public static boolean nextTurn(String[][] grid) {
		if (!grid[row][col].equals("|     |") && !grid[row][col].equals("      |")) 
			return false;
		String update = "";
		if (player1)
			update = (col == 0) ? "|  X  |" : "  X   |";
		else
			update = (col == 0) ? "|  O  |" : "  O   |";
			grid[row][col] = update;
			return true;
	}
	
	public static boolean isEmpty(String[][] grid) {
		String position = grid[row][col];
		return position.equals("|     |") || position.equals("      |");
	}
	
	public static boolean isValidRange(int row) {
		return (0 <= row && row <= 2);
	}
	
	public static int getCol(){
		Scanner input = new Scanner(System.in);
		int column = 0;
		boolean isColumnValid = false;
		while (!isColumnValid) {
		    if (player1) {
		    	System.out.print("Enter a column (0, 1, or 2) for player X: ");
		    }
		    else {
	    		System.out.print("Enter a column (0, 1, or 2) for player O: ");
	        }
	        	column = input.nextInt();
	        	isColumnValid = isValidRange(column);
	    	}
	    	return column;	
	}
	
	public static int getRow(){
		int row = 0;
		Scanner sc = new Scanner(System.in);
		boolean isRowValid = false;
		while (!isRowValid) {
			if (player1) {
				System.out.print("Enter a row (0, 1, or 2) for player X: ");
			} 
			else {
				System.out.print("Enter a row (0, 1, or 2) for player O: ");
			}
			row = sc.nextInt();
			isRowValid = isValidRange(row);
		
		}
		
		return row;
    }
	
	public static void determineStatus(String[][] board) {
		int player = (player1) ? 0 : 1;
		String token = (player == 0) ? "X" : "O";
		won = (checkRow(board, token) || checkColumn(board,token) || checkDiagonal(board, token));
	}
	
	public static void display(String[][] board) {
		for (int i = 0; i < board.length; i++) {
			System.out.println("---------------------");
	    	for (int k = 0; k < board[i].length; k++) {
    			System.out.print(board[i][k]);
	    	}
	    	System.out.println("");
		}
		System.out.println("---------------------");
	}
	
	public static String[][] createGrid(int row, int col) {
		String[][] grid = new String[row][col];
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				if (k == 0)
					grid[i][k] = "|     |"; 
				else
					grid[i][k] = "      |"; 
			}
		}
		return grid;
	}
	
	public static boolean checkColumn(String[][] grid, String s) {
		int occurence = 0;
		for (int k = 0; k < grid[0].length; k++) {
			for (int i = 0; i < grid.length; i++) {
				if (grid[i][k].contains(s)) 
					occurence++;
			}
			if (occurence == 3) 
				return true;
			else 
            	occurence = 0;
		}

		return false;
	}

    public static boolean checkRow(String[][] grid, String s) {

		int occurrence = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int k = 0; k < grid[i].length; k++) {
				if (grid[i][k].contains(s)) 
					occurrence++;
			}
			if (occurrence == 3) 
				return true;
			else 
				occurrence = 0;
		}
		
		return false;
    }

    public static boolean checkDiagonal(String[][] grid, String s) {
		int occurrence = 0;
		int x = 0;
		int y = 0;
		while (x < grid[0].length && y < grid.length) {
			if (grid[y][x].contains(s)) 
		    	occurrence++;
			if (occurrence == 3)
				return true;
			x++;
			y++;
		}
		x = 0;
		y = grid.length - 1;
		while (x < grid[0].length && y >= 0) {	
			if (grid[y][x].contains(s)) 
				occurrence++;
			if (occurrence == 3) 
				return true;
			y--;
			x++;
		}
	
		return false;
	}
}
