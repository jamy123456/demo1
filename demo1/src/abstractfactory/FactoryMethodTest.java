package abstractfactory;

public class FactoryMethodTest {
	public static void main(String[] args) {
		AbstractFactory  af = new ConcreteFactory();
		Product product1 = af.newProduct1();
		Product product2 = af.newProduct2();
		product1.show();
		product2.show();
	}

}
