package sec01.exam05.copy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class HashSetExample {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ù��° �����Ǵ� ���� ������� �ζ� ��ȣ�� ����
		//2~6��°������ �ӽ��� ��÷��ȣ 5���̴�.

			Random number=new Random();
		
			
			for(int i=0;i<6;i++) {
				HashSet<String> lotto=new HashSet<String>();
				
				for(int j=0;lotto.size()<=6;j++) {
					lotto.add(Integer.toString(number.nextInt(45)+1));
				}
				
				List<String> lottoNum=new ArrayList<String>(lotto);
				Collections.sort(lottoNum);
				System.out.println(lottoNum);
			

			}

		Iterator<String> iter=lotto.iterator();
		while(iter.hasNext()) {
			String zz=iter.next();
			if(zz.length()<2) {
				lottoNum.remove(lottoNum.next());
				//Em<String> mm =new Em<String>("0"+zz);
				//System.out.println(mm);
				
				lottoNum.add("0"+zz);
				System.out.println(lottoNum);
		
			
				
				
			}
			
			
		
	}
	}


	
	//integer�� �ƴ� StringŸ�� ��ü�� �ؼ� 01, 02... ��ȯ ��� ���� ��ȯ�� �ʿ� ���� �ϱ�� �ߴ�



}
