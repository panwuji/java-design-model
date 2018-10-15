package singleton.staticinnerimpl;
// 使用内部类完成单例实例创建
public class Singleton {
	private static class StaticInner {
		private static Singleton instance = new Singleton();
	}
	// 只有在调用该方法时，才会加载内部类！懒加载！由于在加载时完成类的创建，因此不存在线程问题！
	public static Singleton getInstance(){
		return StaticInner.instance;
	}
}
