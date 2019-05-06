package demo1;

public class Diamond {//利用杨辉三角原理打印一个棱形
	public static void main(String[] args) {
		int num = 6;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");		
			}
			for (int k = 1; k <= i *2 -1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = num -1; i >= 1; i--) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");		
			}
			for (int k = i *2 -1; k >= 1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
