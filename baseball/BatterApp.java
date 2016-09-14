package baseball;
import java.util.ArrayList;

import java.util.Scanner;

public class BatterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome To Average Batting Calculator");
				
		String ch = "y";
		
		while( ch.equalsIgnoreCase("y"))
		{
			
		
			System.out.println("Enter the Player's Name");
			String pName = sc.next();
			System.out.println("0 = Out, 1 = Single, 2 = Double, 3 = Triple, 4 = Home");
			
			BatterClass batter = new BatterClass(pName);
			ArrayList <BatterClass> batterList = new ArrayList<> ();
			
			batterList.add(new BatterClass(pName));
			ArrayList <Integer> listOfAtBats = new ArrayList<>();
			
			

			int i = 0;
			String ch1 ="y";
			while((i<=5) && (ch1.equalsIgnoreCase("y")))
			{
				System.out.println("Result for at-bat " + i +":");
				if(i==5)
				{
					System.out.println("Done");
					break;
				}
				int bases = sc.nextInt();
				
				
				listOfAtBats.add(bases);
				i++;
				System.out.println("Another at-bat(y/n): ");
				ch1 = sc.next();
				
			}
			
			batter.setListOfAtBats(listOfAtBats);
			
			String average = batter.getFormattedAverage();
			String slugPercent = batter.getFormattedSlugPercent();
			System.out.println("Player Name: "+ batter.getPlayerName());
			System.out.println("Batting Average: "+average);
			System.out.println("Slugging Percentage: "+slugPercent);
			
			
				
			
			System.out.println("Another Batter? (y/n)");
			ch = sc.next();
			
		}
		sc.close();
		

	}
	
}
