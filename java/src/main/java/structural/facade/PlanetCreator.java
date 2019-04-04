package structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlanetCreator {

	private Random random = new Random();
		
	public List<String> createPlanets(int quantity) {
		List<String> planetsNames = new ArrayList<>();
		for(int i=0; i< quantity; i++) {
			planetsNames.add( "Planet_" + random.nextInt(100) );
		}
		return planetsNames;
	}
	
}
