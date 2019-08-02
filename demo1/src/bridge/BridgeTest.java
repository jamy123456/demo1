package bridge;

// 桥接模式测试
public class BridgeTest {
    public static void main(String[] args) {
        // 创建接口的实现类对象
        Implementor implementor = new ConcreteImplementor();
        // 再将实现类对象注入到Abstraction抽象类中成为成员变量,这样就可以顺理成章的调用实现类对象的方法,已达到桥接的作用,
        // 这种方式在许多模式中都得到运用,很好的降低类之间的耦合度
        RefinedAbstraction ra = new RefinedAbstraction(implementor);
        ra.operation();
    }
}
