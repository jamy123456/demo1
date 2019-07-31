package decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operate();
        System.out.println("==============================================");
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(component);
        concreteDecorator.operate();
    }
}
