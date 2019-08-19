package command;

public class CommandTest {

    public static void main(String[] args) {
        Command command = new ConcreteCommand();
        Invoker invoker = new Invoker(command);
        System.out.println("客户访问调用者的方法call()");
        invoker.call();
    }
}
