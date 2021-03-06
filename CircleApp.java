import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {
	static int count;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to the Circle Tester");
		
		Scanner sc = new Scanner(System.in);
		String ch = "y";
		double radius = 0.0;
		while(ch.equalsIgnoreCase("y"))
		{
		
			try{	
				System.out.println("Enter radius");
				radius = sc.nextDouble();
			
			}catch(InputMismatchException ex){
					System.out.println("Invalid data");
					sc.next();
					continue;
			}
			
			Circle circle = new Circle(radius);
			
			System.out.println("Circumference: "+ circle.getFormattedCircumference());
			System.out.println("Area: "+ circle.getFormattedArea());
			System.out.println("Do you want to continue: Enter y/n");
			ch = sc.next();
			count = Circle.getObjectCount();
		}
		System.out.println("Goodbye!" + "You created "  + count +" Circle object(s).");
		sc.close();
			
	}
}


