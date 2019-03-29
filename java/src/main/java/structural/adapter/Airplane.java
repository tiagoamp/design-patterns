package structural.adapter;

public class Airplane implements Flyable {

	private double currHeight;
	
	public Airplane(double height) {
		this.currHeight = height;
	}
	
	@Override
	public double getCurrentHeightInMeters() {
		return currHeight;  
	}

}
