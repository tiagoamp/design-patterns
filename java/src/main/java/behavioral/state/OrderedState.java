package behavioral.state;

public class OrderedState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new DeliveredState());

	}

	@Override
	public void previous(Package pkg) {
		System.out.println("This is root state");

	}

	@Override
	public String status() {
		return "Package ordered";
	}

}
