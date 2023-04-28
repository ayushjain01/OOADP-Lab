package abstractFactoryDesignPattern;

public class DiffAbledSportsFactory implements SportsCategoryFactory{
	@Override 
	public OutdoorAdventureSports getOutdoorAdventureSports(String name) { 
		if(name.equalsIgnoreCase("Bungee Jumping")) 
			return new BungeeJumpingDiffAbled(); 
		else if(name.equalsIgnoreCase("Paragliding")) 
			return new ParaglidingDiffAbled(); 
		else if(name.equalsIgnoreCase("Trekking")) 
			return new TrekkingDiffAbled(); 
		else 
			return null; 
	} 
	 
	@Override 
	public OutdoorRegularGames getOutdoorRegularGames() { 
		return new CricketDiffAbled(); 
	 } 
	 
	@Override 
	public IndoorRegularGames getIndoorRegularGames() { 
		return new TableTennisDiffAbled(); 
	 }
}
