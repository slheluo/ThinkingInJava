package object_2;

/**
 * P37 练习7：将Incrementable的代码段改写成一个完整的可运行程序。
 * @Author sl
 * @Date 2018年5月15日 下午4:42:25
 * @Version 1.0
 * 
 */
public class Practice7 {
	
	static class StaticTest {
		static int i = 0;
	}
	
	static void increment() {
		StaticTest.i++ ;
	}
	
	public static void main(String[] args) {
		Practice7.increment();
		System.out.println("StaticTest.i = " + StaticTest.i);
	}

}
