package creational.builder;

public class HeroBuilder {

    private Hero hero = new Hero();


    public Hero build() {
        return hero;
    }


    public HeroBuilder withName(String name) {
        hero.setName(name);
        return this;
    }

    public HeroBuilder withMaskColor(String maskColor) {
        hero.setMaskColor(maskColor);
        return this;
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
