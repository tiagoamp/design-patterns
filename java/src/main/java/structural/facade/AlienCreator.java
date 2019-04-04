package structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class AlienCreator {

	private Random random = new Random();
	
	public List<String> createAliens(int quantity) {
		List<String> aliensNames = new ArrayList<>();
		for(int i=0; i< quantity; i++) {
			aliensNames.add( "Alien_" + random.nextInt(1000) );
		}
		return aliensNames;
	}
	
}
