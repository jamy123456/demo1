package decorator;

// 具体装饰者类
public class ConcreteDecorator extends Decorator{

    public ConcreteDecorator(Component component){
        super(component);
    }


    @Override
    public void operate() {
        super.operate();
        addMethod();
    }

    public void addMethod(){
        System.out.println("调用额外增加的方法");
    }

}
