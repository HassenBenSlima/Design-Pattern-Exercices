package iit.interfaces.com;

public interface Subject {
	void registerObserver(Observer o);

	void removeObserver(Observer o);

	void notifyObserver();

}
