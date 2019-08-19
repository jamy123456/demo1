package prototype.sheep;

/**
 * Created by jamy on 2019-08-13
 */
public class ClientTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep sheep = new Sheep("多利", 1, "白色");
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();
        Sheep sheep6 = (Sheep) sheep.clone();
        Sheep sheep7 = (Sheep) sheep.clone();
        // 可以看出虽然是clone创建的对象,他们的hash值都不相同
        System.out.println("sheep  = "+sheep.hashCode() +"===="+ sheep.toString());
        System.out.println("sheep2 = "+sheep2.hashCode()+"===="+ sheep2.toString());
        System.out.println("sheep3 = "+sheep3.hashCode()+"===="+ sheep3.toString());
        System.out.println("sheep4 = "+sheep4.hashCode()+"===="+ sheep4.toString());
        System.out.println("sheep5 = "+sheep5.hashCode()+"===="+ sheep5.toString());
        System.out.println("sheep6 = "+sheep6.hashCode()+"===="+ sheep6.toString());
        System.out.println("sheep7 = "+sheep7.hashCode()+"===="+ sheep7.toString());
    }
}
