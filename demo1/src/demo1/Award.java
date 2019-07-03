package demo1;

public class Award {
    //1234500000000000000000000000000000000000
	public static void main(String[] args) {
		//别人的修改
		int yearNum = 7;
		if (yearNum >= 8) {
			//00000000000000000000000000000000000000
			System.out.println("年终奖为30000");
		}else if (yearNum >= 5) {
			System.out.println("年终奖为10000");
		}else if (yearNum >= 3) {
			System.out.println("年终奖为5000");
		}else if (yearNum >= 1) {
			System.out.println("年终奖为1000");
		}
	}
}
