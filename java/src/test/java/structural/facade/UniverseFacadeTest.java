package structural.facade;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class UniverseFacadeTest {

	@Test
	public void testCreateParallelUniverse() {
		UniverseFacade facade = new UniverseFacade();
		String result = facade.createParallelUniverse();
		assertNotNull(result);
		assertFalse(result.isEmpty());
	}

}
