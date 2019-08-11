package functioninterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

//Supplier供给者接口
public class SupplierDemo {
    @Test
    public void test() {
        System.out.println(getList(10, () -> (int)(Math.random() * 100)));
    }

    public List<Integer> getList(int m, Supplier<Integer> sup) {
        List<Integer> list = new ArrayList<>();
        for (int i=0; i<m; i++) {
            list.add(sup.get());
        }
        return list;
    }

}
