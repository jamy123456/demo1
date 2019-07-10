package demo1;

public class BuyChicken {
	 //00000000000000000000000000000000000000000
	public static void main(String[] args) {//百元买百鸡
		//int num1= (int) ((100 -1.5 -0.5) / 2.5), num2 = (int) ((100 - 2.5 -0.5) / 1.5), num3 = (int) ((100 - 2.5 -1.5) / 0/5); 
		int num1 = 39, num2 = 64, num3 = 192;
		for (int i = 1; i <= num1; i++) {
			for (int j = 1; j <= num2; j++) {
				for (int k = 1; k <= num3; k++) {
					if (i + j + k == 100 && (i * 2.5 + j * 1.5 + k * 0.5 == 100.0)) {
						System.out.println("百元买百鸡的方案是买"+i+"公鸡,"+j+"母鸡,"+k+"小鸡");
					}
				}
			}
		}
	}
}
