package demo1;

public class MonkeyEatPeach {
	public static void main(String[] args) {//有一堆桃子,猴子每天吃一半多一个直到第十天只有一个桃子了,求原来有多少桃子?
		int m = 1;
		for (int i = 9; i >= 1; i--) {
			m = (m + 1) * 2;
		}
		System.out.println("原来一共有"+m+"个桃子");	
	}
}
