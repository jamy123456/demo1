package demo1;

import java.util.ArrayList;
import java.util.List;

public class SpiltNum {
	public static void main(String[] args) {
		int num = 135;
		int i = 0;
		List<Integer> list = new ArrayList<>();
		System.out.print(num+"可以拆分为:");
		while (num > 0) {
			i = num % 10;
			num /= 10;
			list.add(i);			
		}
		for (int j = list.size() - 1; j >= 0; j-- ) {
			System.out.print(list.get(j)+" ");
		}
	}
}
