package behavioral.state;

public class ReceivedState implements PackageState {

	@Override
	public void next(Package pkg) {
		System.out.println("This is final state");
	}

	@Override
	public void previous(Package pkg) {
		 pkg.setState(new DeliveredState());

	}

	@Override
	public String status() {
		return "Package is received";
	}

}
