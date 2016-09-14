package baseball;
import java.util.ArrayList;


public class BatterClass {
	
	
	public String playerName;
	ArrayList<Integer> listOfAtBats = new ArrayList<> ();
	int sin=0, doub=0, trip=0 , home=0, out=0, hits = 0,noOfAttempts;
	double average;
	double percent;
	
	
	public BatterClass(String pName)
	{
		this.playerName = pName;
	}
	
	
	
	public ArrayList<Integer> getListOfAtBats() {
		return listOfAtBats;
	}



	public void setListOfAtBats(ArrayList<Integer> listOfAtBats) {
		this.listOfAtBats = listOfAtBats;
	}



	public String getPlayerName() {
		return playerName;
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public double calculateBatAvg()
	{
		noOfAttempts = listOfAtBats.size();
		for(Integer bases : listOfAtBats)
		{
			
			switch(bases)
			{
			case 0 : out = bases;break;
			case 1 : sin += bases;hits++;break;
			case 2 : doub += bases;hits++;break;
			case 3 : trip += bases;hits++;break;
			case 4 : home += bases;hits++;break;
			}
		}
		 average = (double)(hits) / (double)(noOfAttempts) ;
		
		return average;
		
	}
	
	public double calculateSlugPer()
	{
		
		 percent = ((double)sin + (double)doub + (double)trip + (double)home)/(double)listOfAtBats.size();
		
		return percent;
	}
	
	public String getFormattedAverage()
	{
		calculateBatAvg();
		return formatNumber(average);
	}
	
	public String getFormattedSlugPercent()
	{
		calculateSlugPer();
		return formatNumber(percent);
	}
	public String formatNumber(double result)
	{
		return String.format("%.3f", result);
	}
	
	public String getBattingAverage(int hits, int attempts)
	{
		double average =  (double)hits/(double)attempts;
		String avg = String.format("%.3f", average);
		return avg;
	}

}
