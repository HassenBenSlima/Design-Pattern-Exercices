
public interface Observable {
	public void addObserver(Observer o);

	public void remove(Observer o);

	public void notifyObservers();

}
