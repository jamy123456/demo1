package demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class TestDemo {
	public static void main(String[] args) {
		inputStudInfo();
	}
	
	public static void inputStudInfo() {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String name;
		int age;
		String sex;
		String phone;
		String address;
		Collection<Student> col = new ArrayList<Student>();
		Student stu;
		for (int i = 0; i < 3; i++) {
			System.out.println("请输入第"+(i+1)+"位学生姓名:");
			name = scan.next();
			System.out.println("请输入第"+(i+1)+"位学生年龄:");
			age = scan.nextInt();
			System.out.println("请输入第"+(i+1)+"位学生性别:");
			sex = scan.next();
			System.out.println("请输入第"+(i+1)+"位学生电话:");
			phone = scan.next();
			System.out.println("请输入第"+(i+1)+"位学生住址:");
			address = scan.next();
			stu = new Student(name,age,sex,phone,address);
			col.add(stu);			
		}
		Iterator<Student> it = col.iterator();
		while (it.hasNext()) {
			Student student = (Student) it.next();
			System.out.println(student);
		}		 
	}
}
