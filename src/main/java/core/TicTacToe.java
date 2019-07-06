package core;

import java.util.*;

public class TicTacToe {

	static Scanner in;
	static String[] board = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};
	static String turn, winner;
	
	static void printBoard() {
		
		System.out.println("|---|---|---|");
		System.out.println("| " + board[0] + " | " + board[1] + board[2] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
		System.out.println("|-----------|");
		System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
		System.out.println("|-----------|");
		System.out.println("|---|---|---|");
	}
	
	static String checkWinner() {
		
		for(int a = 0; a < 8; a++) {
			String line = null;
			
			switch(a) {
			case 0: line = board[0] + board[1] + board[2]; 
			break;
			case 1: line = board[3] + board[4] + board[5];
			break;
			case 2: line = board[6] + board[7] + board[8];
			break;
			case 3: line = board[0] + board[3] + board[6];
			break;
			case 4: line = board[1] + board[4] + board[7];
			break;
			case 5: line = board[2] + board[5] + board[8];
			break;
			case 6: line = board[0] + board[4] + board[8];
			case 7: line = board[2] + board[4] + board[6];
			break;
			}
			
			if(line.equals("XXX")) {
				return "X";
			}
			else if(line.equals("OOO")) {
				return "O";
			}
		}
		for(int a = 0; a < 9; a++) {
			
			if(Arrays.asList(board).contains(String.valueOf(a+1))) {
				break;
			}
			else if(a == 8) {
				return "draw";
			}
		}
			System.out.print(turn + "'s turn: ");
			return null;	
		}
	
	public static void main(String[] args) {
		in = new Scanner(System.in); turn = "X"; winner = null;
		
		System.out.println("|Tic Tac Toe|");
		printBoard();
		System.out.print("X's turn: ");
		
		while(winner == null) {
			 int p = in.nextInt();
			 
			 if(p < 0 && p >= 9) {
				 System.out.println("Invalid input"); continue;
			 }
			 else if(board[p-1].contentEquals(String.valueOf(p))) {
				 board[p-1] = turn;
				 
				 if(turn.contentEquals("X")) {
					 turn = "O";
				 }
				 else {
					 turn = "X";
				 }
				 printBoard(); winner = checkWinner();
			 }
			 else {
				 System.out.print("Slot already taken: "); 
				 continue;
			 }
		}
		if(winner.contentEquals("draw")) {
			
			System.out.println("It's a draw!");
		}

		else {
			System.out.println(winner + "'s won!");
		}
	}
}
