package creational.builder;

public class Main {

    public static void main(String[] args) {

        // instantiate a hero and set attributes
        Hero hero1 = new Hero();
        hero1.setName("Iron Man");
        hero1.setMaskColor("red");
        hero1.setCapeColor("black");

        // using builder
        Hero hero2 = new HeroBuilder().withName("Iron Man").withMaskColor("red").withCapeColor("black").build();

    }

}
