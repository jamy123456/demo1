package demo1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicateDemo {	
	public static void main(String[] args) {		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(1);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(5);
		list.add(1);
		list.add(1);
		list.add(3);
		list.add(1);
		list.add(8);
		list.add(7);
		list.add(8);
		//removeDuplicate(list);
		removeDuplicate2(list);	
	}
	
	// 普通去重
	public static void removeDuplicate(List<Integer> list) {
		System.out.println("去重前list:"+list.toString());
		for (int i=0; i<list.size()-1; i++) {
			for (int j=i+1; j<list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list.remove(j);
					j--;
				}
			}
		}
		System.out.println("去重后list:"+list.toString());	
	}
	
	// set去重
	public static void removeDuplicate2(List<Integer> list) {
		System.out.println("去重前list:"+list.toString());
		Set<Integer> set = new LinkedHashSet<>();
		for (Integer i : list) {
			set.add(i);
		}
		System.out.println("去重后list:"+set.toString());		
	}
	
	// 倒序删除,但是顺序会有所变化
	public static void removeDuplicate3(List<Integer> list) {
		System.out.println("去重前list:"+list.toString());
		for (int i=list.size()-1; i>=1; i--) {
			for (int j=i-1; j>=0; j--) {
				if (list.get(j) == list.get(i)) {
					list.remove(j);
					i--;
				}
			}			
		}
		System.out.println("去重后list:"+list.toString());	
	}
}
