package creational.factory;

public interface Jedi {

    String whoAmI();

    default String attack() {
        return "wowwwwnnnnnn";  // imagine lightsaber sound effect here!  :-P
    }

}
