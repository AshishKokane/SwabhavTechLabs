package com.aurionpro.test;

import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {

		System.out.println("1. Welcome To Cricket Game");
		System.out.println("2. Player 1 opens the book to read a page number (Randomly generated)");
		System.out.println("3. Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)");
		System.out.println("4. Player 1 continues and keeps adding to the score untill page number results in a 0 score");
		System.out.println("5. Player 2 starts the game and tries to beat the score of player 1");
		System.out.println("6. In case of a tie, check the number of turns(player with lesser turns is winner");
		System.out.println("7. Press 1 to Open Book Page !");

		int r = batting();

		System.out.println("GAME OVER");

	}

	public static int batting() {

		int restart = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1 To Start The Game and 0 to Exit");
		restart = sc.nextInt();
		while (restart != 0)

		{

			Scanner sc1 = new Scanner(System.in);

			System.out.print("Enter Player 1 Name:");
			String player1 = sc1.nextLine();

			System.out.println();
			System.out.print("Enter Player 2 Name:");
			String player2 = sc1.nextLine();
			System.out.println();

			System.out.println("Player : " + player1);

			int n, points, turns = 0, score = 0;
			do {

				System.out.print("Press 1 to Open Book: ");

				Scanner sc11 = new Scanner(System.in);
				n = sc11.nextInt();

				if (n != 1) {
					System.out.println("Input not 1 game stopped");
					break;
				}

				int a = (int) (Math.random() * (300 - 0 + 1) + 0);

				points = a % 7;

				if (points != 0) {
					score = score + points;
					turns++;

					System.out.println("Page Number: " + a + "  Points: " + points + "  score: " + score);
					// System.out.println("****************************************");
				}

				else {

					turns++;
					System.out.println("Page Number: " + a + "  Points: " + points + "  score: " + score);
					System.out.println(" OOPS              !!!           !!!        ");
					System.out.println(player1 + " Total score: " + score);
					System.out.println(player1 + " Takes " + turns + " Rounds");

					batting2(player1, player2, score, turns);
					break;

				}

			} while (n == 1);

			System.out.println("Enter 1 To Start The Game and 0 to Exit");
			restart = sc.nextInt();

		}

		System.out.println("Game Exited");

		return 0;

	}

	static void batting2(String player1, String player2, int score, int turns) {

		int points, player2score = 0, player2turn = 0;
		int finalscore = score + 1;
		System.out.println("****************************************");
		System.out.println("Player : " + player2);
		System.out.println(player2 + " Needs " + finalscore + " Score" + " In " + turns + " Rounds to WIN MATCH ");

		int n1 = 0;
		do {

			int a = (int) (Math.random() * (300 - 0 + 1) + 0);

			points = a % 7;

			if (points != 0 && player2score <= score) {

				System.out.print("Press 1 to Open Book: ");

				Scanner sc = new Scanner(System.in);
				n1 = sc.nextInt();

				if (n1 != 1) {
					System.out.println("Game stopped as input not 1");
					break;
				}

				player2turn++;
				player2score = player2score + points;
				// System.out.println("****************************************");
				System.out.println("Page Number: " + a + "  Points: " + points + "  score: " + player2score
						+ "  Rounds " + turns--);

				if (player2score > score) {

					System.out.println(player2 + " Wins The Match !!");
					System.out.println(player2 + " Took Rounds :" + player2turn);
					batting();

				}
			}

			else {

				System.out.print("Press 1 to Open Book: ");

				Scanner sc = new Scanner(System.in);
				n1 = sc.nextInt();

				System.out.println("Page Number: " + a + "  Points: " + points + "  score: " + player2score
						+ "  Rounds " + turns--);

				if (player2score < score && points == 0) {

					System.out.println(" OOPS              !!!           !!!        ");
					System.out.println(player1 + " Wins the Game ");
					break;
				}

				if (player2score == score && points == 0) {

					if (player2turn > turns) {
						System.out.println(" * Game tied *");
						System.out.println(player1 + " Wins the Game as he took less rounds");
						batting();
					}

					if (player2turn == turns) {
						System.out.println("*** D R A W ****");
						batting();
					}

					else {
						System.out.println(" ** Game tied **");
						System.out.println(player2 + " Wins the Game as he took less rounds");
						batting();
					}

				}
			}

		} while (n1 == 1);

		System.out.println("****************************************");

		batting();
	}

}
