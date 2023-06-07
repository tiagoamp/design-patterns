package creational.builder;

public class HeroInnerBuilder {

    private String name;

    private String maskColor;

    private Integer age;

    private String capeColor;

    private String weapon;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaskColor() {
        return maskColor;
    }

    public void setMaskColor(String maskColor) {
        this.maskColor = maskColor;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCapeColor() {
        return capeColor;
    }

    public void setCapeColor(String capeColor) {
        this.capeColor = capeColor;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }


    static class Builder {

        private HeroInnerBuilder hero = new HeroInnerBuilder();


        public HeroInnerBuilder build() {
            return hero;
        }


        public Builder withName(String name) {
            hero.setName(name);
            return this;
        }

        public Builder maskColor(String maskColor) {
            hero.setMaskColor(maskColor);
            return this;
        }

        public Builder withAge(Integer age) {
            hero.setAge(age);
            return this;
        }

        public Builder withCapeColor(String color) {
            hero.setCapeColor(color);
            return this;
        }

        public Builder withWeapon(String weapon) {
            hero.setWeapon(weapon);
            return this;
        }

    }

}
