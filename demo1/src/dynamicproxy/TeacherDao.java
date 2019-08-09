package dynamicproxy;

/**
 * Created by jamy on 2019-08-09
 */
public class TeacherDao implements ITeacher {
    @Override
    public void teach() {
        System.out.println("调用目标方法!!!");
    }
}
