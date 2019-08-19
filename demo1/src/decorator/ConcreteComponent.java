package decorator;

// 具体构建角色类
public class ConcreteComponent implements Component{

    public ConcreteComponent(){
        System.out.println("创建具体构建角色");
    }


    @Override
    public void operate() {
        System.out.println("调用具体构建角色的方法operate()");
    }
}
