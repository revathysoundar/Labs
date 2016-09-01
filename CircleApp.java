import java.util.InputMismatchException;
import java.util.Scanner;

public class CircleApp {

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
			double circum = circle.getCircumference();
			double area = circle.getArea();
			
			System.out.println("Circumference: "+ circle.getFormattedCircumference());
			System.out.println("Area: "+ circle.getFormattedArea());
			System.out.println("Do you want to continue: Enter y/n");
			ch = sc.next();
		
		}
		Circle circle1 = new Circle();
		
		System.out.println("Goodbye!" + "You have created to " + Circle.getObjectCount() + " Circle objects.");
		
		
		
		sc.close();
		
		
		
		
			
	}
}


