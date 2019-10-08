package test;

public interface Subject {

	void createSonnorie(SonnerieObserver s);

	void removeSonnorie(SonnerieObserver s);

	void notifierAllSonnorie();

	void createDisplay(DisplayObserver d);

	void removeDisplay(DisplayObserver d);

	void notifierAllDisplay();

}
