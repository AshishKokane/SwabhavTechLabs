package com.aurionpro.test;

import java.util.Scanner;

public class BookCricket {

	public static void main(String[] args) {

		System.out.println("1. Welcome To Cricket Game");
		System.out.println("2. Player 1 opens the book to read a page number (Randomly generated)");
		System.out.println("3. Total score of a player = page number % 7 (number % 7 will always be between 0 - 6)");
		System.out
				.println("4. Player 1 continues and keeps adding to the score untill page number results in a 0 score");
		System.out.println("5. Player 2 starts the game and tries to beat the score of player 1");
		System.out.println("6. In case of a tie, check the number of turns(player with lesser turns is winner");
		System.out.println("7. Press 1 to Open Book Page !");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 To Start The Game and 0 to Exit");
		int start = sc.nextInt();
		if (start == 1)
			batting(start);

		else
			System.out.println("Game Exited !");

	}

	public static int batting(int start1) {

		Scanner sc = new Scanner(System.in);
		int rounds = 1;

		int start = start1;
		while (start == 1)

		{

			Scanner sc1 = new Scanner(System.in);

			System.out.print("Enter Player 1 Name:");
			String player1 = sc1.nextLine();

			System.out.println();
			System.out.print("Enter Player 2 Name:");
			String player2 = sc1.nextLine();
			System.out.println();

			System.out.println("Player : " + player1);

			int n = 1, points, turns = 0, score = 0;
			while (n == 1 && rounds <= 12) {

				System.out.print("Press 1 to Open Book: ");

				Scanner sc11 = new Scanner(System.in);
				n = sc11.nextInt();

				if (n != 1) {
					System.out.println("Input not 1 enter 1 ");
					System.out.print("Press 1 to Open Book: ");

					Scanner sc111 = new Scanner(System.in);
					n = sc111.nextInt();

				}

				int a = (int) (Math.random() * (300 - 0 + 1) + 0);

				points = a % 7;

				if (points != 0 && rounds <= 12) {
					score = score + points;
					turns++;

					System.out.println(
							"Page Number: " + a + "  Points: " + points + "  score: " + score + "  Ball: " + rounds);
					// System.out.println("****************************************");
					rounds++;
				}

				if (rounds > 12) {
					batting2(player1, player2, score, turns);
					break;

				}

				if (points == 0) {

					turns++;
					System.out.println(
							"Page Number: " + a + "  Points: " + points + "  score: " + score + "  Ball: " + rounds);
					System.out.println(" OOPS              !!!           !!!        ");
					System.out.println(player1 + " Total score: " + score);
					System.out.println(player1 + " Takes " + turns + " Rounds");
					rounds++;
					batting2(player1, player2, score, turns);
					break;

				}

			}

			break;

		}

		System.out.println("Game Over");
		return 0;

	}

	static void batting2(String player1, String player2, int player1score, int player1turns) {

		int points, player2score = 0, player2turn = 0, rounds = 0;
		int finalscore = player1score + 1;
		System.out.println("****************************************");
		System.out.println("Player : " + player2);
		System.out.println(player2 + " Needs " + finalscore + " Score" + " In 12" + " Rounds to WIN MATCH ");

		int n1 = 1;
		while (n1 == 1 && rounds <= 12) {

			int a = (int) (Math.random() * (300 - 0 + 1) + 0);

			points = a % 7;
			rounds++;

			if (points != 0 && player2score <= player1score && rounds <= 12) {

				System.out.print("Press 1 to Open Book: ");

				Scanner sc = new Scanner(System.in);
				n1 = sc.nextInt();

				if (n1 != 1) {
					System.out.println("Game stopped as input not 1");
					System.out.print("Press 1 to Open Book: ");

					Scanner sc1 = new Scanner(System.in);
					n1 = sc1.nextInt();
				}

				player2turn++;
				player2score = player2score + points;

				System.out.println(
						"Page Number: " + a + "  Points: " + points + "  score: " + player2score + "  Balls " + rounds);

				if (player2score > player1score) {

					System.out.println(player2 + " Wins The Match !!");
					System.out.println(player2 + " Took Rounds :" + player2turn);
					break;

				}
			}

			else {

				player2turn++;
				player2score = player2score + points;

				System.out.print("Press 1 to Open Book: ");

				Scanner sc = new Scanner(System.in);
				n1 = sc.nextInt();

				System.out.println(
						"Page Number: " + a + "  Points: " + points + "  score: " + player2score + "  Balls " + rounds);

				if (player2score < player1score && points == 0 && rounds <= 12) {

					System.out.println(" OOPS              !!!           !!!        ");
					System.out.println(player1 + " Wins the Game ");
					break;
				}
				if (player2score > player1score && points == 0 && rounds <= 12) {
					System.out.println(" OOPS              !!!           !!!        ");
					System.out.println(player2 + " Wins the Game ");

				}

				if (player2score == player1score && points == 0) {

					if (player2turn > player1turns) {
						System.out.println(" * Game tied *");
						System.out.println(player1 + " Wins the Game as he took less rounds");
						break;
					}

					if (player2turn == player1turns) {
						System.out.println("*** D R A W ****");
						break;
					}
					if (player2turn > player1turns) {
						System.out.println(" ** Game tied **");
						System.out.println(player2 + " Wins the Game as he took less rounds");
						break;
					}

				}
			}

		}

		System.out.println("****************************************");
	}

}
