package observer;

public class ObserverImpl implements Observer {
	
	private Subject subject;
	
	public ObserverImpl(Subject subject) {
		this.subject = subject;
		subject.registObserver(this);
	}

	public void update(String msg) {
		System.out.println("�յ�����\"" + subject.getName() + "\"����Ϣ�仯��" + msg);
	}

}
