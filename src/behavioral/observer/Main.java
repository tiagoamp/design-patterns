package behavioral.observer;

public class Main {

    public static void main(String[] args) {
        // observable
        WeatherRadarObservable radar = new WeatherRadarObservable();
        // observers / subscribers
        WeatherObserver aviationSubscriber = new WeatherForecastObserver("aviation");
        WeatherObserver navigationSubscriber = new WeatherForecastObserver("navigation");
        WeatherObserver farmSubscriber = new WeatherForecastObserver("farm");
        // register
        radar.addSubscriber(aviationSubscriber);
        radar.addSubscriber(navigationSubscriber);
        radar.addSubscriber(farmSubscriber);
        // emit event
        radar.setEvent("raining");
        radar.setEvent("windy");
    }

}
