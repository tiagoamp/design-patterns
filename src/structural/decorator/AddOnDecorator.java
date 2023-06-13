package structural.decorator;

public abstract class AddOnDecorator implements Sandwich {

    protected Sandwich sandwich;

    public AddOnDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

}
