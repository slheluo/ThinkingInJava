package object_2;

/**
 * P37 练习5:修改前一个练习，将DataOnly中的数据在main()方法中赋值并打印出来。
 * @Author sl
 * @Date 2018年5月15日 下午4:34:54
 * @Version 1.0
 * 
 */
public class Practice5 {
	int i;
	double d;
	boolean b;
	
	public Practice5(int i, double d ,boolean b) {
		this.i = i;
		this.d = d;
		this.b = b;
	}

	public String toString() {
		return "i:" + i + " d:" + d + " b:" + b;
	}
	
	public static void main(String[] args) {
		Practice5 practice5 = new Practice5(2, 2, false);
		System.out.println(practice5);
	}

}
