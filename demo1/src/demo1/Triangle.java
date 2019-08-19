package demo1;

public class Triangle {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {{
        System.out.println("执行构造代码块!!!");
    }
			for (int j = 1; j <= 6 - i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 1; i <= 5; i++) {
			for (int j = 5; j >= 6 - i; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
