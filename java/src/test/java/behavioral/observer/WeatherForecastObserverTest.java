package behavioral.observer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class WeatherForecastObserverTest {

	@Test
	public void test() {
		// given
		WeatherForecastObserver observer = new WeatherForecastObserver();
		WeatherRadarObservable radarObservable = new WeatherRadarObservable();
		radarObservable.addObserver(observer);
		final String eventMsg = "It is raining";
		// when
		radarObservable.setEvent(eventMsg);
		// then
		assertEquals(eventMsg, observer.getMessage());
	}

}
