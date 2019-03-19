package creational.builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HeroBuilder2Test {

	@Test
	public void testBuild_allFieldsInformed() {
		Hero2 oldWarriorFromMiddleEarth = new Hero2.Builder("Conan","black")
			.withAge(100).withCapeColor("blue").withWeapon("sword")
			.build();
		assertNotNull(oldWarriorFromMiddleEarth);
		assertNotNull(oldWarriorFromMiddleEarth.getName());
		assertNotNull(oldWarriorFromMiddleEarth.getMaskColor());
		assertNotNull(oldWarriorFromMiddleEarth.getWeapon());
	}
	
	@Test
	public void testBuild_onlyRequiredFieldsInformed() {
		Hero2 simpleHero = new Hero2.Builder("Conan","black")
			.build();
		assertNotNull(simpleHero);
		assertNotNull(simpleHero.getName());
		assertNotNull(simpleHero.getMaskColor());
		assertNull(simpleHero.getWeapon());
	}

}
