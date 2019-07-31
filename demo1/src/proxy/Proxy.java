package proxy;

//   代理类
public class Proxy implements Subject{
    private RealSubject realSubject;
    // 不影响被代理类的情况下,实现了被代理类方法的集成和代理类的方法扩展,这是基于代理类和被代理类都必须实现共同的接口
    @Override
    public void request() {
        if (realSubject == null){
            realSubject = new RealSubject();
        }
        preRequest();
        realSubject.request();
        postRequest();
    }

    public void preRequest(){
        System.out.println("预处理之前的处理");
    }

    public void postRequest(){
        System.out.println("预处理的后续处理");
    }

}
