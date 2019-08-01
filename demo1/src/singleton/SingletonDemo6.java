package singleton;

// 利用静态内部类来创建单例
public class SingletonDemo6 {
    public static void main(String[] args) {
        Singleton6 s1 = Singleton6.getInstance();
        Singleton6 s2 = Singleton6.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}

class Singleton6 {
    private Singleton6(){}

    private static class SingletonInstance {
        private static final Singleton6 instance = new Singleton6();
    }

    public static Singleton6 getInstance() {
        return SingletonInstance.instance;
    }
}