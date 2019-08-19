package demo1;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by jamy on 2019-08-12
 */
public class StreamDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(6);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(7);
        Stream<Integer> stream = list.stream();
        /*Optional op = stream.max((o1, o2) -> o1.compareTo(o2));
        System.out.println(op);
        Optional op2 = stream.min((o1, o2) -> o1.compareTo(o2));
        System.out.println(op2);*/
        boolean b = stream.allMatch((i) -> i > 5);
        System.out.println(b);

    }
}
