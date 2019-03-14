package creational.factory;

public class JediFactory {

	public static Jedi getJedi(String lightSaberColor) { // It could be any obj type, or Enum...
		Jedi jedi;
		
		switch (lightSaberColor) {
			case "green":
				jedi = new JediConsular();
				break;
			case "blue":
				jedi = new JediGuardian();
				break;
			case "yellow":
				jedi = new JediSentinel();
				break;
			default:
				throw new RuntimeException("Unrecognized lightsaber color, maybe it is a Sith disguised...");
			}
		
		return jedi;
	}
	
}