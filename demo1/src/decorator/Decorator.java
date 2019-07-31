package decorator;

// 装饰者类
class Decorator implements Component{

    private Component component; // 将构建具体角色的对象注入,降低类之间耦合度

    protected Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
