package obs;

public interface Observable {
	/*
	 * permet a lobservateur de s'inscrire
	 */
	public void addObserver(Observer o);

	public void deleteObserver(Observer o);

	public void notifyObservers();
}
