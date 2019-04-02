package structural.decorator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AddOnDecoratorTest {

	@Test
	public void testAllIncludedSandwich() {
		// given
		Sandwich sandwich = new StandardSandwich();
		Sandwich sandwichWithBacon = new BaconAddOnDecorator(sandwich);
		Sandwich sandwichWithBaconAndCheddar = new CheddarAddOnDecorator(sandwichWithBacon);
		// when 
		String description = sandwichWithBaconAndCheddar.getDescription();
		Float totalCost = sandwichWithBaconAndCheddar.cost();
		// then
		assertTrue(description.contains("Sandwich"));
		assertTrue(description.contains("bacon"));
		assertTrue(description.contains("cheddar"));
		assertEquals(5F + 2F + 1F, totalCost, 0.01);
	}
	
	@Test
	public void testAllIncludedSandwich_inlineOddInstantiation() {
		// given
		Sandwich sandwichWithBaconAndCheddar = new CheddarAddOnDecorator(new BaconAddOnDecorator(new StandardSandwich()));
		// when 
		String description = sandwichWithBaconAndCheddar.getDescription();
		Float totalCost = sandwichWithBaconAndCheddar.cost();
		// then
		assertTrue(description.contains("Sandwich"));
		assertTrue(description.contains("bacon"));
		assertTrue(description.contains("cheddar"));
		assertEquals(5F + 2F + 1F, totalCost, 0.01);
	}
	
	@Test
	public void testSandwichWithOnlyBaconAddOn() {
		// given
		Sandwich sandwich = new StandardSandwich();
		Sandwich sandwichWithBacon = new BaconAddOnDecorator(sandwich);
		// when 
		String description = sandwichWithBacon.getDescription();
		Float totalCost = sandwichWithBacon.cost();
		// then
		assertTrue(description.contains("Sandwich"));
		assertTrue(description.contains("bacon"));
		assertFalse(description.contains("cheddar"));
		assertEquals(5F + 2F, totalCost, 0.01);
	}
	
	@Test
	public void testSandwichWithOnlyCheddarAddOn() {
		// given
		Sandwich sandwich = new StandardSandwich();
		Sandwich sandwichWithCheddar = new CheddarAddOnDecorator(sandwich);
		// when 
		String description = sandwichWithCheddar.getDescription();
		Float totalCost = sandwichWithCheddar.cost();
		// then
		assertTrue(description.contains("Sandwich"));
		assertFalse(description.contains("bacon"));
		assertTrue(description.contains("cheddar"));
		assertEquals(5F + 1F, totalCost, 0.01);
	}

}
