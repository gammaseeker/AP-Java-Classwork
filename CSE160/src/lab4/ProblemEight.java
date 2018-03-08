package lab4;

public class ProblemEight {

	public static void main(String[] args) {
		int[][] board = new int[3][3];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = (int)(Math.random() * 2);
			}
		}
		
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println("");
		}
		
		checkRows(board);
		checkCol(board);
		checkMajorDiag(board);
		checkMinorDiag(board);
	}
	
	public static void checkRows(int[][] board) {
		boolean all = true;
		for(int i = 0; i < board.length; i++) {
			int num = board[i][0];
			all = true;
			for(int j = 0; j < board[i].length; j++) {
				if(board[i][j] != num) {
					all = false;
					break;
				}
			}
			if(all) {
				System.out.println("All " + num + "'s on row " + (i+1));
				all = false;
			}
			
		}
	}
	
	public static void checkCol(int[][] board) {
		boolean all = true;
		for(int i = 0; i < board.length; i++) {
			int num = board[i][0];
			all = true;
			for(int j = 0; j < board.length; j++) {
				if(board[j][i] != num) {
					all = false;
					break;
				}
			}
			if(all) {
				System.out.println("All " + num + "'s on column " + (i+1));
			}
		}
	}
	
	public static void checkMajorDiag(int[][] board) {
		boolean all = true;
		for(int i = 0; i < board.length; i++) {
			int num = board[0][0];
			if(board[i][i] != num) {
				all = false;
				break;
			}
				
		}
		if(all) {
			System.out.println("All " + board[0][0] + "'s on the major diagonal");
		}
	}
	
	public static void checkMinorDiag(int[][] board) {
		boolean all = true;
		for(int i = 0; i < board.length; i++) {
			int num = board[0][board.length - 1];
			if(board[i][board.length-i-1] != num) {
				all = false;
				break;
			}
		}
		if(all) {
			System.out.println("All " + board[0][board.length-1] + "'s on the minor diagonal");
		}
	}
}
