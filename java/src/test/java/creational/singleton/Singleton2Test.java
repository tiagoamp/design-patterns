package creational.singleton;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import creational.singleton.Singleton2;

public class Singleton2Test {

	@Test
	public void testGetInstance() {
		Singleton2 firstIntance = Singleton2.getInstance();
		Singleton2 secondIntance = Singleton2.getInstance();		
		assertEquals(firstIntance, secondIntance);
	}

}
