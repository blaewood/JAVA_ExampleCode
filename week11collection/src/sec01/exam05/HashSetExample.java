package sec01.exam05;
//import �κ�
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
//Ŭ���� ����
public class HashSetExample {
	

	//����Ŭ���� �����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("***********�ζ� ��ȣ************");
		/////////////1��° �ζ� ��ȣ////////////////
		//Ŭ����ȣ���� �̿��� ��ü�� �����ϸ� ���߿� ����� ������ �񱳰� ����� �׳� �ߺ� ������ �ߴ�.
		Random number=new Random();
		HashSet<String> lotto1=new HashSet<String>();
		for(int j=0;lotto1.size()<=6;j++) {
			lotto1.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum1=new ArrayList<String>(lotto1);
		Collections.sort(lottoNum1); //�������� ����
		
		
		Iterator<String> iter1=lotto1.iterator(); //���ͷ����� ��ü ����
		while(iter1.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter1.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum1.remove(zz); //�� ��ü ����

				
				lottoNum1.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum1); //�ٽ� �������� ����
		System.out.println("A �ڵ� "+lottoNum1);
		
		///////////////2��° �ζ� ��ȣ/////////////////////
		HashSet<String> lotto2=new HashSet<String>();
		for(int j=0;lotto2.size()<=6;j++) {
			lotto2.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum2=new ArrayList<String>(lotto2);
		Collections.sort(lottoNum2); //�������� ����
		
		
		Iterator<String> iter2=lotto2.iterator(); //���ͷ����� ��ü ����
		while(iter2.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter2.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum2.remove(zz); //�� ��ü ����
//
				//System.out.println(mm);
				
				lottoNum2.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum2); //�ٽ� �������� ����
		System.out.println("B �ڵ� "+lottoNum2);
		
		//////////////3��° �ζ� ��ȣ//////////////////////
		HashSet<String> lotto3=new HashSet<String>();
		for(int j=0;lotto3.size()<=6;j++) {
			lotto3.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum3=new ArrayList<String>(lotto3);
		Collections.sort(lottoNum3); //�������� ����
		
		
		Iterator<String> iter3=lotto3.iterator(); //���ͷ����� ��ü ����
		while(iter3.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter3.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum3.remove(zz); //�� ��ü ����
//
				//System.out.println(mm);
				
				lottoNum3.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum3); //�ٽ� �������� ����
		System.out.println("C �ڵ� "+lottoNum3);
		
		///////////////4��° �ζ� ��ȣ/////////////////////
		HashSet<String> lotto4=new HashSet<String>();
		for(int j=0;lotto4.size()<=6;j++) {
			lotto4.add(Integer.toString(number.nextInt(45)+1));
		}
		
		List<String> lottoNum4=new ArrayList<String>(lotto4);
		Collections.sort(lottoNum4); //�������� ����
		
		
		Iterator<String> iter4=lotto4.iterator(); //���ͷ����� ��ü ����
		while(iter4.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter4.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum4.remove(zz); //�� ��ü ����
//
				//System.out.println(mm);
				
				lottoNum4.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum4); //�ٽ� �������� ����
		System.out.println("D �ڵ� "+lottoNum4);
		
		//////////////5��° �ζ� ��ȣ//////////////////////
		HashSet<String> lotto5=new HashSet<String>();
		for(int j=0;lotto5.size()<=6;j++) {
			lotto5.add(Integer.toString(number.nextInt(45)+1));
		}
		
		
		List<String> lottoNum5=new ArrayList<String>(lotto5);
		Collections.sort(lottoNum5); //�������� ����
		
		
		
		Iterator<String> iter5=lotto5.iterator(); //���ͷ����� ��ü ����
		while(iter5.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter5.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum5.remove(zz); //�� ��ü ����
//
				//System.out.println(mm);
				
				lottoNum5.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum5); //�ٽ� �������� ����
		System.out.println("E �ڵ� "+lottoNum5);
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("***********��÷ ��ȣ************");
		Random number2=new Random();
		HashSet<String> lotto=new HashSet<String>();
		for(int j=0;lotto.size()<=6;j++) {
			lotto.add(Integer.toString(number2.nextInt(45)+1));
		}
		
		
		List<String> lottoNum=new ArrayList<String>(lotto);
		Collections.sort(lottoNum); //�������� ����
		
		
		Iterator<String> iter=lotto.iterator(); //���ͷ����� ��ü ����
		while(iter.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
			String zz=iter.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
			if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
				lottoNum.remove(zz); //�� ��ü ����
//
				//System.out.println(mm);
				
				lottoNum.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
			}
	}
		Collections.sort(lottoNum); //�ٽ� �������� ����
		System.out.println(lottoNum);

		
		System.out.println("***********��÷ ����************");
		//equals�����ڸ� �̿��Ͽ� �ּڰ��� �ƴ� ��ü�� ������ ���ϴ� ����
		if(lottoNum.equals(lottoNum1)) {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
		if(lottoNum.equals(lottoNum2)) {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
		if(lottoNum.equals(lottoNum3)) {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
		if(lottoNum.equals(lottoNum4)) {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
		if(lottoNum.equals(lottoNum5)) {
			System.out.println("��÷�Ǿ����ϴ� �����մϴ�.");
		}
		else {
			System.out.println("��÷���� �ʾҽ��ϴ�.");
		}
		
	
		
		
		//ù��° �����Ǵ� ���� ������� �ζ� ��ȣ�� ����
		//2~6��°������ �ӽ��� ��÷��ȣ 5���̴�.
		
 
	}
	
	/*public class Em<T> {
		private String em;

		Em(String em){
			this.em=em;

		}
		
		public String toString() {
			return em;
		}

	}


	
	//integer�� �ƴ� StringŸ�� ��ü�� �ؼ� 01, 02... ��ȯ ��� ���� ��ȯ�� �ʿ� ���� �ϱ�� �ߴ�
	public static void lotto_generator(int n) {
		Random number=new Random(); //���� ��ü number ����
	
		
		for(int i=0;i<n;i++) { //n=6�� ���ԵǾ� 7ĭ¥�� ��ü 6�� ����
			HashSet<String> lotto=new HashSet<String>();
			
			for(int j=0;lotto.size()<=6;j++) {
				lotto.add(Integer.toString(number.nextInt(45)+1));
			}
			
			List<String> lottoNum=new ArrayList<String>(lotto);
			Collections.sort(lottoNum); //�������� ����
	

			
			

		
		///////////////////////////////////////////
		//�ζ� ��ȣ ���� �Ϸ�
		///////////////////////////////////////////
		
			Iterator<String> iter=lotto.iterator(); //���ͷ����� ��ü ����
			while(iter.hasNext()) { //���� ��ü�� �ִ� ���� ��� �ݺ�
				String zz=iter.next(); //zz ���ڿ��� ���� ��ü�� �޾ƿ´�
				if(zz.length()<2) { //ũ�Ⱑ 2���� ������=1�ڸ��̸�
					lottoNum.remove(zz); //�� ��ü ����
	//
					//System.out.println(mm);
					
					lottoNum.add("0"+zz); //�� ��ü �տ� 0�� �����ִ� ����
				}
		}
			Collections.sort(lottoNum); //�ٽ� �������� ����
			
			//int cnt=0;
			//List<String> lottoNumX=new ArrayList<String>(lottoNum);
			//lottoNumX=lottoNum;
			//cnt++;
			System.out.println(lottoNum); //���
			
			//////////////////////////////////////////////////////////
			//////////��÷��ȣ�� �ζǹ�ȣ �� ���� �κ�/////////////
			
			
			
			
			
			
			
			
			
			
		}
	}*/
	


	
	
	
	

}
