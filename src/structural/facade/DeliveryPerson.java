package structural.facade;

public class DeliveryPerson {

    private String name;

    public DeliveryPerson(String name) {
        this.name = name;
    }

    public void pickUpOrder() {
        System.out.println("Delivery: pick up order");
    }

    public boolean deliverOrder() {
        System.out.println("Delivery: deliver order");
        return true;
    }

}
