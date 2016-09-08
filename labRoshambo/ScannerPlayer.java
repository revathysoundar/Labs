
package labRoshambo;

import java.util.Scanner;

public class ScannerPlayer extends Player {

	public ScannerPlayer(String playerName)
	{
		super(playerName);
	}
		public Roshambo generateRoshambo()
	{
		System.out.println("Rock, Paper or Scissors? (R/P/S)");
		
		Scanner sc = new Scanner(System.in);
		char userMove = sc.nextLine().toUpperCase().charAt(0);
		switch(userMove){
		case 'R' : return Roshambo.ROCK;
		case 'P' : return Roshambo.PAPER;
		case 'S' : return Roshambo.SCISSORS;
			
		}
		
		System.out.println("Invalid choice");
		return generateRoshambo();
		
	}

	
}
