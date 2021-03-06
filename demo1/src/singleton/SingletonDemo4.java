package singleton;

public class SingletonDemo4 {
    public static void main(String[] args) {
        Singleton4 s1 = Singleton4.getInstance();
        Singleton4 s2 = Singleton4.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}
// 懒汉式单例,双重效验,这种方式创建不仅效率高而且是多线程安全的
class Singleton4 {
    // volatile关键字,可以让所有线程都能看到共享内存的最新状态
    private static volatile Singleton4 instance;

    private Singleton4(){}

    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}
