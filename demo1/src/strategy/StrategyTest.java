package strategy;

// 策略模式测试
public class StrategyTest {
	public static void main(String[] args) {
		Strategy s1 = new ConcreteStrategyA();
		Context con = new Context();
		con.setStrategy(s1);
		con.strategyMethod();
		System.out.println("=======================================");
		Strategy s2 = new ConcreteStrategyB();
		con.setStrategy(s2);
		con.strategyMethod();
	}
}
