package behavioral.observer;

import java.util.*;

public class WeatherRadarObservable {

    private List<WeatherObserver> subscribers = new ArrayList<>();


    public void setEvent(String event) {
        for(WeatherObserver subscriber : subscribers) {
            subscriber.update(event);
        }
    }

    public void addSubscriber(WeatherObserver subscriber) {
        subscribers.add(subscriber);
    }

}
