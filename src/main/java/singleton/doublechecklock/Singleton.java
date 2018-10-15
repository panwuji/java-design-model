package singleton.doublechecklock;

// 使用双重校验锁完成单例实例创建
public class Singleton {
	/*
	 * 加volatile关键字可以消除指令重排序的问题
	 * 把instance声明为volatile之后，对它的写操作就会有一个内存屏障
	 * 这样，在它的赋值完成之前，就不用会调用读操作
	 */
	private static volatile Singleton singleton = null;
	private Singleton() {}
	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					/*
					 * 该操作非原子操作，可能会进行指令重排序
					 * 导致看上去singleton已被创建但实际上尚未完成
					 * 而其它线程直接使用该对象导致问题（因为此时对象可能并没有实例化完成）
					 */
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}
}
