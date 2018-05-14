package object_2;

/**
 * P37 练习3：找出含有ATypeName的代码段，将其改写成完整的程序，然后编译、运行。
 * @Author sl
 * @Date 2018年5月14日 下午8:25:53
 * @Version 1.0
 * 
 */
public class Practice3 {

	public class ATyepeName {
		public ATyepeName() {}
	}
	
	public static void main(String[] args) {
		ATyepeName name = new Practice3().new ATyepeName(); // 外部对内部类的构造方法
		System.out.println(name);
	}

}
