package singleton;

public class SingletonDemo2 {
    public static void main(String[] args) {
        Singleton2 s1 = Singleton2.getInstance();
        Singleton2 s2 = Singleton2.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}

// 饿汉式单例模式
class Singleton2 {
    private Singleton2(){}

    private final static Singleton2 instance = new Singleton2();

    public static Singleton2 getInstance(){
        return instance;
    }
}
