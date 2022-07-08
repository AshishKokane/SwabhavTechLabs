package com.aurionpro.model;

import java.util.Random;

public class GuessNumber {

	private int guessNumber;
	private int userNumber;

	public GuessNumber() {
		super();
		this.guessNumber = guessNumberGenerator();
		this.userNumber = 0;

	}

	public int getGuessNumber() {
		return guessNumber;
	}

	public void setGuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public int getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(int userNumber) {
		this.userNumber = userNumber;
	}

	public int guessNumberGenerator() {

		Random random = new Random();

		int noGenerated = 1 + random.nextInt(100);
		return noGenerated;
	}

	public String isCorrectGuess() {

		if (this.getGuessNumber() > this.getUserNumber())
			return "Number To Low";

		if (this.getGuessNumber() == this.getUserNumber())
			return "You Win";

		return "Number To High";

	}

}
