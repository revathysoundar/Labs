package lab15;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountriesTextFile {

	private Path filePath;
	
	public CountriesTextFile(String filePathString)
	{
		this.filePath = Paths.get(filePathString);
	}
	
	public CountriesTextFile()
	{
		this("C:/Users/Administrator/workspace/Labs/src/lab15/countries.txt");
	}
	
	public List<String> readFromCountryFile()
	{
		List<String> countries = new ArrayList<>();
		if(!Files.exists(filePath)){
			return countries;
		}	
		
		try
		{
			File file = filePath.toFile();
			//FileReader reads text files
			FileReader fileReader = new FileReader(file);
			//FileReader is usually wrapped up in BufferedReader 
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			String line;
			
			while((line = bufferedReader.readLine()) != null)
			{
				countries.add(line);
			}
			bufferedReader.close();
			return countries;
		}catch(IOException ex)
		{
			throw new RuntimeException("Unable to read the file");
		}
		
		
	}
	
	public void writeIntoCountryFile(List<String> countryList)
	{
		
		
		try
		{
			if(!Files.exists(filePath))
				Files.createFile(filePath);
			
			File file = filePath.toFile();
			
			PrintWriter writer = new PrintWriter(
								 new BufferedWriter(
								 new FileWriter(file)),true);
			
			for(String s : countryList)
			{
				writer.println(s);
			}
				writer.flush();
				writer.close();
			
			
		}catch(IOException ex)
		{
			throw new RuntimeException("EXCEPTION :Unable to write it into the file" + ex.getMessage());
		}
		
		
	}
	
	
}
