package adapter;

// 客户端测试
public class AdapterTest {
	public static void main(String[] args) {
		// 类适配器
		Target adapter = new ClassAdapter();
		adapter.request();
		
		// 对象适配器
		Adaptee adaptee = new Adaptee();
		Target target = new ObjectAdapter(adaptee);
		target.request();
	}

}
