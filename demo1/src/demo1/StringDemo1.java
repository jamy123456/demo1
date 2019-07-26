package demo1;

public class StringDemo1 {
	public static void main(String[] args) {
		StringBuffer s1 = new StringBuffer("123");
		int a = 3;
		modify(s1, a);
		// 基本数据类型是值传递，所以i的值发生变化不会影响a，a依然是它原来的值．
		System.out.println(a);
		// 引用数据类型是内存地址值传递，s1和s2指向同一个内存地址，所以s2改变了值，s1也发生相同的变化．
		System.out.println(s1);
		
			
	}
	
	public static void modify(StringBuffer s1, int i) {
		StringBuffer s2  = s1;
		s2.append("123456");
		i = i + 1;
	}

}
