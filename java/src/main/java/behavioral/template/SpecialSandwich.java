package behavioral.template;

public class SpecialSandwich extends Sandwich {

	@Override
	protected String addSauce() {
		return "TomatoSauce";
	}

	@Override
	protected String addCheese() {
		return "cheddar";
	}

	@Override
	protected String addMeat() {
		return "double-burguer";
	}

	@Override
	protected String takeBread() {
		return "ItalianBread";
	}

}
