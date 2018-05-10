package object_2;

/**
 * P37 练习1：创建一个类，它包含一个int域和一个char域，它们都没有被初始化，
 * 将它们的值都打印出来，以验证Java执行了默认初始化。
 * @Author sl
 * @Date 2018年5月10日 下午9:58:52
 * @Version 1.0
 */
public class Practice1 {
	public int i;
	public char c;
	
	public static void main(String[] args) {
		Practice1 p = new Practice1();
		System.out.println("i=" + p.i);
		System.out.println("c=" + p.c);
	}
}
