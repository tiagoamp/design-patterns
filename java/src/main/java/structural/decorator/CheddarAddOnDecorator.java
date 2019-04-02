package structural.decorator;

public class CheddarAddOnDecorator extends AddOnDecorator {

	public CheddarAddOnDecorator(Sandwich sandwich) {
		super.sandwich = sandwich;
	}
	

	@Override
	String getDescription() {
		return sandwich.getDescription() + " + cheddar";
	}

	@Override
	Float cost() {
		return sandwich.cost() + 1F;
	}
	
}
