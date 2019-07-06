package core;

import static org.junit.Assert.*;
import org.junit.*;

public class TicTacToeTest {

	
	@Before public void before() {
		
		TicTacToe.board[0] = "1";
		TicTacToe.board[1] = "2";
		TicTacToe.board[2] = "3";
		TicTacToe.board[3] = "4";
		TicTacToe.board[4] = "5";
		TicTacToe.board[5] = "6";
		TicTacToe.board[6] = "7";
		TicTacToe.board[7] = "8";
		TicTacToe.board[8] = "9";
	}
	
	@Test public void test_O() {
		
		TicTacToe.board[0] = "O";
		TicTacToe.board[1] = "O";
		TicTacToe.board[2] = "O";
		
		assertEquals("Not correct", "O", TicTacToe.checkWinner());
	
	}
	
@Test public void test_X() {
		
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "X";
		TicTacToe.board[2] = "X";
		
		assertEquals("Not correct", "X", TicTacToe.checkWinner());
		
}
		
	@Test public void draw() {
		
		TicTacToe.board[0] = "X";
		TicTacToe.board[2] = "X";
		TicTacToe.board[3] = "X";
		TicTacToe.board[4] = "X";
		TicTacToe.board[7] = "X";
		TicTacToe.board[1] = "O";
		TicTacToe.board[5] = "O";
		TicTacToe.board[6] = "O";
		TicTacToe.board[8] = "O";
		
		assertEquals("Not Correct", "draw", TicTacToe.checkWinner());
	}
	
	@Test public void test() {
		
		TicTacToe.turn = "X";
		TicTacToe.board[0] = "X";
		TicTacToe.board[1] = "O";
		
		assertEquals("Not correct", null, TicTacToe.checkWinner());
	}
}
