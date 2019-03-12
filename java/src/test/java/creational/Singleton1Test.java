package creational;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Singleton1Test {

	@Test
	public void testGetInstance() {
		Singleton1 firstIntance = Singleton1.getInstance();
		Singleton1 secondIntance = Singleton1.getInstance();		
		assertEquals(firstIntance, secondIntance);
	}

}
