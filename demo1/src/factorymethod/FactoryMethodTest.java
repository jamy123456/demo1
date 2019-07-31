package factorymethod;

public class FactoryMethodTest {
	public static void main(String[] args) {
		AbstractFactory  af = new ConcreteFactory();
		Product product = af.newProduct();
		product.show();
	}

}
