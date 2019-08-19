package builder;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }
    // 产品的构建与组装
    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
