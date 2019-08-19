package prototype;

public class ProtoType implements Cloneable{
	
	ProtoType(){
		System.out.println("原型对象创建成功!");
	}
	
	public Object clone() throws CloneNotSupportedException{
		System.out.println("原型对象复制成功!");
		return super.clone();		
	}

}
