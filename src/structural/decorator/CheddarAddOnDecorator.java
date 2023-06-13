package structural.decorator;

public class CheddarAddOnDecorator extends AddOnDecorator {

    public CheddarAddOnDecorator(Sandwich sandwich) {
        super(sandwich);
    }


    @Override
    public String getDescription() {
        return sandwich.getDescription() + " + cheddar";
    }

    @Override
    public Double getPrice() {
        return sandwich.getPrice() + 1.0;
    }

}
