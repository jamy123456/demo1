package abstractfactory;

// 由此可以看出抽象工厂模式工厂方法模式的升级版,它里面生产不同产品的方法不同
public class ConcreteFactory implements AbstractFactory {

	@Override
	public Product newProduct1() {
		System.out.println("具体工厂生产具体产品1.......");
		return new ConcreteProduct1();
	}

	@Override
	public Product newProduct2() {
		System.out.println("具体工厂生产具体产品2.......");
		return new ConcreteProduct2();
	}

}
