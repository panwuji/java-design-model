package observer;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject {

	public List<Observer> observers = new ArrayList<Observer>();
	// ��ǰ���������
	private String name;
	// ���������
	public String msg;
	// ͨ�������ʼ����������
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
		// �����й۲���������Ϣ
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
