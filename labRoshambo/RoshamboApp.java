package labRoshambo;
import java.util.Scanner;

public class RoshamboApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int wins = 0;
		int loses = 0;
		int noOfGames = 0;
		int ties = 0;
		String ch = "y";
		System.out.println("Welcome to Rock, Paper, Scissors");
		System.out.println("Enter Your Name");
		String playerName = sc.next();
		Player mainPlayer = new Player(playerName);
		mainPlayer.setPlayerName(playerName);
		Player opponentPlayer;
		
		System.out.println("Would you like to play against Red or Blue(R/B)");
		char opponentPlayer1 = sc.next().toUpperCase().charAt(0);
		char quit =' ';
		while (quit != 'n')
		{
		
		ScannerPlayer userPlayer = new ScannerPlayer(playerName);
		Roshambo userChoice = userPlayer.generateRoshambo();
		Roshambo opponentChoice = null; 
		String opponentName = "";
		
		switch(opponentPlayer1)
		{
			case 'R' : 
						opponentName = "RED";
						opponentPlayer = new RockPlayer(opponentName);
						opponentChoice = opponentPlayer.generateRoshambo();
						break;
						
			case 'B' : 					
						opponentName = "BLUE";
						opponentPlayer = new RandomPlayer(opponentName);
						opponentChoice = opponentPlayer.generateRoshambo();
						break;
						
		}
		System.out.println(userPlayer.getPlayerName() + " : " + userChoice );
		System.out.println(opponentName + " : " + opponentChoice);
		
		 if(opponentChoice == userChoice)
		 {
			 System.out.println("Draw!");
			 ties++;
			 noOfGames++;
		 }
		 else if(opponentChoice == Roshambo.PAPER & userChoice == Roshambo.ROCK)
		 {
			 System.out.println(playerName + " Lost");
			 loses++;
			 noOfGames++;
		 }
		 else if(opponentChoice == Roshambo.SCISSORS & userChoice == Roshambo.ROCK)
		 {
			 System.out.println(playerName + " Wins!");
			 noOfGames++;
			 wins++;
		 }
		 else if(opponentChoice == Roshambo.ROCK & userChoice == Roshambo.PAPER)
		 {
			 System.out.println(opponentName + " Wins!");
			 wins++;
			 noOfGames++;
		 }
		 
		 else if(opponentChoice == Roshambo.SCISSORS & userChoice == Roshambo.PAPER)
		 {
			 
			 System.out.println(opponentName +" Lost");
			 noOfGames++;
			 loses++;
		 }
		 else if(opponentChoice == Roshambo.PAPER & userChoice == Roshambo.SCISSORS)
		 {
			 System.out.println(opponentName + " Wins!");
			 wins++;
			 noOfGames++;
		 }
		 else if(opponentChoice == Roshambo.ROCK & userChoice == Roshambo.SCISSORS)
		 {
			 System.out.println(opponentName +" Lost");
			 noOfGames++;
			 loses++;
		 }
		System.out.println("Play Again? (y/n)");
		quit = sc.next().charAt(0);
		}
		
		System.out.println("Number of games you played : " + noOfGames + "\nWins : " + wins + "\nLoses : " + loses
				+ "\n"
				+ "Draw : " + ties);
		System.out.println("GoodBye!");
		sc.close();
	
	}
	
	

}
