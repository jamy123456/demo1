package demo2;

import java.util.Scanner;

public class CalArea {
	public static void main(String[] args) {
		Rectangle angle = new Rectangle();		
		Scanner scan = new Scanner(System.in);
		cal(scan, angle);		
	}
	
	public static void cal(Scanner scan, Rectangle angle) {
		System.out.println("请输入长方形的长或宽:");		
		angle.setLen1(scan.nextInt());
		System.out.println("请输入长方形的长或宽:");
		angle.setLen2(scan.nextInt());
		int s = angle.calArea(angle.getLen1(), angle.getLen2());
		if (s == 0) {
			System.out.println("长或宽的值不合法,无法计算长方形的面积!!!");
		}else {
			System.out.println("长方形的面积为:" + s);
		}
	}
}
