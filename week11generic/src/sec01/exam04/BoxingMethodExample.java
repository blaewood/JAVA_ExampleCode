package sec01.exam04;

public class BoxingMethodExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> box1=Util.<Integer>boxing(100);
		int intValue=box1.get();
		System.out.println("intValune:"+intValue);
		
		Box<String> box2=Util.boxing("º’»ÔπŒ");
		int strValue=box2.get();
		System.out.println("strValune:"+strValue);

	}

}
