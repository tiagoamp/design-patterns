package structural.facade;

import java.util.List;

public class UniverseFacade {

	private PlanetCreator planetCreator = new PlanetCreator();
	private StarCreator starCreator = new StarCreator();
	private AlienCreator alienCreator = new AlienCreator();
	
	
	public String createParallelUniverse() {
		List<String> planets = planetCreator.createPlanets(5);
		List<String> stars = starCreator.createStars(10);
		List<String> aliens = alienCreator.createAliens(100);
		
		String planetsAsStr = planets.stream().reduce((x,y) -> x + "," + y).get();
		String starsAsStr = stars.stream().reduce((x,y) -> x + "," + y).get();
		String aliensAsStr = aliens.stream().reduce((x,y) -> x + "," + y).get();
		
		return "Universe" + " - " + planetsAsStr + " - " + starsAsStr + " - " + aliensAsStr;
	}
		
}
