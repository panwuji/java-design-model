package observer;

public class TestObserver {
	public static void main(String[] args) {
		
		Subject subject = new SubjectImpl("��������");
		
		Observer observer1 = new ObserverImpl(subject);
		Observer observer2 = new ObserverImpl(subject);
		
		subject.setMsg("�ܿ��ģ�");
	}
}
