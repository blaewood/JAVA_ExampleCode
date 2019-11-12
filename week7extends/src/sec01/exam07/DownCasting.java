package sec01.exam07;



import java.util.ArrayList;



class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}

}
class Human extends Animal{

	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	
}

class Tiger extends Animal{

	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
	
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	
}

class Eagle extends Animal{

	@Override
	public void move() {
		
			System.out.println("�������� �ϴ��� ���ϴ�.");
		
	}
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
	
}


public class DownCasting {
	
	ArrayList<Animal> aniList = new ArrayList<Animal>();
	
	public static void main(String[] args) {
		DownCasting aTest = new DownCasting();
		aTest.addAnimal();
		
		System.out.println("���� Ÿ������ �ٿ� ĳ����");
		aTest.testCasting();
		
	}
	
	public void addAnimal() {
		aniList.add(new Human());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		
		for(Animal ani: aniList) {
			ani.move();
		}
	}

	public void testCasting() {
		for(int i=0; i<aniList.size();i++) {
			Animal ani=aniList.get(i);
			
			if(ani instanceof Human) {
				Human h=(Human)ani;
				h.readBook();
			}
			else if(ani instanceof Tiger) {
				Tiger t=(Tiger)ani;
				t.hunting();
			}
			else if(ani instanceof Eagle) {
				Eagle e = (Eagle)ani;
				e.flying();
			}
			else {
				System.out.println("�������� �ʴ� Ÿ���Դϴ�.");
			}
		}
	}
}


