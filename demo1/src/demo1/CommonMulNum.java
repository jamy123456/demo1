package demo1;

public class CommonMulNum {
	 //11111111111111111111111111111111111111111111111111111
	public static void main(String[] args) {
		int i = 8;
		System.out.print("3和7的公倍数有:");
		while (i <= 500) {
			if (i % 3 == 0 && i % 7 == 0) {
				System.out.print(i+"\t");
			}
			i++;
		}
	}
}
