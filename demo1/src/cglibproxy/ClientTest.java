package cglibproxy;

/**
 * Created by jamy on 2019-08-12
 */
public class ClientTest {
    public static void main(String[] args) {
        // 创建目标对象
        TeacterDao teacterDao = new TeacterDao();

        // 获取代理对象
        TeacterDao proxyInstance = (TeacterDao) new ProxyFactory(teacterDao).getProxyInstance();

        // 代理对象执行目标对象方法
        proxyInstance.teach();
    }
}
