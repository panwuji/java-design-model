package singleton.doublechecklock;

// ʹ��˫��У������ɵ���ʵ������
public class Singleton {
	/*
	 * ��volatile�ؼ��ֿ�������ָ�������������
	 * ��instance����Ϊvolatile֮�󣬶�����д�����ͻ���һ���ڴ�����
	 * �����������ĸ�ֵ���֮ǰ���Ͳ��û���ö�����
	 */
	private static volatile Singleton singleton = null;
	private Singleton() {}
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					/*
					 * �ò�����ԭ�Ӳ��������ܻ����ָ��������
					 * ���¿���ȥsingleton�ѱ�������ʵ������δ���
					 * �������߳�ֱ��ʹ�øö��������⣨��Ϊ��ʱ������ܲ�û��ʵ������ɣ�
					 */
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
