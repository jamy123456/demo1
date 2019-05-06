package demo3;

public class Student {
	private String name;
	private int age;
	private String sex;
	private String phone;
	private String address;
	
	public Student() {}

	public Student(String name, int age, String sex, String phone, String address) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.phone = phone;
		this.address = address;
		
		
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex + ", phone=" + phone + ", address=" + address
				+ "]";
	}
	
	

}
