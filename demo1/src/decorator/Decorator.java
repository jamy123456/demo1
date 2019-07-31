package decorator;

// 装饰者类
class Decorator implements Component{

    private Component component;

    protected Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();

    }
}
