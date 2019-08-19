package proxy;

// 被代理的类
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("访问真实的主题");
    }
}
