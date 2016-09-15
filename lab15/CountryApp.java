package lab15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int menuChoice;
		
		System.out.println("Welcome to the Countries Maintenance Application!");
		String addCountry;
		CountriesTextFile country = new CountriesTextFile();
		List<String> countryList = new ArrayList<>();
		String ch = "y";
		while(ch.equalsIgnoreCase("y"))
		{
			
			System.out.println("1 - See the list of Countries");
			System.out.println("2 - Add a Country");
			System.out.println("3 - Exit");
			System.out.println("Enter menu number: ");
			menuChoice = sc.nextInt();
		switch(menuChoice)
		{
			case 1:	countryList = country.readFromCountryFile();
					for(String str : countryList)
						System.out.println(str);
					break;
			case 2: System.out.println("Entry Country");				
					addCountry = sc.next();
					countryList.add(addCountry);
					country.writeIntoCountryFile(countryList);
					System.out.println("This country has been saved");
					break;
			case 3: ch = "n";
					sc.close();
					break;
		}
		
		
		}
		
	}

}
