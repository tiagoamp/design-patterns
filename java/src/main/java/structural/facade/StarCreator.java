package structural.facade;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StarCreator {

	private Random random = new Random();
	
	public List<String> createStars(int quantity) {
		List<String> starsNames = new ArrayList<>();
		for(int i=0; i< quantity; i++) {
			starsNames.add( "Star_" + random.nextInt(100) );
		}
		return starsNames;
	}
	
}
