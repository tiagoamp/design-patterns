package behavioral.state;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PackageStateTest {

	@Test
	public void test() {
		Package pkg = new Package();
		assertTrue(pkg.getState() instanceof OrderedState);
		pkg.nextState();
		assertTrue(pkg.getState() instanceof DeliveredState);
		pkg.nextState();
		assertTrue(pkg.getState() instanceof ReceivedState);
		pkg.previousState();
		assertTrue(pkg.getState() instanceof DeliveredState);
		pkg.nextState();
		assertTrue(pkg.getState() instanceof ReceivedState);
	}

}
