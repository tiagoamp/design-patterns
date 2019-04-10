package behavioral.state;

public class DeliveredState implements PackageState {

	@Override
	public void next(Package pkg) {
		pkg.setState(new ReceivedState());
	}

	@Override
	public void previous(Package pkg) {
		pkg.setState(new OrderedState());
	}

	@Override
	public String status() {
		return "Package delivered";
	}

}
