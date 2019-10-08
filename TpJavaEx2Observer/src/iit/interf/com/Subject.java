package iit.interf.com;

public interface Subject {
	void registerObserverSonnerie(SonnerieObserver o);

	void removeObserverSonnerie(SonnerieObserver o);

	void notifyObserverSonnerie();

	void registerObserverDisplay(DisplayObserver o);

	void removeObserverDisplay(DisplayObserver o);

	void notifyObserverDisplay();

}
