import java.util.Scanner;
import java.lang.String;

public class Lab6 {

	public static void main(String[] args) {
		// TODO Write this code. You will have a loop and call translateWord from here.
		Scanner sc = new Scanner(System.in);
		String choice = "";
		
		System.out.println("Welcome to the pig Latin Translator");
		
		while(! choice.equals("n"))
		{
			System.out.println("Enter a word");
			String word = sc.next();
			String pigLatinWord = translateWord(word);
			System.out.println(pigLatinWord);
			
			System.out.println("Do you want to continue (y/n)");
			choice = sc.next();
		}
		sc.close();
	}

	/**
	 * This method takes any single English word and translates it to a Pig Latin word.
	 */
	public static String translateWord(String englishWord) {
		String latinWord = "";
		// TODO Write this code
		String subString1 = "";
		String subString2 = "";
		int indexOfVowel = 0;
		
		String lowerCaseWord = englishWord.toLowerCase();
		
		char firstCharOfEnglishWord = lowerCaseWord.charAt(0);
		
		int lenOfEnglishWord = englishWord.length();
		
		if(firstCharOfEnglishWord == 'a' || firstCharOfEnglishWord == 'e' || firstCharOfEnglishWord == 'i' || firstCharOfEnglishWord == 'o'
				|| firstCharOfEnglishWord == 'u')
		{
			latinWord = lowerCaseWord.concat("way");
			return latinWord;
			
		}
		else
		{
			for(int i =0; i < lenOfEnglishWord; i++)
			{
				char getEachCharacter = lowerCaseWord.charAt(i);
				if ( getEachCharacter == 'a' || getEachCharacter == 'e' || getEachCharacter == 'i' || getEachCharacter == 'o'
						|| getEachCharacter == 'u')
				{
					 indexOfVowel = i;
					 break;
					
				}
				else
				{
					 subString1 = subString1 + getEachCharacter;
					 					
				}
								
			}
			subString2 = lowerCaseWord.substring(indexOfVowel);
			
		}
		latinWord = subString2 + subString1;
		latinWord = latinWord.concat("ay");
				
		
		return latinWord;
		
	}

}

