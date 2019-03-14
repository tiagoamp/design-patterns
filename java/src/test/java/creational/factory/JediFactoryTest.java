package creational.factory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class JediFactoryTest {

	@Test
	public void testGetJedi_yellowLighsaber_shouldReturnJediSentinel() {
		final String lightSaberColor = "yellow";
		Jedi jedi = JediFactory.getJedi(lightSaberColor);
		assertEquals(JediSentinel.class, jedi.getClass());
	}
	
	@Test
	public void testGetJedi_blueLighsaber_shouldReturnJediGuardian() {
		final String lightSaberColor = "blue";
		Jedi jedi = JediFactory.getJedi(lightSaberColor);
		assertEquals(JediGuardian.class, jedi.getClass());
	}
	
	@Test
	public void testGetJedi_greenLighsaber_shouldReturnJediConsular() {
		final String lightSaberColor = "green";
		Jedi jedi = JediFactory.getJedi(lightSaberColor);
		assertEquals(JediConsular.class, jedi.getClass());
	}
	
	@Test(expected=RuntimeException.class)
	public void testGetJedi_redLighsaber_shouldThrowException() {
		final String lightSaberColor = "red";
		JediFactory.getJedi(lightSaberColor);
		fail("Factory should not recognize and instantiate Jedi with red lightsaber!");
	}

}
