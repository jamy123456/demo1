package demo1;

public class Compare3 {
	public static void main(String[] args) {
		int a = 3, b = 9, c = 2;
		if (a > b) {
			if (a > c) {
				System.out.println("最大的数是"+a);
			}else {
				System.out.println("最大的数是"+c);
			}
		}else {
			if (b > c) {
				System.out.println("最大的数是"+b);
			}else {
				System.out.println("最大的数是"+c);
			}
		}
	}
}
