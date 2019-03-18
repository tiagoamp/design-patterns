package creational.builder;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class HeroBuilderTest {

	@Test
	public void testBuild_allFieldsInformed() {
		Hero oldWarriorFromMiddleEarth = new HeroBuilder("Conan","black")
			.withAge(100).withCapeColor("blue").withWeapon("sword")
			.build();
		assertNotNull(oldWarriorFromMiddleEarth);
		assertNotNull(oldWarriorFromMiddleEarth.getName());
		assertNotNull(oldWarriorFromMiddleEarth.getMaskColor());
		assertNotNull(oldWarriorFromMiddleEarth.getWeapon());
	}
	
	@Test
	public void testBuild_onlyRequiredFieldsInformed() {
		Hero simpleHero = new HeroBuilder("Conan","black")
			.build();
		assertNotNull(simpleHero);
		assertNotNull(simpleHero.getName());
		assertNotNull(simpleHero.getMaskColor());
		assertNull(simpleHero.getWeapon());
	}

}
