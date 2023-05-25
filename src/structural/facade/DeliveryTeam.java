package structural.facade;

public class DeliveryTeam {

    public DeliveryPerson assignDeliveryPerson() {
        return new DeliveryPerson("Tony Stark");
    }

}
