package creational.builder;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    @Test
    @DisplayName("When instanciate a class with builder methods, should set proper attributes")
    void test1() {
        Hero hero = new HeroBuilder().withName("Conan").withWeapon("Sword").build();
        assertNotNull(hero);
        assertEquals("Conan", hero.getName());
        assertEquals("Sword", hero.getWeapon());
    }

    @Test
    @DisplayName("When instanciate a class with builder methods, should set proper attributes")
    void test2() {
        HeroInnerBuilder hero = new HeroInnerBuilder.Builder().withName("Conan").withWeapon("Sword").build();
        assertNotNull(hero);
        assertEquals("Conan", hero.getName());
        assertEquals("Sword", hero.getWeapon());
    }

    @Test
    @DisplayName("When instanciate a class with builder methods, should set proper attributes")
    void test3() {
        HeroLombok hero = HeroLombok.builder().name("Conan").weapon("Sword").build();
        assertNotNull(hero);
        assertEquals("Conan", hero.getName());
        assertEquals("Sword", hero.getWeapon());
    }

}
