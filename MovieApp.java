import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Welcome to the Movie List Application!");
		System.out.println("There are 10 movies in this List");
		Scanner sc = new Scanner(System.in);
		String choice;
		
		do
		{
		System.out.println("What category are you interested in? Select from Animated, Drama, Horror, Scifi");
		
		
		String category = sc.next();
		
		
		ArrayList <Movie> list = new ArrayList <Movie>();
		list.add(new Movie("Friday the 13th" ,"horror"));
		list.add(new Movie("A space odyssey","scifi"));
		list.add(new Movie("Me before you","Drama"));
		list.add(new Movie("The lion king","Animated"));
		list.add(new Movie("Saw","horror"));
		
		
		int flag = 0;
		for(Movie m : list)
		{
			
			if(category.equalsIgnoreCase(m.getCategory())){
								
				System.out.println(m.getTitle());
				 flag = 1;
				}
				
				
				
			}
		if(flag == 0)
			System.out.println("Invalid Category");
			
		
		
		
		
		System.out.println("Do you want to continue? y/n");
		 choice = sc.next();
	}while(choice.equalsIgnoreCase("y"));
		
		sc.close();
	}

}
