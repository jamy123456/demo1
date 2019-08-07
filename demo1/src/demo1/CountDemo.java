package demo1;

public class CountDemo {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i<10; i++) {
            count = count++;
        }
        // 我们预估的结果是10,但是实际结果却是0,这是为什么?
        //其实是这样的,count = count++;这一步可以看作这样,首先count把的值赋值给一个临时变量temp,然后count自增1,
        // 最后把临时变量的值重新赋值给count,虽然中间过程count的值确实变成了1,但是最终又重置为0,所以不管循环多少次,最后的结果都是0
        System.out.println(count);
    }
}
