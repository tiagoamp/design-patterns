package behavioral.strategy;

public class Fighter {

	private IAttack attack;
			
	public Fighter(IAttack attackStrategy) {
		this.attack = attackStrategy;
	}
		
	public String attack() {
		return attack.execute();
	}
		
}
