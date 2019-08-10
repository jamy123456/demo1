package dynamicproxy;




import java.lang.reflect.Proxy;

/**
 * Created by jamy on 2019-08-09
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target){
        this.target = target;
    }

    // 获取代理对象
    public Object getProxyInstance(){
        /*return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
                new InvocationHandler(){
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object value = method.invoke(target, args);
                        System.out.println("jdk动态代理开始:");
                        return value;
                    }
                });*/
        // 上面用的是匿名内部类形式写的,底下这里使用lambda表达式,效果都一样
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> method.invoke(target, args));
    }

}
