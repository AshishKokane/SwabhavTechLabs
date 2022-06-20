package com.aurionpro.test1;

import java.util.Random;
import java.util.Scanner;

public class PigDice {

	public static void main(String[] args) {

		int sum = 0, turn = 0, turnscore = 0;

		System.out.println("PIG DICE GAME");
		System.out.println("* See how many turns it takes you to get to 20");
		System.out.println("* Turn ends when you hold or roll a 1");
		System.out.println("* If you roll a 1, you lose all points for the turn");
		System.out.println("* if you hold, you save all points for the turn");

		char ch;
		int dice = 0;

		while (sum < 20) {

			turn++;
			turnscore = 0;
			dice = 0;

			System.out.println("\nTURN " + turn);
			System.out.println("-----------------------");

			while (dice != 1) {

				System.out.println("Roll or Hold?(r/h)");
				Scanner sc = new Scanner(System.in);
				ch = sc.next().charAt(0);

				if (ch == 'r') {
					Random random = new Random();
					dice = 1 + random.nextInt(6);
					System.out.println("Die: " + dice);

					turnscore = dice + turnscore;

					if (dice == 1) {
						// System.out.println("Die: " + dice);
						System.out.println("Turn Over. No Score");

					}
				}

				else if (ch == 'h') {
					// System.out.println("Die: " + dice);

					sum = sum + turnscore;
					System.out.println("Score For Turn : " + turnscore);
					System.out.println("Total Score " + sum);
					// turnscore=0;
					break;
				}

				else {
					System.out.println("Please Enter r/h ");
				}

			}

		}

		System.out.println("\nYou finished in " + turn + " turns!");
		System.out.println("\n You Wins");

	}

}
