package behavioral.observer;

public class WeatherForecastObserver implements WeatherObserver {

    private final String name;

    public WeatherForecastObserver(String name) {
        this.name = name;
    }


    @Override
    public void update(String event) {
        System.out.println(name + " = event received: " + event);
    }

}
