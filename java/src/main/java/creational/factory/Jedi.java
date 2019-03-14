package creational.factory;

public interface Jedi {
	
	default String attack() {
		return "wowwwwnnnnnn";  // imagine lightsaber sound effect here!  :-P
	}
	
	String whoAmI();
		
}
