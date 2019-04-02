package structural.decorator;

public class BaconAddOnDecorator extends AddOnDecorator {

	public BaconAddOnDecorator(Sandwich sandwich) {
		super.sandwich = sandwich;
	}
	

	@Override
	String getDescription() {
		return sandwich.getDescription() + " + bacon";
	}

	@Override
	Float cost() {
		return sandwich.cost() + 2F;
	}
	
}
