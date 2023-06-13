package structural.decorator;

public class BaconAddOnDecorator extends AddOnDecorator {

    public BaconAddOnDecorator(Sandwich sandwich) {
        super(sandwich);
    }


    @Override
    public String getDescription() {
        return sandwich.getDescription() + " + bacon";
    }

    @Override
    public Double getPrice() {
        return sandwich.getPrice() + 2.0;
    }

}
