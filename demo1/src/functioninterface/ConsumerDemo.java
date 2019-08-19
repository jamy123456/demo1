package functioninterface;

import org.junit.Test;

import java.util.function.Consumer;
//Consumer消费型接口
public class ConsumerDemo {
    @Test
    public void Test() {
        setInfo(100, (i) -> System.out.println("jamy在超市消费了"+i+"美元"));
    }

    public void  setInfo(Integer i, Consumer<Integer> con)  {
        con.accept(i);
    }

}
