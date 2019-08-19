package prototype;

public class ProtoTypeTest {
	
	public static void main(String[] args) {
		ProtoType protoType = new ProtoType();
		try {
			ProtoType protoType2 = (ProtoType) protoType.clone();
			System.out.println(protoType == protoType2);
			System.out.println("protoType.hashCode = "+ protoType.hashCode());
			System.out.println("protoType2.hashCode = "+ protoType2.hashCode());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}		
	}

}
