package structural.facade;

public class AppFoodFacade {

    private Restaurant restaurant = new Restaurant();
    private DeliveryTeam deliveryTeam = new DeliveryTeam();

    public void placeOrder() {
        restaurant.prepareOrder();
        DeliveryPerson deliveryPerson = deliveryTeam.assignDeliveryPerson();
        deliveryPerson.pickUpOrder();
        deliveryPerson.deliverOrder();
    }

}
