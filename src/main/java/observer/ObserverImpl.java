package observer;

public class ObserverImpl implements Observer {
	
	private Subject subject;
	
	public ObserverImpl(Subject subject) {
		this.subject = subject;
		subject.registObserver(this);
	}

	public void update(String msg) {
		System.out.println("收到主题\"" + subject.getName() + "\"的消息变化：" + msg);
	}

}
