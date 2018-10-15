package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	public List<Observer> observers = new ArrayList<Observer>();
	// 当前主题的名称
	private String name;
	// 主题的内容
	public String msg;
	// 通过构造初始化主题名称
	public SubjectImpl(String name){
		this.name = name;
	}

	public void registObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
	}

	public void notifyAllObservers() {
		// 向所有观察者推送消息
		for (Observer observer : observers) {
			observer.update(msg);
		}
	}

	public void setMsg(String msg) {
		this.msg = msg;
		notifyAllObservers();
	}

	public String getName() {
		return name;
	}
	
}
