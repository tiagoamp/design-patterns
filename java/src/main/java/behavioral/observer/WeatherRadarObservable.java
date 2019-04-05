package behavioral.observer;

import java.util.Observable;

public class WeatherRadarObservable extends Observable {

	public void setEvent(String event) {
		setChanged();
        notifyObservers(event);
	}	
	
}
