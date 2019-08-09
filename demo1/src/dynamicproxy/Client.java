package dynamicproxy;

/**
 * Created by jamy on 2019-08-09
 */
public class Client {
    public static void main(String[] args) {
        // 创建目标对象
        ITeacher target = new TeacherDao();
        // 创建代理对象
        ITeacher proxy = (ITeacher) new ProxyFactory(target).getProxyInstance();
        proxy.teach();
    }
}
