package creational.prototype;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class Tests {

    @DisplayName("Should create another object cloning the existing one")
    @Test
    void test() throws CloneNotSupportedException {
        Robot base = new Robot();
        base.setName("R2D2");
        Robot clone = base.clone();
        assertEquals(base.getName(), clone.getName());
        assertNotSame(base, clone);
    }

}
