package demo1;

/**
 * Created by jamy on 2019-08-07
 */
public class ObjectDemo2 {
    private static int j = 1;

    static {
        i = 100;
        j = 100;
    }

    private static int i = 1;

    // 静态变量不管放在那里,随着类的加载首先被声明,然后按顺序赋值
    // 静态块里的赋值并不会报错,赋值时,静态变量已经先声明了,
    // 过程是这样: 先声明静态变量i,然后给i赋值100,最后给赋值1
    public static void main(String[] args) {
        System.out.println("i = "+i+",j = "+ j);
    }
}
