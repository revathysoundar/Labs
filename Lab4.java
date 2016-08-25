import java.util.Scanner;

public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Factorial Calculator!");
		String ch;
		do
		{
		System.out.println("Enter an integer that's greater than 0 but less than 10 : ");
		int num = sc.nextInt();
		int ans = 1;
		for(int i = 1; i<=num; i++)
		{
			
			ans = ans * i;
			
			
		}
		
		System.out.println("Factorial = " + ans);
		System.out.println("Do You want to continue Y/N");
		 ch = sc.next();
		}while(ch.equals("y"));
		
		sc.close();

	}

}
