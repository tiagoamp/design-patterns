package structural.decorator;

public class StandardSandwich extends Sandwich {

	@Override
	String getDescription() {
		return "Sandwich";
	}

	@Override
	Float cost() {
		return 5F;
	}

}
