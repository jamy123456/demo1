package demo1;

public class YangHuiTriangle {//打印杨辉三角利用等差数列规律
	public static void main(String[] args) {
		int num = 5;
		for (int i = 1; i <= num ; i++) {
			for (int k = 1; k <= num - i; k++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i *2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
