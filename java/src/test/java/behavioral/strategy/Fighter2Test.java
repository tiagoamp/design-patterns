package behavioral.strategy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Fighter2Test {

	@Test
	public void test_hadokenAttachStrategy() {
		// given
		Fighter2 fighter = new Fighter2(IAttack2.hadoken());
		// when
		String result = fighter.attack();
		// then
		assertEquals(new Hadoken().execute(), result);
	}
	
	@Test
	public void test_shoryukenAttachStrategy() {
		// given
		Fighter2 fighter = new Fighter2(IAttack2.shoryuken());
		// when
		String result = fighter.attack();
		// then
		assertEquals(new Shoryuken().execute(), result);
	}

}
