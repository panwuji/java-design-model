package singleton.staticinnerimpl;
// ʹ���ڲ�����ɵ���ʵ������
public class Singleton {
	private static class StaticInner {
		private static Singleton instance = new Singleton();
	}
	// ֻ���ڵ��ø÷���ʱ���Ż�����ڲ��࣡�����أ������ڼ���ʱ�����Ĵ�������˲������߳����⣡
	public static Singleton getInstance(){
		return StaticInner.instance;
	}
}
