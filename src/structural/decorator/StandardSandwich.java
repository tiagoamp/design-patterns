package structural.decorator;

public class StandardSandwich implements Sandwich {

    @Override
    public String getDescription() {
        return "sandwich";
    }

    @Override
    public Double getPrice() {
        return 5.0;
    }

}
