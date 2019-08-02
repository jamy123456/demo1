package command;

public class ConcreteCommand implements Command{
    private Receiver receiver;

    ConcreteCommand(){
        receiver = new Receiver();
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
