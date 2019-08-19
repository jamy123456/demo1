package demo1;

public class SingletonDemo3 {
    public static void main(String[] args) {
        Singleton3 s1 = Singleton3.getInstance();
        Singleton3 s2 = Singleton3.getInstance();
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}

// 懒汉式单例模式,但是这种在多线程下是不安全的,在一个线程刚刚执行完if条件还未创建实例时候,另一个线程也判断进来,这是会产生多个实例
class Singleton3 {
    private static  Singleton3 instance;
    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null){
            instance = new Singleton3();
        }
        return instance;
    }
}

