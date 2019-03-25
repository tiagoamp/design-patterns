package behavioral.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FighterTest {

	@Test
	public void test_hadokenAttachStrategy() {
		// given
		Hadoken hadoken = new Hadoken();
		Fighter fighter = new Fighter(hadoken);
		// when
		String result = fighter.attack();
		// then
		assertEquals(hadoken.execute(), result);
	}
	
	@Test
	public void test_shoryukenAttachStrategy() {
		// given
		Shoryuken shoryuken = new Shoryuken();
		Fighter fighter = new Fighter(shoryuken);
		// when
		String result = fighter.attack();
		// then
		assertEquals(shoryuken.execute(), result);
	}

}
