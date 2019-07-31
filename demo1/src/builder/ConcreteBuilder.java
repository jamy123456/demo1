package builder;

public class ConcreteBuilder extends Builder{

    @Override
    public void buildPartA() {
        product.setPartA("建造part");
    }

    @Override
    public void buildPartB() {
        product.setPartB("建造partB");

    }

    @Override
    public void buildPartC() {
        product.setPartC("建造partC");
    }
}
