package state;

public class Context {

    private State state;

    // 初始化状态
    public Context(){
        state = new ConcreteStateA();
    }

    // 设置新状态
    public void setState(State state){
        this.state = state;
    }

    // 读取状态
    public State getState(){
        return state;
    }

    // 对请求做处理
    public void handle(){
        state.handle(this);
    }

}
