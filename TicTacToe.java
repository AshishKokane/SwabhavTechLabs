package com.aurionpro.model;

import java.util.Scanner;

public class TicTacToe {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		char[][] gameBoard = { { '1', '|', '2', '|', '3' }, { '4', '|', '5', '|', '6' }, { '7', '|', '8', '|', '9' } };

		boolean gameOver = false;
		printgameBoard(gameBoard);

		System.out.println("Welcome to Tic Tac Toe!!");

		while (!gameOver) {

			player1move(gameBoard);
			gameOver = isGameOver(gameBoard);
			if (gameOver) {
				break; // check if player 1 wins to end loop
			}

			player2move(gameBoard);
			gameOver = isGameOver(gameBoard);
			if (gameOver) {
				break; // check if player 2 wins to end loop
			}
		}

	}

	private static boolean isGameOver(char[][] gameBoard) {

		if (isPlayerWinner(gameBoard, 'X')) {
			System.out.println("---------------------");
			System.out.println("***Player  1  wins!***");
			printgameBoard(gameBoard);
			return true;
		}

		if (isPlayerWinner(gameBoard, 'O')) {
			System.out.println("---------------------");

			System.out.println("***Player  2  wins!***");
			printgameBoard(gameBoard);
			return true;
		}

		if (gameBoard[0][0] != '1' && gameBoard[0][2] != '2' && gameBoard[0][4] != '3' && gameBoard[1][0] != '4'
				&& gameBoard[1][2] != '5' && gameBoard[1][4] != '6' && gameBoard[2][0] != '7' && gameBoard[2][2] != '8'
				&& gameBoard[2][4] != '9') {
			System.out.println("Its a tie");
			return true;
		}

		return false;
	}

	private static boolean isPlayerWinner(char[][] gameBoard, char symbol) {

		if ((gameBoard[0][0] == symbol && gameBoard[0][2] == symbol && gameBoard[0][4] == symbol) // 1st row
				|| (gameBoard[1][0] == symbol && gameBoard[1][2] == symbol && gameBoard[1][4] == symbol) // 2nd row

				|| (gameBoard[2][0] == symbol && gameBoard[2][2] == symbol && gameBoard[2][4] == symbol) // 3rd row

				|| (gameBoard[0][0] == symbol && gameBoard[1][0] == symbol && gameBoard[2][0] == symbol)// 1st column
				|| (gameBoard[0][2] == symbol && gameBoard[1][2] == symbol && gameBoard[2][2] == symbol)// 2nd column
				|| (gameBoard[0][4] == symbol && gameBoard[1][4] == symbol && gameBoard[2][4] == symbol)// 3rd column
				|| (gameBoard[0][0] == symbol && gameBoard[1][2] == symbol && gameBoard[2][4] == symbol)// 1st diagonal
				|| (gameBoard[0][4] == symbol && gameBoard[1][2] == symbol && gameBoard[2][0] == symbol)) // 2nd
																											// diagonal

		{

			return true; // return true if forms ### pair
		}

		return false; // return false no #### pair
	}

	private static void player2move(char[][] gameBoard) {
		System.out.println("Player 2 Please select a Position for 'O'. (1-9)");
		int position = input.nextInt();

		boolean valid = isValidPosition(position, gameBoard);

		while (!valid) {
			System.out.println("Invalid Position. Re-enter Position: ");
			position = input.nextInt();

			valid = isValidPosition(position, gameBoard);
		}

		System.out.println("Player 2 entered at position: " + position);

		updateBoard(position, 2, gameBoard);

	}

	private static void player1move(char[][] gameBoard) {

		System.out.println("Player 1 Please select a Position for 'X'. (1-9)");
		int position = input.nextInt();

		boolean valid = isValidPosition(position, gameBoard);

		while (!valid) {
			System.out.println("Invalid Position. Re-enter Position: ");
			position = input.nextInt();

			valid = isValidPosition(position, gameBoard);
		}

		System.out.println("Player 1 entered at position: " + position);

		updateBoard(position, 1, gameBoard);

	}

	private static boolean isValidPosition(int position, char[][] gameBoard) {

		switch (position) {

		case 1:
			if (gameBoard[0][0] == '1')
				return true;
			else
				return false;

		case 2:
			if (gameBoard[0][2] == '2')
				return true;
			else
				return false;

		case 3:
			if (gameBoard[0][4] == '3')
				return true;
			else
				return false;

		case 4:
			if (gameBoard[1][0] == '4')
				return true;
			else
				return false;

		case 5:
			if (gameBoard[1][2] == '5')
				return true;
			else
				return false;

		case 6:
			if (gameBoard[1][4] == '6')
				return true;
			else
				return false;

		case 7:
			if (gameBoard[2][0] == '7')
				return true;
			else
				return false;

		case 8:
			if (gameBoard[2][2] == '8')
				return true;
			else
				return false;

		case 9:
			if (gameBoard[2][4] == '9')
				return true;
			else
				return false;

		}

		return false;
	}

	private static void updateBoard(int position, int player, char[][] gameBoard) {

		char symbol;

		if (player == 1)
			symbol = 'X';
		else
			symbol = 'O';

		switch (position) {

		case 1:
			gameBoard[0][0] = symbol;
			printgameBoard(gameBoard);
			break;

		case 2:
			gameBoard[0][2] = symbol;
			printgameBoard(gameBoard);
			break;

		case 3:
			gameBoard[0][4] = symbol;
			printgameBoard(gameBoard);
			break;

		case 4:
			gameBoard[1][0] = symbol;
			printgameBoard(gameBoard);
			break;

		case 5:
			gameBoard[1][2] = symbol;
			printgameBoard(gameBoard);
			break;

		case 6:
			gameBoard[1][4] = symbol;
			printgameBoard(gameBoard);
			break;

		case 7:
			gameBoard[2][0] = symbol;
			printgameBoard(gameBoard);
			break;

		case 8:
			gameBoard[2][2] = symbol;
			printgameBoard(gameBoard);
			break;

		case 9:
			gameBoard[2][4] = symbol;
			printgameBoard(gameBoard);
			break;

		default:
			break;
		}

	}

	private static void printgameBoard(char[][] gameBoard) {

		for (char[] row : gameBoard) {

			for (char c : row) {
				System.out.print(c);
			}
			System.out.println();

		}
	}

}
