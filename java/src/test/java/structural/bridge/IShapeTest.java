package structural.bridge;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IShapeTest {

	@Test
	public void testDraw() {
		IShape square = new Square(new Black());
		String result = square.draw();
		assertTrue(result.contains("Square"));
		assertTrue(result.contains("Black"));
	}

}
