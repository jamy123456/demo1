package demo1;

public class SingletonDemo1 {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}

// 饿汉式单例模式
class Singleton {
    Singleton(){}

    static {
        instance = new Singleton();
    }

    private static Singleton instance;

    static Singleton getInstance(){
        return instance;
    }
}
