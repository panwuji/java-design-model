package staticinnerload;

import java.util.Date;

// 测试外部类与内部类的加载关系
public class Outer {
	public static int STATICOUTERVARIABLE = 1;
	static {
		System.out.println("加载外部类静态块" + new Date());
//		System.out.println("在类里面直接引用静态内部类的静态成员：" + StaticInner.STATICINNERVARIABLE);
	}
	static class StaticInner {
		public static int STATICINNERVARIABLE = 2;
		static {
			System.out.println("加载内部类静态块" + new Date());
//			System.out.println("在静态内部类里面直接引用外部类的静态成员：" + Outer.STATICOUTERVARIABLE);
		}
	}
}
