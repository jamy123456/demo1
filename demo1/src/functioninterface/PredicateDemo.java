package functioninterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Predicate断言型接口
public class PredicateDemo {
    @Test
    public void test() {
        List<String> list = Arrays.asList("Jamy", "Tom", "rebert", "lucy", "Lily", "Andy");
        List<String> list2 = filterStr(list, (str) -> str.length() > 3);
        System.out.println(list2);
    }

    public List<String> filterStr(List<String> list, Predicate<String> pre) {
        List<String> strList = new ArrayList<>();
        for (String str : list) {
            if (pre.test(str)) {
                strList.add(str);
            }
        }
        return strList;
    }
}
