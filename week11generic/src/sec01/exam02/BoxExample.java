package sec01.exam02;

public class BoxExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<String> box=new Box<String>();
		box.set("�����");
		
		String name=box.get();
		System.out.println("name:"+name);
		
		Box<Integer> box2=new Box<Integer>();
		box2.set(1001);
		
		int seq=box2.get();
		System.out.println("seq:"+seq);

	}

}
