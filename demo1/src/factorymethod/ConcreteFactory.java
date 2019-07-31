package factorymethod;

public class ConcreteFactory implements AbstractFactory {

	@Override
	public Product newProduct() {
		System.out.println("具体工厂生产具体产品.......");
		return new ConcreteProduct();
	}

}
