import java.util.Random;
import java.util.Scanner;
//import java.util.Math;
public class Lab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!");
		String ch;
		do
		{
			System.out.println("How many sides should each die have?");
			int side = sc.nextInt();
			rollADice(side);
			rollADiceUsingMath(side);
			System.out.println("Roll Again?(y/n)");
			ch = sc.next();
			
		} while (ch.equals("y"));

		sc.close();
	}
	 
	public static void rollADice(int side)
	{
		Random dice = new Random();
		int rand1 = 1 + dice.nextInt(side);
		int rand2 = 1 + dice.nextInt(side);
		System.out.println("Random Number Generated Using Random Class");
		System.out.println("Dice1: " + rand1);
		System.out.println("Dice2: " + rand2);
	}
		
		
	public static void rollADiceUsingMath(int side)
	{
		int rand1 = (int) (Math.random() * side + 1);
		int rand2 = (int) (Math.random() * side + 1);
		System.out.println("Random Number Generated Using Math Class");
		System.out.println("Dice1: " + rand1);
		System.out.println("Dice2: " + rand2);
		
	}
	
	

}
