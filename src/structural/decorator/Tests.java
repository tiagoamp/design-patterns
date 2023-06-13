package structural.decorator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Tests {

    @DisplayName("When adding bacon decorator, should return sandwich with bacon")
    @Test
    void sandwich_plusBacon() {
        Sandwich sandwich = new BaconAddOnDecorator(new StandardSandwich());
        assertTrue(sandwich.getDescription().contains("bacon"));
        assertEquals(5.0 + 2.0, sandwich.getPrice());
    }

    @DisplayName("When adding cheddar decorator, should return sandwich with cheddar")
    @Test
    void sandwich_plusCheddar() {
        Sandwich sandwich = new CheddarAddOnDecorator(new StandardSandwich());
        assertTrue(sandwich.getDescription().contains("cheddar"));
        assertEquals(5.0 + 1.0, sandwich.getPrice());
    }

    @DisplayName("When adding all decorators, should return sandwich with bacon and cheddar")
    @Test
    void sandwich() {
        Sandwich sandwich = new CheddarAddOnDecorator(new BaconAddOnDecorator(new StandardSandwich()));
        assertTrue(sandwich.getDescription().contains("bacon"));
        assertTrue(sandwich.getDescription().contains("cheddar"));
        assertEquals(5.0 + 2.0 + 1.0, sandwich.getPrice());
    }

}
