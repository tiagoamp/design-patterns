package behavioral.strategy;

@FunctionalInterface
public interface IAttack2 {

	String execute();
	
	
	static IAttack2 hadoken() {
		return () -> "hadooookeennnnn!!!!";
	}
	
	static IAttack2 shoryuken() {
		return () -> "shoryuuuuuuukeeeennnnnnn!!!!";
	}
	
	
}
