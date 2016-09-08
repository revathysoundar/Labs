package labRoshambo;

public class RockPlayer extends Player {
	
	public RockPlayer(String playerName)
	{
		super(playerName);
		
	}
	public String getOpponentPlayer(String playerName)
	{
		return playerName;
	}
	public Roshambo generateRoshambo()
	{
		return Roshambo.ROCK;
	}

}
