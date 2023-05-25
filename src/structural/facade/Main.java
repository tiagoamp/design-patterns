package structural.facade;

public class Main {

    public static void main(String[] args) {

        // manual
        Restaurant restaurant = new Restaurant();
        restaurant.prepareOrder();
        DeliveryTeam deliveryTeam = new DeliveryTeam();
        DeliveryPerson deliveryPerson = deliveryTeam.assignDeliveryPerson();
        deliveryPerson.pickUpOrder();
        deliveryPerson.deliverOrder();

        // using the facade
        AppFoodFacade facade = new AppFoodFacade();
        facade.placeOrder();

    }

}
