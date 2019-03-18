package creational.builder;

public class HeroBuilder {
	
	private Hero hero;
	
	
	public HeroBuilder(String name, String maskColor) {
		hero = new Hero();
		hero.setName(name);
		hero.setMaskColor(maskColor);
	}
	
	
	public Hero build() {
		return hero;
	}
	
	public HeroBuilder withAge(Integer age) {
		hero.setAge(age);
		return this;
	}
	
	public HeroBuilder withCapeColor(String color) {
		hero.setCapeColor(color);
		return this;
	}
	
	public HeroBuilder withWeapon(String weapon) {
		hero.setWeapon(weapon);
		return this;
	}
	
}
