
import java.util.Scanner;




public class Lab1 {

	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
		
		String choice = "y";
		
		
		do {
			
		
		System.out.println("Enter Length");
		int length = scanner.nextInt();
		
		System.out.println("Enter Width");
		int width = scanner.nextInt();
		
		int perimeter = 2 * ( length + width);
		
		int area = length * width;
		
		
		
		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
		
		
		//Decimal Part
		
		System.out.println("Enter Decimal Length");
		float length1 = scanner.nextFloat();
		
		System.out.println("Enter Decimal Width");
		float width1 = scanner.nextFloat();
		
		float perimeter1 = 2 * ( length1 + width1);
		
		float area1 = length1 * width1;
		
		System.out.println("Decimal Area : " + area1);
		System.out.println("Decimal Perimeter : " + perimeter1);
		
		System.out.println("Do you want to continue? Y/N ");
		choice = scanner.next();
		System.out.println();	
		}while(choice.equalsIgnoreCase("y"));
		scanner.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
