package functioninterface;

import org.junit.Test;

import java.util.function.Function;
//Function函数型接口
public class FunctionDemo {
    @Test
    public void testFunction() {
        String newStr = handleString("123456789", (str) -> str.substring(0, 5));
        System.out.println(newStr);
    }

    public String handleString(String str, Function<String, String> fun) {
        return fun.apply(str);
    }

}
