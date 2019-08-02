package bridge;

public class RefinedAbstraction extends Abstraction {

    protected RefinedAbstraction(Implementor implementor){
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("具体扩展角色被访问!.....");
        implementor.operationimpl();
    }
}
