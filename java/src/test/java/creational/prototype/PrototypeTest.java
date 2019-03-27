package creational.prototype;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrototypeTest {

	@Test
	public void test() throws CloneNotSupportedException {
		// given
		Prototype p1 = new ConcretePrototype();
		p1.setName("Ozzy");
		// when
		Prototype cloned = p1.clone();
		// then
		assertEquals(p1.getName(), cloned.getName());		
	}

}
