package staticinnerload;

import java.util.Date;

// �����ⲿ�����ڲ���ļ��ع�ϵ
public class Outer {
	public static int STATICOUTERVARIABLE = 1;
	static {
		System.out.println("�����ⲿ�ྲ̬��" + new Date());
//		System.out.println("��������ֱ�����þ�̬�ڲ���ľ�̬��Ա��" + StaticInner.STATICINNERVARIABLE);
	}
	static class StaticInner {
		public static int STATICINNERVARIABLE = 2;
		static {
			System.out.println("�����ڲ��ྲ̬��" + new Date());
//			System.out.println("�ھ�̬�ڲ�������ֱ�������ⲿ��ľ�̬��Ա��" + Outer.STATICOUTERVARIABLE);
		}
	}
}
