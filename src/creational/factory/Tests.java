package creational.factory;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @DisplayName("When yellow lightsaber, should return Jedi Sentinel")
    @Test
    void testGetJedi_yellowLightsaber() {
        final String lightSaberColor = "yellow";
        Jedi jedi = JediFactory.getJedi(lightSaberColor);
        assertTrue(jedi instanceof JediSentinel);
    }

    @DisplayName("When blue lightsaber, should return Jedi Guardian")
    @Test
    public void testGetJedi_blueLightsaber() {
        final String lightSaberColor = "blue";
        Jedi jedi = JediFactory.getJedi(lightSaberColor);
        assertTrue(jedi instanceof JediGuardian);
    }

    @DisplayName("When green lightsaber, should return Jedi Consular")
    @Test
    public void testGetJedi_greenLightsaber() {
        final String lightSaberColor = "green";
        Jedi jedi = JediFactory.getJedi(lightSaberColor);
        assertTrue(jedi instanceof JediConsular);
    }

    @DisplayName("When red lightsaber, should not instanciate Jedi")
    @Test
    public void testGetJedi_redLightsaber() {
        final String lightSaberColor = "red";
        assertThrows(IllegalArgumentException.class,
                () -> JediFactory.getJedi(lightSaberColor),
                "Factory should not recognize and instantiate Jedi with red lightsaber!"
        );
    }

}
