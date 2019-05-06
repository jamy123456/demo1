package demo1;

public class NarcissisticNum {
	public static void main(String[] args) {//打印水仙花数
		int i = 100;
		System.out.print("三位数的水仙花数有:");
		while (i <= 999) {
			int a = i % 10, b = i / 10 % 10, c = i / 100, sum = 0;
			sum = a*a*a + b*b*b + c*c*c;
			if (sum == i) {
				System.out.print(i+"   ");				
			}
			i++;
		}
	}
}
