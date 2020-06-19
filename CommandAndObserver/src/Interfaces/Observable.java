package Interfaces;

public interface Observable {
	 String getUpdate();
	 void subscribe(Observer observer);
	 void unsubscribe(Observer observer);
	 void notifyObservers();
}
