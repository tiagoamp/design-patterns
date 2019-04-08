package behavioral.template;

public abstract class Sandwich {

	private String description;
	
	void makeSandwichTemplate() {
		String bread = takeBread();
		String meat = addMeat();
		String cheese = addCheese();
		String sauce = addSauce();
		this.description =  bread + " | " + meat + " | " + cheese + " | " + sauce + " | " + bread;		
	}

	protected abstract String addSauce();

	protected abstract String addCheese();

	protected abstract String addMeat();

	protected abstract String takeBread();
	
	
	public String getDescription() {
		return description;
	}
		
}
