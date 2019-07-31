package singleton;

public class SingletonDemo5 {
    public static void main(String[] args) {
        Singleton5 s1 = Singleton5.getInstance();
        Singleton5 s2 = Singleton5.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}

class Singleton5 {
    private static Singleton5 instance;

    private Singleton5(){}

    public static Singleton5 getInstance() {
        if (instance == null) {// 多线程下,这里的同步锁没有意义,因为多个线程都可以进到if里面,可以创建多个不同的实例,违背单例原则
            synchronized (Singleton5.class) {
                instance = new Singleton5();
            }
        }

        return instance;
    }
}
