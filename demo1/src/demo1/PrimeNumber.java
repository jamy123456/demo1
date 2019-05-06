package demo1;

public class PrimeNumber {
	public static void main(String[] args) {//打印选定范围内的质数
		int count = 0;
		System.out.print("123-728之间的质数有:");
		for (int i = 123; i <= 728; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				System.out.print(i+" ");
				count++;
			}
		}
		System.out.println();
		System.out.println("123-728之间一共有"+count+"个质数");
	}
}
