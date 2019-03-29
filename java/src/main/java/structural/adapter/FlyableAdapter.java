package structural.adapter;

public class FlyableAdapter implements IFlyableAdapter {

	private Flyable flyable;
	public static final double FEET_VAL = 3.2808;
	
	public FlyableAdapter(Flyable adaptee) {
		this.flyable = adaptee;
	}
	
	@Override
	public double getCurrentHeightInFeet() {
		double currHeightInMeters = flyable.getCurrentHeightInMeters();
		double currHeightInFeet = currHeightInMeters * FEET_VAL;
		return currHeightInFeet;
	}

}
