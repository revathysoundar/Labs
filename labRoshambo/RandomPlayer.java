package labRoshambo;

import java.util.Random;

public class RandomPlayer extends Player {

	private Random rand;
	
	
	public RandomPlayer(String playerName) {
		super(playerName);
		this.rand = new Random();
	}
	
	public Roshambo generateRoshambo()
	{
		int choice = 1 + rand.nextInt(3);
		switch(choice)
		{
		case 1 : return Roshambo.ROCK;
		case 2 : return Roshambo.PAPER;
		}
		return Roshambo.SCISSORS;
	}


	
}
