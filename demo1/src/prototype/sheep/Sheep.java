package prototype.sheep;

/**
 * Created by jamy on 2019-08-13
 */
// 原型模式就是利用其实现Cloneable接口重写clone方法,调用对象的clone方法创建对象
public class Sheep implements Cloneable {
    private String name;
    private int age;
    private String color;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Sheep sheep = null;
        try{
            sheep = (Sheep) super.clone();
        }catch (Exception e){
            e.getStackTrace();
        }
        return sheep;
    }
}
