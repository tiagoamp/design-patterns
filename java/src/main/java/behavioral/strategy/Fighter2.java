package behavioral.strategy;

public class Fighter2 {

	private IAttack2 attack;
			
	public Fighter2(IAttack2 attackStrategy) {
		this.attack = attackStrategy;
	}
		
	public String attack() {
		return attack.execute();
	}
		
}
