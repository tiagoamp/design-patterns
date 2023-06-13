package structural.decorator;

public class Main {

    public static void main(String[] args) {
        Sandwich sandwich = new StandardSandwich();
        Sandwich sandwichWithBacon = new BaconAddOnDecorator(sandwich);
        Sandwich sandwichWithBaconAndCheddar = new CheddarAddOnDecorator(sandwichWithBacon);
        String description = sandwichWithBaconAndCheddar.getDescription();
        Double price = sandwichWithBaconAndCheddar.getPrice();
        System.out.println(description);
        System.out.println(price);
        // inline
        Sandwich sandwich2 = new CheddarAddOnDecorator(new BaconAddOnDecorator(new StandardSandwich()));
        System.out.println(sandwich2.getDescription());
    }

}
