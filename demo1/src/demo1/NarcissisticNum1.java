package demo1;

public class NarcissisticNum1 {
	public static void main(String[] args) {//计算三位数水仙花数的平均值
		int i = 100, count = 0, m = 0;
		System.out.println("三位数的水仙花数有:");
		while (i <= 999) {
			int sum = 0, t = i;
			while (t > 0) {
				int k = t % 10;
				sum += k*k*k;
				t /= 10;
			}
			if (sum == i) {
				System.out.print(sum+"  ");
				m += sum;
				count++;
			}			
			i++;
		}
		double d = m * 1.0 / count++;
		System.out.println();
		System.out.println("所有水仙花数的平均数为:"+d);
	}
}
