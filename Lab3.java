import java.util.Scanner;

public class Lab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Learn your squares and cubes!");
		Scanner sc = new Scanner(System.in);
		String yesOrNo;
		do
		{
			
			System.out.println("Enter an integer");
			int lastnum = sc.nextInt();
			System.out.println("Number" + "\t\t\t" + "Squared" + "\t\t\t" + "Cubed");
			System.out.println("======" +  "\t\t\t" + "=======" + "\t\t\t" + "======");
			
			for (int i=1;i <= lastnum; i++)
			{
				int sq = i * i; 
				int cb = i * i * i;
				System.out.println(i + "\t\t\t" + sq + "\t\t\t" + cb);
			}
			System.out.println("Do you want to continue?");
			 yesOrNo = sc.next();
			
			
		} while (yesOrNo.equals("y"));
		sc.close();
	}

}
