package behavioral.observer;

import java.util.Observable;
import java.util.Observer;

public class WeatherForecastObserver implements Observer {

	private String message;
	
	@Override
	public void update(Observable o, Object msg) {
		this.message = (String)	msg;
	}
	
	
	public String getMessage() {
		return message;
	}

}
