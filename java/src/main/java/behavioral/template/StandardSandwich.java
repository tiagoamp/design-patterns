package behavioral.template;

public class StandardSandwich extends Sandwich {

	@Override
	protected String addSauce() {
		return "ketchup";
	}

	@Override
	protected String addCheese() {
		return "mozzarella";
	}

	@Override
	protected String addMeat() {
		return "hamburguer";
	}

	@Override
	protected String takeBread() {
		return "RegularBread";
	}

}
