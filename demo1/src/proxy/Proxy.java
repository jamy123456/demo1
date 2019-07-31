package proxy;

//   代理类
public class Proxy implements Subject{
    private RealSubject realSubject;
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
