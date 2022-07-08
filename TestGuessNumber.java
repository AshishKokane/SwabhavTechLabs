package com.aurionpro.model;

import java.util.Scanner;

public class TestGuessNumber {

	public static void main(String[] args) {

		GuessNumber gnumber = new GuessNumber();
		System.out.println("You Have 6 attempts to Guess the Number!!");

		// System.out.println(gnumber.getGuessNumber());

		int attempts = 0;
		while (attempts < 6 && gnumber.getGuessNumber() != gnumber.getUserNumber()) {

			startGame(gnumber);
			attempts += 1;
		}
		System.out.println("Number to be guessed was:- " + gnumber.getGuessNumber());
		System.out.println("game over");

	}

	private static void startGame(GuessNumber gnumber) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Guess the Number :-");
		gnumber.setUserNumber(sc.nextInt());
		System.out.println(gnumber.isCorrectGuess());

	}

}
