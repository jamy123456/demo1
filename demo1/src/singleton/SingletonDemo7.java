package singleton;

// 利用枚举类来创建单例
public class SingletonDemo7 {
    public static void main(String[] args) {
        System.out.println("枚举类创建单例");
        Singleton7 s1 = Singleton7.INSTANCE;
        Singleton7 s2 = Singleton7.INSTANCE;
        System.out.println(s1 == s2);
        System.out.println("s1.hashCode ="+ s1.hashCode());
        System.out.println("s2.hashCode ="+ s2.hashCode());
    }
}

enum Singleton7 {
    INSTANCE;
}
