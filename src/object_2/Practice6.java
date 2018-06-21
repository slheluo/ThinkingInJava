package object_2;

/**
 * P37 练习6：编写一个程序，让它含有本章定义的storage()方法的代码段，并调用之。
 * @Author sl
 * @Date 2018年5月15日 下午4:37:54
 * @Version 1.0
 * 
 */
public class Practice6 {

	int storage(String s) {
		return s.length()*2;
	}
	
	public static void main(String[] args) {
		Practice6 practice6 = new Practice6();
		int num = practice6.storage(new String("practice6"));
		System.out.println("Num:" + num);
	}

}
