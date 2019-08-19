package demo1;

/**
 * Created by jamy on 2019-08-07
 */
public class ObjectDemo {

    // 加载类的时候会执行静态代码块;
    // new创建对象的时候:有构造代码块,先执行构造代码块,然后再执行构造方法(构造方法的最前端被编译器插入了构造代码块)

    public ObjectDemo(){
        System.out.println("执行构造方法!!!");
    }

    public static void main(String[] args) {
        ObjectDemo od = new ObjectDemo();
    }

    static {
        System.out.println("执行静态代码块!!!");
    }

    {
        System.out.println("执行构造代码块!!!");
    }
}
