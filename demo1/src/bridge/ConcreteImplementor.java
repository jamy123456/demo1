package bridge;

public class ConcreteImplementor implements Implementor {

    @Override
    public void operationimpl() {
        System.out.println("具体实现化角色被访问!....");
    }
}
