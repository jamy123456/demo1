package facade;

public class Facade {
	
	private SubSystem1 ss1 = new SubSystem1();
	private SubSystem2 ss2 = new SubSystem2();
	private SubSystem3 ss3 = new SubSystem3();
	
	public void method() {
		ss1.method1();
		ss2.method2();
		ss3.method3();
	}
}
