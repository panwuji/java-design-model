package observer;

public interface Subject {
	void registObserver(Observer observer);
	void removeObserver(Observer observer);
	void notifyAllObservers();
	
	String getName();
	void setMsg(String msg);
}
