
import java.util.InputMismatchException;
import java.util.Scanner;
//import java.util.IndexOutOfException;


public class Lab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to our Java class" );
		
		
		Scanner sc = new Scanner(System.in);
		
		int[] stuIndex = new int[] {1,2,3,4,5};
		int index = 0;
		int j=0;
		String userChoice = "y";
		String[] stuName = new String[] {"Reva", "john","krafus","Sam","joe"};
		String[] stuHomeTown = new String[] {"Detroit","NewYork","connecticut","Atlanta","NorthCarolina"};
		String[] stuFavFood = new String[] {"Pizza","Cake","Choclate","Pasta","waffles"};
		System.out.println("These are the wonderful students in our class");
		for(int i = 0; i < 5 ; i++)
		{
			
				System.out.println(++j + ". " + stuName[i]);
			
		}
		
				
				System.out.println("Which Student would you like to learn more about");
				System.out.println("Enter number between 1 - 5");
				boolean success = false;
				while(!success)
				{
					try{
						 index = sc.nextInt();
						 System.out.println("Student " + stuIndex[index-1] + " is " + stuName[index-1] + ".");
							System.out.println("What would you like to know about " + stuName[index-1]
									+ "? ");
							success = true;
							
						 
					}catch (ArrayIndexOutOfBoundsException ex)
					{
						System.out.println("Student does not exist... Please try again between 1 & 5");
					}catch (InputMismatchException ex){
						System.out.println("Invalid data. Please try again between 1 - 5");
					}
				}
				
				
							
				while(userChoice.equals("y"))
				{
					String choice="";
					
						System.out.println("Enter Hometown or Favorite Food");
						
						
						
						 choice = sc.next();
						 
						if(choice.equalsIgnoreCase("hometown"))
						{
											
								System.out.println(stuName[index-1] + " is from " + stuHomeTown[index-1] 
										+ ". Would you like to know more? Enter y or n");
								
																		
						}
						else if(choice.equalsIgnoreCase("favoritefood"))
						{
							System.out.println(stuName[index-1] + " favorite food is " + stuFavFood[index-1] 
									+ ". Would you like to know more? Enter y or n");
							
							
						}
						else
						{
							System.out.println("That data does not exist. Please try again. Enter y or n");
						}
						
						
					
					userChoice = sc.next();
				}
				
						
				System.out.println("Thanks!");
				sc.close();
	
			
		}
}
		
		
		
		
	


