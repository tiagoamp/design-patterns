package structural.adapter;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FlyableAdapterTest {

	@Test
	public void testGetCurrentHeightInFeet() {
		// given
		final double heightInMeters = 11000;
		Flyable adaptee = new Airplane(heightInMeters);
		FlyableAdapter adapter = new FlyableAdapter(adaptee);
		// when
		double heightInFeet = adapter.getCurrentHeightInFeet();
		// then
		assertEquals(FlyableAdapter.FEET_VAL * heightInMeters, heightInFeet, 0.01);
	}

}
