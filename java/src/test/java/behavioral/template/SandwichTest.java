package behavioral.template;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SandwichTest {

	@Test
	public void test() {
		// given
		Sandwich stdSandwick = new StandardSandwich();
		Sandwich specialSandwick = new SpecialSandwich();
		// when
		stdSandwick.makeSandwichTemplate();
		specialSandwick.makeSandwichTemplate();
		assertTrue(stdSandwick.getDescription().contains("mozzarella"));
		assertTrue(specialSandwick.getDescription().contains("cheddar"));
	}

}
